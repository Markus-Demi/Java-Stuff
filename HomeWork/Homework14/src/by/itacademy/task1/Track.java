package by.itacademy.task1;

public class Track {
    private String trackName;
    private long length;
    private String path;
    private String checkSum;

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getCheckSum() {
        return checkSum;
    }

    public void setCheckSum(String checkSum) {
        this.checkSum = checkSum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Track)) return false;

        Track musicFile = (Track) o;

        if (getLength() != musicFile.getLength()) return false;
        return getTrackName() != null ? getTrackName().equals(musicFile.getTrackName()) : musicFile.getTrackName() == null;
    }

    @Override
    public String toString() {
        return "Track\n" +
                "\ttrack name: " + trackName + "\n" +
                "\tlength: " + length + "\n" +
                "\tpath: " + path + "\n" +
                "\tchecksum: " + checkSum;
    }

    @Override
    public int hashCode() {
        int result = getTrackName() != null ? getTrackName().hashCode() : 0;
        result = 31 * result + (int) (getLength() ^ (getLength() >>> 32));
        result = 31 * result + (getPath() != null ? getPath().hashCode() : 0);
        return result;
    }
}
