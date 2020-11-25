package sources.util;

import com.google.gson.GsonBuilder;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ForNetwork {
    private static Retrofit retrofit;

    private static synchronized Retrofit retrofit(String url) {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().setLenient().create()))
                    .baseUrl(url)
                    .build();
        }
        return retrofit;
    }

    private static <T> T getApi(Class<T> clazz, Retrofit retrofit) {
        return retrofit.create(clazz);
    }

    public static <T> T buildApi(Class<T> tClass, String url) {
        return getApi(tClass, retrofit(url));
    }
}
