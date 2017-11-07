package mvp.http;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2017/10/18.
 */
public class HttpBase {

    public volatile static Retrofit retrofit = null;

    public static Retrofit getRetrofit() {
        if(retrofit == null){
            synchronized (Retrofit.class){
                if(retrofit == null){
                    retrofit = new Retrofit.Builder()
                            .addConverterFactory(GsonConverterFactory.create())
                            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                            .baseUrl("http://www.sojson.com/open/api/")
                            .build();
                }
            }
        }
        return retrofit;
    }

   public static  <T> T getService(Class<T> clazz) {
       return getRetrofit().create(clazz);
   }

}
