package com.example.mvp_1.view;

import java.util.List;

import com.example.mvp_1.bean.Girl;


/**
 * 视图层接口
 * @author yuxue
 *
 */
public interface IGirlView {
	//加载的提示
	void showDialog();
	//显示
	void showGirls(List<Girl>list);
}
