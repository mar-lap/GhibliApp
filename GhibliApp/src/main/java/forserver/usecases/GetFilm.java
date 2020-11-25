package forserver.usecases;

import forserver.md.Films;
import forserver.provider.AllFilmsProvider;
import java.util.List;

public class GetFilm {
    private AllFilmsProvider provider;

    public GetFilm(AllFilmsProvider provider) { this.provider = provider; }

    public List <Films> GetListOfFilms() {return provider.GetFilms(); }
}
