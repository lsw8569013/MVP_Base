package com.example.mvp_1.presenter;

import java.util.List;

import android.os.SystemClock;

import com.example.mvp_1.bean.Girl;
import com.example.mvp_1.model.GirlModelImpl;
import com.example.mvp_1.model.GirlModelImpl.onGirlListener;
import com.example.mvp_1.view.IGirlView;

/**
 * ����ҵ�� �༯��BasePresenter ����GirlView������ 
 * @author lsw
 *
 */
public class GirlPresenterV2 extends BasePresenter<IGirlView> {
	
	
	//Model������
	GirlModelImpl iGirlModel = new GirlModelImpl();
	

	public void showLV(){
		
		if (iGirlModel!=null&&getView()!=null) {
			//��ʾ������
			if (getView()!=null) {
				getView().showDialog();
			}
			SystemClock.sleep(2000);// Android�����ߣ��Ѻ������жϵ��쳣
			//��������
			iGirlModel.loadGirl(new onGirlListener() {
				@Override
				public void onComplete(List<Girl> list) {
					//��������
					//��ʾ��View��
					if (getView()!=null) {
						getView().showGirls(list);
					}
				}
			});
			
		}
		
		
	}

}
