package mvp.http;

import mvp.http.HttpServiceHelp;

/**
 * 调用接口
 * Created by lsw
 */
public class MyRetrfit {


    public static HttpServiceHelp.getWeather getWeatherService() {
        return HttpBase.getService(HttpServiceHelp.getWeather.class);
    }

}
