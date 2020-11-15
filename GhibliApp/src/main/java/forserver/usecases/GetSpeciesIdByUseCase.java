package forserver.usecases;

import forserver.md.Species;
import forserver.provider.SpeciesProvider;

public class GetSpeciesIdByUseCase {
    private SpeciesProvider provider;

    public GetSpeciesIdByUseCase(SpeciesProvider provider) { this.provider = provider; }

    public Species getSpeciesById(String id) { return provider.getSpeciesById(id); }
}
