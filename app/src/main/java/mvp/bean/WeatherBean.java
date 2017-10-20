package mvp.bean;

/**
 * Created by Administrator on 2017/10/18.
 */

//"date":"20171018","message":"Success !","status":200,"city":"北京","count":2,

public class WeatherBean {
    String date;
    String message;
    String city;
    int count;
    int status;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "WeatherBean{" +
                "date='" + date + '\'' +
                ", message='" + message + '\'' +
                ", city='" + city + '\'' +
                ", count=" + count +
                ", status=" + status +
                '}';
    }
}
