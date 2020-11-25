package sources.Api;

import forserver.md.Vehicles;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface ApiAllVehicles {
    String URL = "https://ghibliapi.herokuapp.com/";

    @GET("/vehicles/")
    Call <List <Vehicles>> GetVehicles();
}
