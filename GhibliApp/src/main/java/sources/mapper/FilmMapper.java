package sources.mapper;

import sources.data.FilmResponse;
import forserver.mapper.Mapper;
import forserver.md.Films;

public class FilmMapper implements Mapper<FilmResponse, Films> {
    @Override
    public Films convertFrom(FilmResponse t) {
        return new Films(t.getId(), t.getTitle(), t.getDescription(), t.getDirector(), t.getProducer(), t.getReleaseDate(), t.getRtScore());
    }

    @Override
    public FilmResponse convertTo(Films t1) { return null; }
}
