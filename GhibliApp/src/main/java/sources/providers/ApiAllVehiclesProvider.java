package sources.providers;

import forserver.provider.AllVehiclesProvider;
import forserver.md.Vehicles;
import sources.util.ForNetwork;
import sources.Api.ApiAllVehicles;

import java.io.IOException;
import java.util.List;

public class ApiAllVehiclesProvider implements AllVehiclesProvider{
    private ApiAllVehicles api;

    public ApiAllVehiclesProvider() { api = ForNetwork.buildApi(ApiAllVehicles.class, api.URL); }

    @Override
    public List <Vehicles> GetVehicles() {
        List <Vehicles> response = null;
        try {
            response = api.GetVehicles().execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }
}
