package sources.Api;

import forserver.md.Locations;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface ApiAllLocations {
    String URL = "https://ghibliapi.herokuapp.com/";

   @GET("/locations/")
   Call <List<Locations>> GetLocations ();
}
