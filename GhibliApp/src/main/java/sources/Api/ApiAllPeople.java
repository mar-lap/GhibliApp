package sources.Api;

import forserver.md.People;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface ApiAllPeople {
    String URL = "https://ghibliapi.herokuapp.com/";

    @GET("/people/")
    Call <List <People>> GetPeople();
}
