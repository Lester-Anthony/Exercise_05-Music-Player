import java.util.ArrayList;

/**
 * The Playlist class represents a playlist containing songs.
 */
public class Playlist {
    private String name;
    private ArrayList<Song> songList;
    static int playlistCount = 0;

    /**
     * Constructs a Playlist object with the specified name.
     *
     * @param name the name of the playlist
     */
    public Playlist(String name) {
        this.name = name;
        this.songList = new ArrayList<>();
        playlistCount++;
    }

    /**
     * Adds a song to the playlist.
     *
     * @param song the song to be added to the playlist
     */
    public void addSong(Song song) {
        songList.add(song);
    }

    /**
     * Retrieves the name of the playlist.
     *
     * @return the name of the playlist
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves the list of songs in the playlist.
     *
     * @return the list of songs in the playlist
     */
    public ArrayList<Song> getSongList() {
        return songList;
    }
}
