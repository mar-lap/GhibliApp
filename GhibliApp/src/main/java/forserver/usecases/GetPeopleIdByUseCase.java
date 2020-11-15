package forserver.usecases;

import forserver.md.People;
import forserver.provider.PeopleProvider;

public class GetPeopleIdByUseCase {
    private PeopleProvider provider;

    public GetPeopleIdByUseCase(PeopleProvider provider) {this.provider = provider; }

    public People getPeopleById (String id) { return provider.getPeopleById(id); }
}
