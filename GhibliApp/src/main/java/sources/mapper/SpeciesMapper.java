package sources.mapper;

import forserver.mapper.Mapper;
import forserver.md.Species;
import sources.data.SpeciesResponse;

public class SpeciesMapper implements Mapper<SpeciesResponse, Species>{
    @Override
    public Species convertFrom(SpeciesResponse t) {
        return new Species(t.getId(), t.getName(), t.getClassification(), t.getEyeColors(), t.getHairColors());
    }

    @Override
    public SpeciesResponse convertTo(Species t1) { return null; }
}
