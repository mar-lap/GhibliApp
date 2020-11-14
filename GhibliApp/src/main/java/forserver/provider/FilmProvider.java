package forserver.provider;

import forserver.md.Films;

public interface FilmProvider {
    Films getFilmById(String id);
}
