package com.example.mvp_1.view;

import android.app.Activity;
import android.os.Bundle;

import com.example.mvp_1.presenter.BasePresenter;

/**
 *  ����V ����ʾActivity��������P����ʾ��Ҫ������Presenter
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
	 * ����һ����֮������Presenter
	 * @return
	 */
	protected abstract P  createPresenter();
	@Override
	protected void onDestroy() {
		super.onDestroy();
		presenter.detachView();
	}
}
