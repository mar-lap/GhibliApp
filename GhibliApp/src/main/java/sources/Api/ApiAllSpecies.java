package sources.Api;

import forserver.md.Species;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface ApiAllSpecies {
    String URL = "https://ghibliapi.herokuapp.com/";

    @GET("/species/")
    Call <List <Species>> GetSpecies();
}
