package MovieRecommendationSystem;

public class Main {
    public static void main(String[] args) {

        MovieManager manager = new MovieManager();

        Movie m1 = new Movie("Interstellar", Genre.SCI_FI, 2014,10.5);
        Movie m2 = new Movie("Joker", Genre.DRAMA, 2019,9.5);
        Series s1 = new Series("Breaking Bad", Genre.DRAMA, 2008, 5, 62, 9);

        manager.addMovie(m1);
        manager.addMovie(m2);
        manager.addMovie(s1);

        User u1 = new User("Simo");
        User u2 = new User("Mehdi");

        manager.addUser(u1);
        manager.addUser(u2);

        u1.addRating(m1, 5, "Masterpiece!");
        u1.addRating(s1, 4, "Amazing show!");

        u2.addRating(m1, 4, "Great movie");
        u2.addRating(m2, 5, "Incredible performance");

        u1.viewProfile();
        u2.viewProfile();

        manager.sortByRating();
        manager.generateReport();

        MovieManager.Analytics analytics = manager.new Analytics();
        Movie top = analytics.getTopRatedMovie();

        System.out.println("Top Rated Movie: " + top.getDetails());
    }
}
