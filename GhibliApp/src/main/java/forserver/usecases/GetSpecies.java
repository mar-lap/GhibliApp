package forserver.usecases;

import forserver.md.Species;
import forserver.provider.AllSpeciesProvider;
import java.util.List;

public class GetSpecies {
    private AllSpeciesProvider provider;

    public GetSpecies(AllSpeciesProvider provider) { this.provider = provider; }

    public List <Species> GetListOfSpecies() { return provider.GetSpecies(); }
}
