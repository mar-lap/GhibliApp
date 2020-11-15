package sources.providers;

import forserver.md.Vehicles;
import sources.Api.ApiVehicles;
import sources.mapper.VehiclesMapper;
import sources.data.VehiclesResponse;
import sources.util.ForNetwork;
import forserver.provider.VehicleProvider;

import java.io.IOException;

public class ApiVehiclesProvider implements VehicleProvider{
    private ApiVehicles api;

    public ApiVehiclesProvider() { api = ForNetwork.buildApi(ApiVehicles.class, ApiVehicles.URL); }

    @Override
    public Vehicles getVehicleById(String id) {
        Vehicles response = null;
        try{
           VehiclesResponse ResponseBody = api.getVehicleById(id).execute().body();
           if (ResponseBody != null)
               response = new VehiclesMapper().convertFrom(ResponseBody);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }
}
