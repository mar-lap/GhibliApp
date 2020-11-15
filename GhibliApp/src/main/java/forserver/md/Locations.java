package forserver.md;

public class Locations {
    private String id;
    private String name;
    private String climate;
    private String terrain;
    private String surface_water;

    public Locations(String id, String name, String climate, String terrain, String surface_water) {
        this.id = id;
        this.climate = climate;
        this.name = name;
        this.terrain = terrain;
        this.surface_water = surface_water;
    }

    public String getClimate() { return climate; }

    public String getId() { return id; }

    public String getName() { return name; }

    public String getTerrain() { return terrain; }

    public String getSurface_water() { return surface_water; }

    @Override
    public String toString(){
        return "name: " + name +
                "\nclimate: " + climate +
                "\nterrain: " + terrain +
                "\nsurface_water: " + surface_water + '\n';
    }
}
