package forserver.provider;

import forserver.md.People;

public interface PeopleProvider {
    People getPeopleById(String id);
}
