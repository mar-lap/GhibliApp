package sources.providers;

import forserver.provider.AllFilmsProvider;
import forserver.md.Films;
import sources.Api.ApiAllFilms;
import sources.util.ForNetwork;

import java.io.IOException;
import java.util.List;

public class ApiAllFilmsProvider implements AllFilmsProvider{
    private ApiAllFilms api;

    public ApiAllFilmsProvider() { api = ForNetwork.buildApi(ApiAllFilms.class, ApiAllFilms.URL); }

    @Override
    public List <Films> GetFilms() {
        List <Films> response = null;
        try {
            response = api.GetFilms().execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }
}
