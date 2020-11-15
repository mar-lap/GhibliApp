package sources.mapper;

import sources.data.LocationsResponse;
import forserver.mapper.Mapper;
import forserver.md.Locations;

public class LocationMapper implements Mapper<LocationsResponse, Locations> {
    @Override
    public Locations convertFrom(LocationsResponse t) {
        return new Locations(t.getId(), t.getName(), t.getClimate(), t.getTerrain(), t.getSurfaceWater());
    }

    @Override
    public LocationsResponse convertTo(Locations t1) { return null; }
}
