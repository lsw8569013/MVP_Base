package mvp.presenter;

import http.example.ls.myapplication.bean.WeatherBean;
import mvp.model.WeatherModule;
import mvp.view.IWeagherView;

/**
 * Created by Administrator on 2017/10/20.
 */

public class WeagherP extends BasePresenter<IWeagherView> {

    WeatherModule m = new WeatherModule();

    public void showWeather() {
        if(getView() != null && m != null)
        m.getWeather(new WeatherModule.onWeatherListener() {
            @Override
            public void onComplete(WeatherBean weatherBean) {
                getView().showWeatherV(weatherBean);
            }
        });
    }
}
