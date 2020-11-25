package forserver.usecases;

import forserver.md.Locations;
import forserver.provider.AllLocationsProvider;
import java.util.List;

public class GetLocation {
    private AllLocationsProvider provider;

    public GetLocation(AllLocationsProvider provider) { this.provider = provider; }

    public List <Locations> GetLIstOfLocations() { return provider.GetLocations(); }
}
