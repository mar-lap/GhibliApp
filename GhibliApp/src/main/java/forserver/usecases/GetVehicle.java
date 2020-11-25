package forserver.usecases;

import forserver.md.Vehicles;
import forserver.provider.AllVehiclesProvider;
import java.util.List;

public class GetVehicle {
    private AllVehiclesProvider provider;

    public GetVehicle(AllVehiclesProvider provider) { this.provider = provider; }

    public List <Vehicles> GetListOfVehicles() { return provider.GetVehicles(); }
}
