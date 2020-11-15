package forserver.usecases;

import forserver.md.Vehicles;
import forserver.provider.VehicleProvider;

public class GetVehicleIdByUseCase {
    private VehicleProvider provider;

    public GetVehicleIdByUseCase(VehicleProvider provider) { this.provider = provider; }

    public Vehicles getVehicleById(String id) { return provider.getVehicleById(id); }
}
