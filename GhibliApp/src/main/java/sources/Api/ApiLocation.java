package sources.Api;

import sources.data.LocationsResponse;
import retrofit2.Call;
//import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiLocation {
    String URL = "https://ghibliapi.herokuapp.com/";

    @GET("/locations/{id}/")
    Call<LocationsResponse> getLocationById(@Path("id") String id);
}
