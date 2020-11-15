package forserver.md;

public class Species {
    private String id;
    private String name;
    private String classification;
    private String eye_colors;
    private String hair_colors;

    public Species(String id, String name, String classification, String eye_colors, String hair_colors) {
        this.id = id;
        this.name = name;
        this.classification = classification;
        this.eye_colors = eye_colors;
        this.hair_colors = hair_colors;
    }

    public String getId() { return id; }

    public String getClassification() { return classification; }

    public String getEye_colors() { return eye_colors; }

    public String getName() { return name; }

    public String getHair_colors() { return hair_colors; }
}
