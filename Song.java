public class Song {
    private String title;
    private String artist;
    private String genre;
    private String[] lyrics;
    private float playTime;

    public Song(String title, String artist, String genre, String[] lyrics) {
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
    public String[] getLyrics() {
        return lyrics;
    }
    public float getPlayTime() {
        return playTime;
    }

}
