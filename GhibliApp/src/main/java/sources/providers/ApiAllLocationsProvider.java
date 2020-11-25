package sources.providers;

import forserver.provider.AllLocationsProvider;
import forserver.md.Locations;
import sources.Api.ApiAllLocations;
import sources.util.ForNetwork;

import java.io.IOException;
import java.util.List;

public class ApiAllLocationsProvider implements  AllLocationsProvider{
    private ApiAllLocations api;

    public ApiAllLocationsProvider() { api = ForNetwork.buildApi(ApiAllLocations.class, api.URL); }

    @Override
    public List<Locations> GetLocations() {
        List <Locations> response = null;
        try {
            response = api.GetLocations().execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }
}
