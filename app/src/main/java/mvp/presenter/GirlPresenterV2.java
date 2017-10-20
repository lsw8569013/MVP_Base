package mvp.presenter;

import java.util.List;

import android.os.SystemClock;

import mvp.bean.Girl;
import mvp.model.GirlModelImpl;
import mvp.view.IGirlView;


/**
 * 具体业务 类集成BasePresenter 带有GirlView的引用
 * @author lsw
 *
 */
public class GirlPresenterV2 extends BasePresenter<IGirlView> {


	//Model的引用
	GirlModelImpl iGirlModel = new GirlModelImpl();


	public void showLV(){

		if (iGirlModel!=null&&getView()!=null) {
			//显示进度条
			if (getView()!=null) {
				getView().showDialog();
			}
			SystemClock.sleep(2000);// Android的休眠，已忽略了中断的异常
			//加载数据
			iGirlModel.loadGirl(new GirlModelImpl.onGirlListener() {
				@Override
				public void onComplete(List<Girl> list) {
					//返回数据
					//显示到View层
					if (getView()!=null) {
						getView().showGirls(list);
					}
				}
			});

		}


	}

}