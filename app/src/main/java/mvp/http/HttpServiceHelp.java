package mvp.http;

import http.example.ls.myapplication.bean.LoginBean;
import http.example.ls.myapplication.bean.WeatherBean;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * 定义接口
 * Created by Administrator on 2017/10/18.
 */
public class HttpServiceHelp {

    /**
     *
     */
    public interface getWeather{

        @GET("weather/json.shtml")
        Call<WeatherBean> getWeather(@Query("city") String city);
    }



    /**
     * 登录请求
     */
    public interface Login {
        @POST("identity/login")
        Call<LoginBean> getList(@Body RequestBody body);
    }

    /**
     * 获取上传凭证
     */
    public interface GetUploadInfo {
        @GET("identity/{userId}/upload-info")
        Call<LoginBean> getInfo(@Path("userId") String userId);
    }

    /**
     * D页修改登录密码
     */
    public interface ChangeLoginPassword {
        @POST("identity/{userId}/password-change")
        Call<LoginBean> getInfo(@Path("userId") String userId, @Body RequestBody body);
    }

}
