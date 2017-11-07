package mvp.model;

import com.vise.log.ViseLog;

import mvp.bean.WeatherBean;
import mvp.http.HttpServiceHelp;
import mvp.http.MyCallBack;
import mvp.http.MyRetrfit;
import retrofit2.Call;
import retrofit2.Response;
import rxhttp.ViseHttp;
import rxhttp.callback.ACallback;
import rxhttp.core.ApiTransformer;
import rxhttp.mode.CacheMode;
import rxhttp.mode.CacheResult;
import rxhttp.request.GetRequest;
import rxhttp.subscriber.ApiCallbackSubscriber;

/**
 * Created by Administrator on 2017/10/20.
 */

public class WeatherModule {

    public void getWeather(final onWeatherListener listener){

//        ViseHttp.BASE(new GetRequest("weather/json.shtml"))
//                .addUrlParam("appId", "10001")
//                .request(new ACallback<WeatherBean>() {
//                        @Override
//                        public void onSuccess(WeatherBean data) {
//
//                        }
//
//                        @Override
//                        public void onFail(int errCode, String errMsg) {
//
//                        }
//                    });

        //带缓存策略
//        MyRetrfit.getWeatherService().getWeather("北京")
//        MyRetrfit.getService("北京")
//                .compose(ApiTransformer.<WeatherBean>norTransformer())
//                .compose(ViseHttp.getApiCache().<WeatherBean>transformer(CacheMode.CACHE_AND_REMOTE, WeatherBean.class))
//                .subscribe(new ApiCallbackSubscriber<>(new ACallback<CacheResult<WeatherBean>>() {
//                    @Override
//                    public void onSuccess(CacheResult<WeatherBean> cacheResult) {
//                        ViseLog.i("request onSuccess!");
//                        if (cacheResult == null || cacheResult.getCacheData() == null) {
//                            return;
//                        }
//                        listener.onCompleteRX(cacheResult.getCacheData().toString());
////                        if (cacheResult.isCache()) {
////                            mShow_response_data.setText("From Cache:\n" + cacheResult.getCacheData().toString());
////                        } else {
////                            mShow_response_data.setText("From Remote:\n" + cacheResult.getCacheData().toString());
////                        }
//                    }
//
//                    @Override
//                    public void onFail(int errCode, String errMsg) {
//                        ViseLog.e("request errorCode:" + errCode + ",errorMsg:" + errMsg);
//                    }
//                }));

        MyRetrfit.getService("北京")
        .compose(ApiTransformer.<WeatherBean>norTransformer())
                .subscribe(new ApiCallbackSubscriber<>(new ACallback<WeatherBean>() {
                    @Override
                    public void onSuccess(WeatherBean authorModel) {
                        ViseLog.i("request onSuccess!");
                        if (authorModel == null) {
                            return;
                        }
                        listener.onComplete(authorModel);
                    }

                    @Override
                    public void onFail(int errCode, String errMsg) {
                        ViseLog.e("request errorCode:" + errCode + ",errorMsg:" + errMsg);
                    }
                }));


    }
    public interface onWeatherListener{
        void onComplete( WeatherBean weatherBean);

        void onCompleteRX(String s);
    }


}
