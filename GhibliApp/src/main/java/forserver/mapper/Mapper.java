package forserver.mapper;

public interface Mapper<FROM, TO> {
    TO convertFrom(FROM t2);

    FROM convertTo(TO t1);
}
