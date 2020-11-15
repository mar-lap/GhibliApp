package sources.providers;

import forserver.md.Species;
import sources.Api.ApiSpecies;
import sources.mapper.SpeciesMapper;
import sources.data.SpeciesResponse;
import sources.util.ForNetwork;
import forserver.provider.SpeciesProvider;

import java.io.IOException;

public class ApiSpeciesProvider implements SpeciesProvider {
    private ApiSpecies api;

    public ApiSpeciesProvider() {api = ForNetwork.buildApi(ApiSpecies.class, ApiSpecies.URL); }

    @Override
    public Species getSpeciesById(String id) {
        Species response = null;
        try{
            SpeciesResponse ResponseBody = api.getSpeciesById(id).execute().body();
            if (ResponseBody != null)
                response = new SpeciesMapper().convertFrom(ResponseBody);
        } catch (IOException e) {
            e.printStackTrace();;
        }
        return response;
    }
}
