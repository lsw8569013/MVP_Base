package http.example.ls.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;

import http.example.ls.myapplication.bean.WeatherBean;
import http.example.ls.myapplication.com.base.retrofit.WeatherService;
import mvp.http.HttpBase;
import mvp.http.MyCallBack;
import mvp.http.MyRetrfit;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class HttpTestAcy extends AppCompatActivity {

    private TextView tv_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        tv_test = (TextView)findViewById(R.id.tv_test);

    }

    public void getWeather(View view){
        getWeather4("北京");
    }

    private void getWeather(String city) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.sojson.com/open/api/")
                .build();


        WeatherService weatherService = retrofit.create(WeatherService.class);

        Call<ResponseBody> mCall = weatherService.getBlog(city);


        mCall.enqueue(new Callback<ResponseBody>() {

            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {

                try {
                    tv_test.setText(response.body().string());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            }
        });
    }

    private void getWeatherT(String city) {

        HttpBase.getService(WeatherService.class)
                .getBlog("北京").
                enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {

            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            }
        });
    }


    private void getWeather3(String city) {

//        MyRetrfit.getWeatherService().getWeather("北京")
//                .enqueue(new Callback<ResponseBody>() {
//                    @Override
//                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
//
//                    }
//
//                    @Override
//                    public void onFailure(Call<ResponseBody> call, Throwable t) {
//
//                    }
//                });
    }

    private void getWeather4(String city) {

        MyRetrfit.getWeatherService().getWeather("北京")
                .enqueue(new MyCallBack<WeatherBean>() {

                    @Override
                    protected void getDataError(Call<WeatherBean> call, Response<WeatherBean> response) {

                    }

                    @Override
                    protected void onSuccess(Call<WeatherBean> call, Response<WeatherBean> response, WeatherBean weatherBean) {
                        tv_test.setText(weatherBean.toString()
                        );
                    }
                });
    }

    public void getWeatherClick(View view) {

    }
}
