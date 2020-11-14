package sources.util;

import com.google.gson.GsonBuilder;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.concurrent.TimeUnit;


public class ForNetwork {

    private static OkHttpClient client;
    private static Retrofit retrofit;

    private static synchronized OkHttpClient client() {
        if (client == null) {
            client = new OkHttpClient.Builder()
                    .connectTimeout(10, TimeUnit.SECONDS)
                    .readTimeout(10, TimeUnit.SECONDS)
                    .writeTimeout(10, TimeUnit.SECONDS)
                    .build();
        }
        return client;
    }


    private static synchronized Retrofit retrofit(OkHttpClient client, String url) {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .client(client)
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
        return getApi(tClass, retrofit(client(), url));
    }
}
