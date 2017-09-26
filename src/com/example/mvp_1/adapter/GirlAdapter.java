package com.example.mvp_1.adapter;

import java.util.List;

import com.example.mvp_1.R;
import com.example.mvp_1.bean.Girl;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GirlAdapter extends BaseAdapter {
	List<Girl> list;
	Context context;

	public GirlAdapter(Context context, List<Girl> list) {
		this.list = list;
		this.context = context;
	}

	@Override
	public int getCount() {
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder = null;
		if (convertView == null) {
			holder = new ViewHolder();
			convertView = LayoutInflater.from(parent.getContext()).inflate(
					R.layout.item_v1, parent, false);
			holder.head = (ImageView) convertView.findViewById(R.id.head);
			holder.content = (TextView) convertView.findViewById(R.id.content);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		Girl girl = list.get(position);
		holder.head.setImageResource(girl.getHead());
		holder.content.setText(girl.getContent());
		return convertView;
	}

	static class ViewHolder {
		TextView content;
		ImageView head;
	}
}
