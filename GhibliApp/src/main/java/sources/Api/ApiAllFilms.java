package sources.Api;

import forserver.md.Films;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface ApiAllFilms {
    String URL = "https://ghibliapi.herokuapp.com/";

    @GET("/films/")
    Call <List<Films>> GetFilms();
}
