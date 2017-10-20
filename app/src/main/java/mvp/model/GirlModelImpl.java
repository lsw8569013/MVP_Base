package mvp.model;

import java.util.ArrayList;
import java.util.List;

import http.example.ls.myapplication.R;
import mvp.bean.Girl;


public class GirlModelImpl  {


	public void loadGirl(onGirlListener listener) {
		//加载数据
		List<Girl> list=new ArrayList<Girl>();
		list.add(new Girl(R.mipmap.image1, "你是我的小苹果image1"));
		list.add(new Girl(R.mipmap.image2, "你是我的小苹果image2"));
		list.add(new Girl(R.mipmap.image3, "你是我的小苹果image3"));
		list.add(new Girl(R.mipmap.image4, "你是我的小苹果image4"));
		list.add(new Girl(R.mipmap.image5, "你是我的小苹果image5"));
		list.add(new Girl(R.mipmap.image6, "你是我的小苹果image6"));
		list.add(new Girl(R.mipmap.image7, "你是我的小苹果image7"));
		list.add(new Girl(R.mipmap.image8, "你是我的小苹果image8"));
		//返回数据
		listener.onComplete(list);

	}

	public interface onGirlListener{
		void onComplete(List<Girl> list);
	}

}

