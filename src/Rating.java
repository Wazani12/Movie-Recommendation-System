package MovieRecommendationSystem;

import java.time.LocalDate;

public class Rating {
    private Movie movie;
    private int score;
    private String comment;
    private LocalDate date;

    public Rating(Movie movie, int score, String comment) {
        this.movie = movie;
        this.score = score;
        this.comment = comment;
        this.date = date;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDetails(){
        return "Movie : " + getMovie()+
                "\n Score : " + getScore()+
                "\n Comment : " + getComment()+
                "\n Date : " + getDate();
    }
}
