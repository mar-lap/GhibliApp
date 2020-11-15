package sources.Api;

import sources.data.PeopleResponse;
import retrofit2.Call;
//import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiPeople {
    String URL = "https://ghibliapi.herokuapp.com/";

    @GET("/people/{id}/")
    Call<PeopleResponse> getPeopleById(@Path("id") String id);
}
