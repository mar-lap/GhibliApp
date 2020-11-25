package sources.providers;

import forserver.provider.AllPeopleProvider;
import forserver.md.People;
import sources.util.ForNetwork;
import sources.Api.ApiAllPeople;

import java.io.IOException;
import java.util.List;


public class ApiAllPeopleProvider implements AllPeopleProvider{
    private ApiAllPeople api;

    public ApiAllPeopleProvider() { api = ForNetwork.buildApi(ApiAllPeople.class, api.URL); }

    @Override
    public List <People> GetPeople() {
        List <People> response = null;
        try {
            response = api.GetPeople().execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }
}
