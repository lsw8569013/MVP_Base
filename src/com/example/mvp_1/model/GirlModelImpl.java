package com.example.mvp_1.model;

import java.util.ArrayList;
import java.util.List;

import com.example.mvp_1.R;
import com.example.mvp_1.bean.Girl;

public class GirlModelImpl  {


	public void loadGirl(onGirlListener listener) {
		//加载数据
		List<Girl> list=new ArrayList<Girl>();
		list.add(new Girl(R.drawable.image1, "你是我的小苹果image1"));
		list.add(new Girl(R.drawable.image2, "你是我的小苹果image2"));
		list.add(new Girl(R.drawable.image3, "你是我的小苹果image3"));
		list.add(new Girl(R.drawable.image4, "你是我的小苹果image4"));
		list.add(new Girl(R.drawable.image5, "你是我的小苹果image5"));
		list.add(new Girl(R.drawable.image6, "你是我的小苹果image6"));
		list.add(new Girl(R.drawable.image7, "你是我的小苹果image7"));
		list.add(new Girl(R.drawable.image8, "你是我的小苹果image8"));
		//返回数据
		listener.onComplete(list);
		
	}
	
	public interface onGirlListener{
		void onComplete(List<Girl> list);
	}

}
