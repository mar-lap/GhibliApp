package forserver.md;

public class People {
    private String id;
    private String name;
    private String gender;
    private String age;
    private String eye_color;
    private String hair_color;

    public People(String id, String name, String gender, String age, String eye_color, String hair_color) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.eye_color = eye_color;
        this.hair_color = hair_color;
    }

    public String getId() { return id; }

    public String getName() { return name; }

    public String getGender() { return gender; }

    public String getAge() { return age; }

    public String getEye_color() { return eye_color; }

    public String getHair_color() { return hair_color; }

    @Override
    public String toString() {
        return "name: " + name +
                "\ngender: " + gender +
                "\nage: " + age +
                "\neye color: " + eye_color +
                "\nhair color: " + hair_color + '\n';
    }
}
