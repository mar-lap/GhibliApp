package sources.providers;

import forserver.md.People;
import sources.Api.ApiPeople;
import sources.mapper.PeopleMapper;
import sources.data.PeopleResponse;
import sources.util.ForNetwork;
import forserver.provider.PeopleProvider;

import java.io.IOException;

public class ApiPeopleProvider implements PeopleProvider{
    private ApiPeople api;

    public ApiPeopleProvider() { api = ForNetwork.buildApi(ApiPeople.class, ApiPeople.URL); }

    @Override
    public People getPeopleById(String id) {
        People response = null;
        try{
            PeopleResponse ResponseBody = api.getPeopleById(id).execute().body();
            if (ResponseBody != null)
                response = new PeopleMapper().convertFrom(ResponseBody);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }
}
