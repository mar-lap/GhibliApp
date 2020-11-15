package sources.Api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import sources.data.VehiclesResponse;

public interface ApiVehicles {
    String URL = "https://ghibliapi.herokuapp.com/";

    @GET("/vehicles/{id}/")
    Call<VehiclesResponse> getVehicleById(@Path("id") String id);
}
