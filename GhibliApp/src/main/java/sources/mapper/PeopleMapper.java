package sources.mapper;

import sources.data.PeopleResponse;
import forserver.mapper.Mapper;
import forserver.md.People;

public class PeopleMapper implements Mapper<PeopleResponse, People>{
    @Override
    public People convertFrom(PeopleResponse t) {
        return new People(t.getId(), t.getName(), t.getGender(), t.getAge(), t.getEyeColor(), t.getHairColor());
    }

    @Override
    public PeopleResponse convertTo(People t1) { return null; }

}
