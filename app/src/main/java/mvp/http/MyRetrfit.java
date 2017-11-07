package mvp.http;

import io.reactivex.Observable;
import mvp.bean.WeatherBean;
import mvp.http.HttpServiceHelp;
import rxhttp.ViseHttp;

/**
 * 调用接口
 * Created by lsw
 */
public class MyRetrfit {


    public static HttpServiceHelp.getWeatherRX getWeatherService() {
        return HttpBase.getService(HttpServiceHelp.getWeatherRX.class);
    }

    public static Observable<WeatherBean> getService(String city) {
        return ViseHttp.RETROFIT()
                .create(HttpServiceHelp.getWeatherRX.class)
                .getWeather(city);
    }
}
