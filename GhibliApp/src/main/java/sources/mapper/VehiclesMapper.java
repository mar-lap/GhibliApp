package sources.mapper;

import forserver.mapper.Mapper;
import forserver.md.Vehicles;
import sources.data.VehiclesResponse;

public class VehiclesMapper implements Mapper <VehiclesResponse, Vehicles>{
    @Override
    public Vehicles convertFrom(VehiclesResponse t) {
        return new Vehicles(t.getId(), t.getName(), t.getDescription(), t.getVehicleClass(), t.getLength());
    }

    @Override
    public VehiclesResponse convertTo(Vehicles t1) { return null; }
}
