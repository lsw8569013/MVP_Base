package http.example.ls.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import mvp.bean.WeatherBean;
import mvp.presenter.WeagherP;
import mvp.view.BaseActivity;
import mvp.view.IWeagherView;

/**
 * mvp weatherAcy Deomo
 * Created by lsw on 2017/10/20.
 */
public class WeatherAcy extends BaseActivity<IWeagherView,WeagherP> implements IWeagherView {

    private TextView tv_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
    }

    private void initView() {
         tv_test = (TextView)findViewById(R.id.tv_test);
    }

    @Override
    protected WeagherP createPresenter() {
        return new WeagherP();
    }

    public void getWeatherClick(View view) {
        presenter.showWeather();
    }

    @Override
    public void showWeatherV(WeatherBean weatherBean) {
        tv_test.setText("mvp" +weatherBean.toString());
    }

    @Override
    public void showWeatherV(String s) {
        tv_test.setText("mvp" +s);
    }
}
