package com.example.mvp_1.view;

import java.util.List;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.example.mvp_1.R;
import com.example.mvp_1.adapter.GirlAdapter;
import com.example.mvp_1.bean.Girl;
import com.example.mvp_1.presenter.GirlPresenterV2;

/**
 * GBK 编码 改版自 dongnaoeduMVP
 * @author lsw
 *
 */
public class MainActivity extends BaseActivity<IGirlView,GirlPresenterV2> implements IGirlView {
	
	ListView listView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
		
		presenter.showLV();
	}

	private void initView() {
		listView = (ListView) findViewById(R.id.listview);
	}

	@Override
	public void showDialog() {
		Toast.makeText(this, "加载中……", Toast.LENGTH_LONG).show();
	}

	@Override
	public void showGirls(List<Girl> list) {
		listView.setAdapter(new GirlAdapter(this, list));

	}
	@Override
	protected GirlPresenterV2 createPresenter() {
		return new GirlPresenterV2();
	}
	
}
