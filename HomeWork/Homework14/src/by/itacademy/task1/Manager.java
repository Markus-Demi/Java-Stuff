package by.itacademy.task1;

import com.mpatric.mp3agic.ID3v1;
import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.Mp3File;
import com.mpatric.mp3agic.UnsupportedTagException;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Manager {
    private File dir;
    private List<File> mp3Files = new ArrayList<>();
    private Catalogue musicCatalog = new Catalogue();
    protected Map<String, ArrayList<String>> repeatsByCheckSum = new HashMap<>();
    protected Map<String, ArrayList<String>> repeatsByName = new HashMap<>();

    public Manager(String path) {
        this.dir = new File(path);
        searchMp3(dir);
    }

    public void searchMp3(File directory) {
        for (File item : directory.listFiles()) {
            if (item.isDirectory()) {
                searchMp3(item);
            } else if (item.isFile()) {
                Pattern pattern = Pattern.compile("\\.mp3$");
                Matcher matcher = pattern.matcher(item.getName());
                if (matcher.find()) {
                    mp3Files.add(item);
                }
            }
        }
    }

    public void parseMp3() throws IOException, UnsupportedTagException {
        try {
            for (File file : mp3Files) {

                Mp3File mp3File = new Mp3File(file);

                String artistName;
                String albumName;
                String title;
                Long length;

                if (mp3File.hasId3v1Tag()) {
                    ID3v1 id3v1Tag = mp3File.getId3v1Tag();
                    artistName = id3v1Tag.getArtist();
                    albumName = id3v1Tag.getAlbum();
                    title = id3v1Tag.getTitle();
                } else {
                    artistName = "Unknown artist";
                    albumName = "Unknown album";
                    title = "Unknown track";
                }
                Track musicFile = new Track();
                try {
                    musicFile.setCheckSum(getCheckSum(mp3File.getFilename()));
                } catch (NoSuchAlgorithmException ex) {
                    ex.toString();
                } catch (IOException ex) {
                    ex.toString();
                }
                length = mp3File.getLengthInSeconds();
                musicFile.setTrackName(title);
                musicFile.setLength(length);
                musicFile.setPath(mp3File.getFilename());

                repeat(musicFile, artistName, albumName);

                createMusicCatalog(artistName, albumName, musicFile);
            }
        } catch (InvalidDataException e) {
        }
        System.out.println(musicCatalog.print());
    }

    public void createMusicCatalog(String nameOfArtist, String nameOfAlbum, Track musicFile) {
        if (!musicCatalog.getArtists().containsKey(nameOfArtist)) {
            createArtist(nameOfArtist, nameOfAlbum, musicFile);
        }
        if (!musicCatalog.getArtists().get(nameOfArtist).containsKey(nameOfAlbum)) {
            Set<Track> files = new HashSet<>();
            files.add(musicFile);
            musicCatalog.addAlbum(nameOfArtist, nameOfAlbum, files);
        }
        if (musicCatalog.getArtists().containsKey(nameOfArtist)) {
            if (musicCatalog.getArtists().get(nameOfArtist).containsKey(nameOfAlbum)) {
                musicCatalog.addSong(nameOfArtist, nameOfAlbum, musicFile);
            } else {
                HashSet<Track> file = new HashSet<>();
                file.add(musicFile);
                musicCatalog.addAlbum(nameOfArtist, nameOfAlbum, file);
            }
        }
    }

    public void createArtist(String nameOfArtist, String nameOfAlbum, Track musicFile) {
        Map<String, HashSet<Track>> newAlbum = new HashMap<>();
        Set<Track> newSongs = new HashSet<>();
        newSongs.add(musicFile);
        newAlbum.put(nameOfAlbum, (HashSet<Track>) newSongs);
        musicCatalog.addArtist(nameOfArtist, (HashMap<String, HashSet<Track>>) newAlbum);
    }

    public String getCheckSum(String fileName) throws NoSuchAlgorithmException, IOException {
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        FileInputStream fis = new FileInputStream(fileName);
        byte[] dataBytes = new byte[2048];
        int bytesRead;

        while ((bytesRead = fis.read(dataBytes)) > 0) {
            md.update(dataBytes, 0, bytesRead);
        }

        byte[] mdBytes = md.digest();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < mdBytes.length; i++) {
            stringBuilder.append(Integer.toString((mdBytes[i] & 0xff) + 0x100, 16)
                    .substring(1));
        }
        return stringBuilder.toString();
    }

    public void repeat(Track musicFile, String nameOfArtist, String nameOfAlbum) {
        Map<String, HashMap<String, HashSet<Track>>> bufferCollection = musicCatalog.getArtists();
        for (String artist : bufferCollection.keySet()) {
            for (String album : bufferCollection.get(artist).keySet()) {
                for (Track track : bufferCollection.get(artist).get(album)) {
                    if (track.getCheckSum().equals(musicFile.getCheckSum())) {
                        checkRepeatByCheckSum(musicFile, nameOfArtist, nameOfAlbum);
                    }
                    if (track.equals(musicFile)) {
                        checkRepeatByName(musicFile, nameOfArtist, nameOfAlbum);
                    }
                }
            }
        }
    }

    public void checkRepeatByCheckSum(Track musicFile, String nameOfArtist, String nameOfAlbum) {
        String keyName = nameOfArtist + " " + nameOfAlbum + " " + musicFile.getTrackName();
        if (repeatsByCheckSum.containsKey(keyName)) {
            if (!repeatsByCheckSum.get(keyName).contains(musicFile.getPath())) {
                repeatsByCheckSum.get(keyName).add(musicFile.getPath());
            }
        } else {
            List<String> files = new ArrayList<>();
            files.add(musicFile.getPath());
            repeatsByCheckSum.put(keyName, (ArrayList<String>) files);
        }
    }

    public void checkRepeatByName(Track musicFile, String nameOfArtist, String nameOfAlbum) {
        String keyName = nameOfArtist + " " + nameOfAlbum + " " + musicFile.getTrackName();
        if (repeatsByName.containsKey(keyName)) {
            if (!repeatsByName.get(keyName).contains(musicFile.getPath())) {
                repeatsByName.get(keyName).add(musicFile.getPath());
            }
        } else {
            List<String> files = new ArrayList<>();
            files.add(musicFile.getPath());
            repeatsByName.put(keyName, (ArrayList<String>) files);
        }
    }

    public String getDuplicates(HashMap<String, ArrayList<String>> repeats) {
        StringBuilder stringBuilder = new StringBuilder("");
        for (String s : repeats.keySet()) {
            stringBuilder.append(s + "\n");
            for (String path : repeats.get(s)) {
                stringBuilder.append("Path: " + path + "\n");
            }
            stringBuilder.append("#################################################\n");
        }
        return stringBuilder.toString();
    }
}
