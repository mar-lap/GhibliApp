package forserver.usecases;

import forserver.md.Films;
import forserver.provider.FilmProvider;

public class GetFilmIdByUseCase {

    private FilmProvider provider;

    public GetFilmIdByUseCase(FilmProvider provider) {this.provider = provider; }

    public Films getFilmsById(String id) {return provider.getFilmById(id); }
}
