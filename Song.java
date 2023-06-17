import java.util.ArrayList;

public class Song {
    private String title;
    private String artist;
    private String genre;
    private ArrayList<String> lyrics;
    private double playTime;

    public Song(String title, String artist, String genre, ArrayList<String> lyrics, double playTime) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.lyrics = lyrics;
        this.playTime = playTime;
    }

    public String getTitle() {
         return title;
    }
    public String getArtist() {
         return artist;
    }
    public String getGenre() {
         return genre;
    }
    public ArrayList<String> getLyrics() {
        return lyrics;
    }
    public float getPlayTime() {
        return (float)playTime;
    }

}
