package sources;

import sources.data.FilmResponse;
import retrofit2.Call;
//import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Api {

    String URL = "https://ghibliapi.herokuapp.com/";

    @GET("films/{id}/")
    Call<FilmResponse> getFilmById(@Path("id") String id);
}
