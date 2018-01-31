package by.itacademy.task1;

import java.util.*;

public class Catalogue {
    private Map<String, HashMap<String, HashSet<Track>>> artists;

    public Catalogue() {
        artists = new HashMap<>();
    }

    public void addArtist(String nameOfArtist, HashMap<String, HashSet<Track>> albums){
        artists.put(nameOfArtist, albums);
    }
    public void addAlbum(String nameOfArtist, String nameOfAlbum, Set<Track> files){
        artists.get(nameOfArtist).put(nameOfAlbum, (HashSet<Track>) files);
    }
    public void addSong(String nameOfArtist, String nameOfAlbum, Track musicFile){
        artists.get(nameOfArtist).get(nameOfAlbum).add(musicFile);
    }

    public Map<String, HashMap<String, HashSet<Track>>> getArtists(){
        return artists;
    }

    public String print() {
        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append("Artist:\n");
        for(String artist: artists.keySet()){
            stringBuilder.append(artist + ":\n");
            for(String album : artists.get(artist).keySet()){
                stringBuilder.append("\tAlbum: " + album + "\n\tSong: \n");
                Iterator<Track> iterator = artists.get(artist).get(album).iterator();
                while (iterator.hasNext()){
                    stringBuilder.append("\t" + iterator.next().toString() + "\n");
                }
            }
            stringBuilder.append("#################################################\n");
        }
        return stringBuilder.toString();
    }
}
