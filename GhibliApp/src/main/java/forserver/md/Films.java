package forserver.md;

public class Films {
    private String id;
    private String title;
    private String description;
    private String director;
    private String producer;
    private String release_date;
    private String rt_score;

    public Films(String id, String title, String description, String director, String producer, String release_date, String rt_score)
    {
        this.id = id;
        this.title = title;
        this.description = description;
        this.director = director;
        this.producer = producer;
        this.release_date = release_date;
        this.rt_score = rt_score;
    }

    public String getId() { return id; }

    public String getTitle() {return title; }

    public String getDescription() {return description; }

    public String getDirector() {return director; }

    public String getProducer() {return producer; }

    public String getRelease_date() {return release_date; }

    public String getRt_score() {return rt_score; }

    @Override
    public String toString() {
        return "film: " + title +
                "\ndescription: " + description +
                "\ndirector: " + director +
                "\nproducer: " + producer +
                "\nrelease date: " + release_date +
                "\nrt score: " + rt_score + '\n';
    }
}
