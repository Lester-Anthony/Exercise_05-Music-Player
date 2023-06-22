import java.util.ArrayList;

/**
 * The MusicPlayer class represents a music player device that can play songs and playlists.
 */
public class MusicPlayer {
    private String deviceName;
    private ArrayList<Song> songList;
    private ArrayList<Playlist> playlistList;
    
    /**
     * Constructs a MusicPlayer object with the specified device name.
     *
     * @param deviceName the name of the music player device
     */
    public MusicPlayer(String deviceName) {
        this.deviceName = deviceName;
        this.songList = new ArrayList<>();
        this.playlistList = new ArrayList<>();
    }

    /**
     * Creates a new playlist with the given name and adds it to the music player.
     *
     * @param name the name of the playlist
     * @return true if the playlist was successfully created and added, false otherwise
     */
    public boolean createPlaylist(String name) {
        if(Playlist.playlistCount < 5) {
            Playlist playlist = new Playlist(name);
            playlistList.add(playlist);
            return true;
        }
        else{
            System.out.println("You cannot have more than 5 playlists.");
            return false;
        }
    }

    /**
     * Adds a song to the music player's song list.
     *
     * @param song the song to be added
     */
    public void addSong(Song song) {
        songList.add(song);
    }

    /**
     * Adds a song from the music player's song list to a playlist.
     *
     * @param songIndex     the index of the song in the song list
     * @param playlistIndex the index of the playlist in the playlist list
     */
    public void addSong(int songIndex, int playlistIndex) {
        if (songIndex >= 0 && songIndex < songList.size() &&
            playlistIndex >= 0 && playlistIndex < playlistList.size()) {
                Song song = songList.get(songIndex);
                Playlist playlist = playlistList.get(playlistIndex);

                playlist.addSong(song);
            }
        else 
            System.out.println("Invalid song index.");
    }

    /**
     * Plays a song from the music player's song list.
     *
     * @param index the index of the song in the song list
     */
    public void playSong(int index) {
        if(index >= 0 && index < songList.size()) {
            Song song = songList.get(index);
            System.out.println(deviceName + " is now playing " + song.getTitle() + "...");
            System.out.println("Song by " + song.getArtist());
            System.out.println("Genre: " + song.getGenre() + " | Play time: " + song.getPlayTime());
            System.out.println("==========");
            
            for(String line : song.getLyrics()) {
                System.out.println(line);
            }
            
            System.out.println("\n");
        }
    }

    /**
     * Plays a playlist from the music player's playlist list.
     *
     * @param index the index of the playlist in the playlist list
     */
    public void playPlaylist(int index) {
        if(index >= 0 && index < playlistList.size()) {
            Playlist playlist = playlistList.get(index);

            ArrayList<Song> songs = playlist.getSongList();
            System.out.println(deviceName + " is now playing " + playlist.getName() + "...\n");

            for(Song song : songs) {
                if(song != null) {
                    System.out.println(song.getTitle() + " by " + song.getArtist());
                    System.out.println("Genre: " + song.getGenre() + " | Play time: " + song.getPlayTime());
                    System.out.println("==========");
                    
                    for(String line : song.getLyrics()) {
                        System.out.println(line);
                    }

                    System.out.println("\n");
                }
            }
        }

        else
            System.out.println("Invalid playlist index.");
    }
}
