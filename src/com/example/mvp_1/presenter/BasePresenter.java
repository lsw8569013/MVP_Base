package com.example.mvp_1.presenter;

import java.lang.ref.WeakReference;
/**
 *  ����V:��ʾ��֮������Activity
 * @author lsw
 *
 * @param <V>
 */
public class BasePresenter<V> {
	
	//View ������
	protected WeakReference<V> mPresenterReference;//ʹ��������,�����ڴ�й©
	
	/**
	 * ������Viewģ�ͣ�������Activity��Fragment������onTachActivity()
	 * @param view
	 */
	public void attachView(V view){
		mPresenterReference = new WeakReference<V>(view);
	}
	/**
	 * �Ͽ���Viewģ�͵����ӣ�������Activity��Fragment�ĶϿ�ondeTachActivity()
	 * ��ֹ������һЩ���õ�����
	 * @param view
	 */
	public void detachView(){
		if (mPresenterReference!=null) {
			mPresenterReference.clear();
		}
	}
	protected V getView(){
		return mPresenterReference.get();
	}
}
