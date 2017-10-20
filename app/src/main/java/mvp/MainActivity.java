package mvp;

import java.util.List;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;


import http.example.ls.myapplication.HttpTestAcy;
import http.example.ls.myapplication.R;
import http.example.ls.myapplication.WeatherAcy;
import mvp.adapter.GirlAdapter;
import mvp.bean.Girl;
import mvp.presenter.GirlPresenterV2;
import mvp.view.BaseActivity;
import mvp.view.IGirlView;

/**
 *
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
		Toast.makeText(this, "dialog", Toast.LENGTH_LONG).show();
	}

	@Override
	public void showGirls(List<Girl> list) {
		listView.setAdapter(new GirlAdapter(this, list));

	}
	@Override
	protected GirlPresenterV2 createPresenter() {
		return new GirlPresenterV2();
	}

	public void testHttp(View view){
		Intent i = new Intent(this, WeatherAcy.class);
		startActivity(i);
	}

}
