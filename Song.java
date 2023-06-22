import java.util.ArrayList;

/**
 * Represents a song with its title, artist, genre, and lyrics.
 */
public class Song {
    private String title;
    private String artist;
    private String genre;
    private ArrayList<String> lyrics;

    /**
     * Constructs a Song object with the specified title, artist, genre, and lyrics.
     *
     * @param title  the title of the song
     * @param artist the artist of the song
     * @param genre  the genre of the song
     * @param lyrics the lyrics of the song
     */
    public Song(String title, String artist, String genre, ArrayList<String> lyrics) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.lyrics = lyrics;
    }

    /**
     * Retrieves the title of the song.
     *
     * @return the title of the song
     */
    public String getTitle() {
         return title;
    }

    /**
     * Retrieves the artist of the song.
     *
     * @return the artist of the song
     */
    public String getArtist() {
         return artist;
    }

    /**
     * Retrieves the genre of the song.
     *
     * @return the genre of the song
     */
    public String getGenre() {
         return genre;
    }
    /**
     * Retrieves the lyrics of the song.
     *
     * @return the lyrics of the song
     */
    public ArrayList<String> getLyrics() {
        return lyrics;
    }
    /**
     * Calculates and retrieves the play time of the song.
     * The play time is calculated as the sum of the lengths of all lyrics divided by 2.
     *
     * @return the play time of the song
     */
    public float getPlayTime() {
        int i;
        float playTime = 0;

        for(i = 0; i < lyrics.size(); i++) {
            playTime += lyrics.get(i).length();
        }
        playTime /= 2;
        return playTime;
    }

}
