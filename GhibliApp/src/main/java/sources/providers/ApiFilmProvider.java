package sources.providers;

import sources.Api.ApiFilm;
import sources.mapper.FilmMapper;
import sources.data.FilmResponse;
import sources.util.ForNetwork;
import forserver.provider.FilmProvider;
import forserver.md.Films;

import java.io.IOException;

public class ApiFilmProvider implements FilmProvider {
    private ApiFilm api;

    public ApiFilmProvider() { api = ForNetwork.buildApi(ApiFilm.class, ApiFilm.URL); }

    @Override
    public Films getFilmById(String id) {
        Films Response = null;
        try {
            FilmResponse ResponseBody = api.getFilmById(id).execute().body();
            if (ResponseBody != null)
                Response = new FilmMapper().convertFrom(ResponseBody);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Response;
    }
}
