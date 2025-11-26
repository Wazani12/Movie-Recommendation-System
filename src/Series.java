package MovieRecommendationSystem;

public class Series extends Movie{
    private int season;
    private int episodes;

    public Series(String title, Genre genre, int releaseYear, double rating, int season, int episodes) {
        super(title, genre, releaseYear, rating);
        this.season = season;
        this.episodes = episodes;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    @Override
    public String getDetails() {
        return super.getDetails()+
                "\n Season : " + getSeason()+
                "\n Episode : " + getEpisodes();
    }
}
