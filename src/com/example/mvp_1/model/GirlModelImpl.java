package com.example.mvp_1.model;

import java.util.ArrayList;
import java.util.List;

import com.example.mvp_1.R;
import com.example.mvp_1.bean.Girl;

public class GirlModelImpl  {


	public void loadGirl(onGirlListener listener) {
		//��������
		List<Girl> list=new ArrayList<Girl>();
		list.add(new Girl(R.drawable.image1, "�����ҵ�Сƻ��image1"));
		list.add(new Girl(R.drawable.image2, "�����ҵ�Сƻ��image2"));
		list.add(new Girl(R.drawable.image3, "�����ҵ�Сƻ��image3"));
		list.add(new Girl(R.drawable.image4, "�����ҵ�Сƻ��image4"));
		list.add(new Girl(R.drawable.image5, "�����ҵ�Сƻ��image5"));
		list.add(new Girl(R.drawable.image6, "�����ҵ�Сƻ��image6"));
		list.add(new Girl(R.drawable.image7, "�����ҵ�Сƻ��image7"));
		list.add(new Girl(R.drawable.image8, "�����ҵ�Сƻ��image8"));
		//��������
		listener.onComplete(list);
		
	}
	
	public interface onGirlListener{
		void onComplete(List<Girl> list);
	}

}
