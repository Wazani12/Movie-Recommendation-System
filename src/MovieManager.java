package MovieRecommendationSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MovieManager implements Reportable {

    private ArrayList<Movie> movies = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public Movie findMovieByTitle(String title) {
        for (Movie m : movies) {
            if (m.getTitle().equalsIgnoreCase(title)) {
                return m;
            }
        }
        return null;
    }

    @Override
    public void generateReport() {
        System.out.println("\n=========== Movie Report ===========");
        for (Movie m : movies) {
            System.out.println(m.getDetails());
        }
        System.out.println("====================================\n");
    }

    public void sortByRating() {
        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie m1, Movie m2) {
                return Double.compare(m2.getRating(), m1.getRating());
            }
        });
    }

    public void sortByYear() {
        Collections.sort(movies, (m1, m2) -> m2.getReleaseYear() - m1.getReleaseYear());
    }

    // ================= Inner Class ==================
    public class Analytics {
        public Movie getTopRatedMovie() {
            double max = -1;
            Movie top = null;

            for (Movie m : movies) {
                if (m.getRating() > max) {
                    max = m.getRating();
                    top = m;
                }
            }

            return top;
        }
    }
}
