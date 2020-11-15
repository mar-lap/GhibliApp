package forserver.provider;

import forserver.md.Species;

public interface SpeciesProvider {
    Species getSpeciesById(String id);
}
