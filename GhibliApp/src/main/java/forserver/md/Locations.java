package forserver.md;

public class Locations {
    private String id;
    private String name;
    private String climate;
    private String terrain;
    private String surface_water;

    public Locations(String id, String name, String climate, String terrain, String surface_water) {
        this.id = id;
        this.name = name;
        this.climate = climate;
        this.terrain = terrain;
        this.surface_water = surface_water;
    }

    public String getId() { return id; }

    public String getName() { return name; }

    public String getClimate() { return climate; }

    public String getTerrain() { return terrain; }

    public String getSurface_water() { return surface_water; }

    @Override
    public String toString(){
        return "name: " + name +
                "\nclimate: " + climate +
                "\nterrain: " + terrain +
                "\nsurface water: " + surface_water + '\n';
    }
}
