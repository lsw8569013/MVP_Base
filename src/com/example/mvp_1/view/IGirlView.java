package com.example.mvp_1.view;

import java.util.List;

import com.example.mvp_1.bean.Girl;


/**
 * ��ͼ��ӿ�
 * @author yuxue
 *
 */
public interface IGirlView {
	//���ص���ʾ
	void showDialog();
	//��ʾ
	void showGirls(List<Girl>list);
}
