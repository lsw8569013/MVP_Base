package mvp.model;

import java.util.List;

import http.example.ls.myapplication.bean.WeatherBean;
import mvp.bean.Girl;
import mvp.http.MyCallBack;
import mvp.http.MyRetrfit;
import retrofit2.Call;
import retrofit2.Response;

/**
 * Created by Administrator on 2017/10/20.
 */

public class WeatherModule {

    public void getWeather(final onWeatherListener listener){
        MyRetrfit.getWeatherService().getWeather("北京")
                .enqueue(new MyCallBack<WeatherBean>() {

                    @Override
                    protected void getDataError(Call<WeatherBean> call, Response<WeatherBean> response) {

                    }

                    @Override
                    protected void onSuccess(Call<WeatherBean> call, Response<WeatherBean> response, WeatherBean weatherBean) {
                        listener.onComplete(weatherBean);
                    }
                });
    }
    public interface onWeatherListener{
        void onComplete( WeatherBean weatherBean);
    }


}
