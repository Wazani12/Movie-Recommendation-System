package MovieRecommendationSystem;

import java.util.ArrayList;

public class User {
    private String username;
    private ArrayList<Rating> ratings;

    public User(String username) {
        this.username = username;
        this.ratings = new ArrayList<>();
    }

    public void addRating(Movie movie, int score, String comment) {
        try {
            if (movie == null) {
                throw new IllegalArgumentException("Movie cannot be null.");
            }
            if (score < 1 || score > 10) {
                throw new IllegalArgumentException("Score must be between 1 and 10.");
            }

            Rating rating = new Rating(movie, score, comment);
            ratings.add(rating);
            System.out.println("Rating added for " + movie.getTitle() +
                    ": " + score + "/10 — " + comment);
        } catch (IllegalArgumentException e) {
            System.out.println("Error adding rating: " + e.getMessage());
        }
    }

    public final void viewProfile() {
        System.out.println("----- Profile of " + username + " -----");
        if (ratings.isEmpty()) {
            System.out.println("No ratings yet.");
        } else {
            for (Rating rating : ratings) {
                System.out.println(rating);
            }
        }
        System.out.println("-----------------------------------");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ArrayList<Rating> getRatings() {
        return new ArrayList<>(ratings); // return a copy for safety
    }


}

