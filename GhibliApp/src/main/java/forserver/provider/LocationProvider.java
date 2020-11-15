package forserver.provider;

import forserver.md.Locations;

public interface LocationProvider {
    Locations getLocationById(String id);
}
