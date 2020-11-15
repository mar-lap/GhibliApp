package sources.Api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import sources.data.SpeciesResponse;

public interface ApiSpecies {
    String URL = "https://ghibliapi.herokuapp.com/";

    @GET("/species/{id}/")
    Call<SpeciesResponse> getSpeciesById(@Path("id") String id);
}
