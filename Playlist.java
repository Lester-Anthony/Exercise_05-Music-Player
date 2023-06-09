public class Playlist {
    private String name;
    private Song[] songList;

    public Playlist(String name) {
        this.name = name;
    }

    public void addSong(Song song) {
        // Implement this
    }

    public String getName() {
        return name;
    }

    public Song[] getSongList() {
        return songList;
    }
}
