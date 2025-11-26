package MovieRecommendationSystem;

public class Movie {
    private String title;
    private Genre genre;
    private int releaseYear;
    private double rating;
    private static int movieCount;

    public Movie(String title, Genre genre, int releaseYear, double rating) {
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.rating = rating;
        movieCount++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getDetails(){
        return "Movie : " + getTitle()+
                "\nGenre : " + getGenre()+
                "\nRelease Year : " + getReleaseYear()+
                "\nRating : " + getRating();
    }

    public static int getMovieCount(){
        return movieCount;
    }
}
