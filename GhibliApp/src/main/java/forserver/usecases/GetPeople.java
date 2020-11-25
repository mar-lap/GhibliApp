package forserver.usecases;

import forserver.md.People;
import forserver.provider.AllPeopleProvider;
import java.util.List;

public class GetPeople {
    private AllPeopleProvider provider;

    public GetPeople(AllPeopleProvider provider) { this.provider = provider; }

    public List <People> GetListOfPeople() { return provider.GetPeople(); }
}
