package com.example.mvp_1.view;

import android.app.Activity;
import android.os.Bundle;

import com.example.mvp_1.presenter.BasePresenter;

/**
 *  泛型V ：表示Activity本身，泛型P：表示需要关联的Presenter
 * @author sunxinglong
 *
 * @param <V>
 * @param <P>
 */
public abstract class BaseActivity<V,P extends BasePresenter<V>> extends Activity {
	protected P presenter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		presenter = createPresenter();
		presenter.attachView((V)this);
	}
	/**
	 * 创建一个与之关联的Presenter
	 * @return
	 */
	protected abstract P  createPresenter();
	@Override
	protected void onDestroy() {
		super.onDestroy();
		presenter.detachView();
	}
}
