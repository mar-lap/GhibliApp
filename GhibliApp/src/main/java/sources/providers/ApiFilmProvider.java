package sources.providers;

import sources.Api;
import sources.mapper.FilmMapper;
import sources.data.FilmResponse;
import sources.util.ForNetwork;
import forserver.provider.FilmProvider;
import forserver.md.Films;

import java.io.IOException;

public class ApiFilmProvider implements FilmProvider {

    private Api api;

    public ApiFilmProvider() { api = ForNetwork.buildApi(Api.class, Api.URL); }

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
