package forserver.md;

public class Vehicles {
    private String id;
    private String name;
    private String description;
    private String vehicle_class;
    private String length;

    public Vehicles(String id, String name, String description, String vehicle_class, String length) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.vehicle_class = vehicle_class;
        this.length = length;
    }

    public String getId() { return id; }

    public String getName() { return name; }

    public String getDescription() { return description; }

    public String getVehicle_class() { return vehicle_class; }

    public String getLength() { return length; }

    @Override
    public String toString() {
        return "name: " + name +
                "\ndescription: " + description +
                "\nvehicle_class: " + vehicle_class +
                "\nlength: " + length + '\n';
    }
}
