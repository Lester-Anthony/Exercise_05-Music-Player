import java.util.ArrayList;

public class Song {
    private String title;
    private String artist;
    private String genre;
    private ArrayList<String> lyrics;

    public Song(String title, String artist, String genre, ArrayList<String> lyrics) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.lyrics = lyrics;
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
        int i;
        float playTime = 0;

        for(i = 0; i < lyrics.size(); i++) {
            playTime += lyrics.get(i).length();
        }
        playTime /= 2;
        return playTime;
    }

}
