import java.util.ArrayList;

public class MusicPlayer {
    private String deviceName;
    private ArrayList<Song> songList;
    private ArrayList<Playlist> playlistList;
    

    public MusicPlayer(String deviceName) {
        this.deviceName = deviceName;
        this.songList = new ArrayList<>();
        this.playlistList = new ArrayList<>();
    }

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

    public void addSong(Song song) {
        songList.add(song);
    }

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
