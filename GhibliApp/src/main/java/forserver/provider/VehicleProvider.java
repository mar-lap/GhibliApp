package forserver.provider;

import forserver.md.Vehicles;

public interface VehicleProvider {
    Vehicles getVehicleById(String id);
}
