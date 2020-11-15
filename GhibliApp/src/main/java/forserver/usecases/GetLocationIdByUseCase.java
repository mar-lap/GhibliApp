package forserver.usecases;

import forserver.md.Locations;
import forserver.provider.LocationProvider;

public class GetLocationIdByUseCase {
    private LocationProvider provider;

    public GetLocationIdByUseCase(LocationProvider provider) { this.provider = provider; }

    public Locations getLocationById(String id) { return provider.getLocationById(id); }
}
