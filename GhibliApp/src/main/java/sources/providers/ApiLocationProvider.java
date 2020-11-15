package sources.providers;

import sources.Api.ApiLocation;
import sources.mapper.LocationMapper;
import sources.data.LocationsResponse;
import sources.util.ForNetwork;
import forserver.provider.LocationProvider;
import forserver.md.Locations;

import java.io.IOException;

public class ApiLocationProvider implements LocationProvider {
    private ApiLocation api;

    public ApiLocationProvider() { api = ForNetwork.buildApi(ApiLocation.class, ApiLocation.URL); }

    @Override
    public Locations getLocationById(String id) {
        Locations response = null;
        try {
            LocationsResponse ResponseBody = api.getLocationById(id).execute().body();
            if (ResponseBody != null)
                response = new LocationMapper().convertFrom(ResponseBody);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }
}
