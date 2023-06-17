import java.util.ArrayList;

public class Playlist {
    private String name;
    private ArrayList<Song> songList;
    static int playlistCount = 0;

    /**
     * Constructor method for playlists
     * 
     * @param name - name of the playlist
     */
    public Playlist(String name) {
        this.name = name;
        this.songList = new ArrayList<>();
        playlistCount++;
    }

    /**
     * Adds songs to playlist
     * 
     * @param song - song to be added to playlist
     */
    public void addSong(Song song) {
        songList.add(song);
    }

    /**
     * getter for name
     * 
     * @return name - name of the playlist
     */
    public String getName() {
        return name;
    }

    /**
     * getter for songList
     * 
     * @return songList - list of songs in the playlist
     */
    public ArrayList<Song> getSongList() {
        return songList;
    }
}
