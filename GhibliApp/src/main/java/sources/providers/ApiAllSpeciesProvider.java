package sources.providers;

import forserver.provider.AllSpeciesProvider;
import forserver.md.Species;
import sources.util.ForNetwork;
import sources.Api.ApiAllSpecies;

import java.io.IOException;
import java.util.List;

public class ApiAllSpeciesProvider implements AllSpeciesProvider{
    private ApiAllSpecies api;

    public ApiAllSpeciesProvider() { api = ForNetwork.buildApi(ApiAllSpecies.class, api.URL); }

    @Override
    public List <Species> GetSpecies() {
        List <Species> response = null;
        try {
            response = api.GetSpecies().execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }
}
