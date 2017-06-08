package com.iflytek.voice;

import com.iflytek.sunflower.FlowerCollector;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.Toast;
import com.polly.R;

public class IflytekActivity extends AppCompatActivity {

	private static final String TAG = IflytekActivity.class.getSimpleName();
	private Toast mToast;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.main);
		
//		mToast = Toast.makeText(this, "", Toast.LENGTH_SHORT);
//		SimpleAdapter listitemAdapter = new SimpleAdapter();
//		((ListView) findViewById(R.id.listview_main)).setAdapter(listitemAdapter);
	}

//	@Override
//	public void onClick(View view) {
//		int tag = Integer.parseInt(view.getTag().toString());
//		Intent intent = null;
//		switch (tag) {
//		case 0:
//			// 语音转写
//			intent = new Intent(IflytekActivity.this, IatDemo.class);
//			break;
//		case 1:
//			// 语法识别
//			intent = new Intent(IflytekActivity.this, AsrDemo.class);
//			break;
//		case 2:
//			// 语义理解
//			intent = new Intent(IflytekActivity.this, UnderstanderDemo.class);
//			break;
//		case 3:
//			// 语音合成
//			intent = new Intent(IflytekActivity.this, TtsDemo.class);
//			break;
//		case 4:
//			// 语音评测
//			intent = new Intent(IflytekActivity.this, IseDemo.class);
//			break;
//		case 5:
//			// 唤醒
//			showTip("请登录：http://www.xfyun.cn/ 下载体验吧！");
//			break;
//		case 6:
//			// 声纹
//		default:
//			showTip("在IsvDemo中哦，为了代码简洁，就不放在一起啦，^_^");
//			break;
//		}
//
//		if (intent != null) {
//			startActivity(intent);
//		}
//	}
//
//	// Menu 列表
//	String items[] = { "立刻体验语音听写", "立刻体验语法识别", "立刻体验语义理解", "立刻体验语音合成",
//			"立刻体验语音评测", "立刻体验语音唤醒", "立刻体验声纹密码" };
//
//	private class SimpleAdapter extends BaseAdapter {
//		public View getView(int position, View convertView, ViewGroup parent) {
//			if (null == convertView) {
//				LayoutInflater factory = LayoutInflater.from(IflytekActivity.this);
//				View mView = factory.inflate(R.layout.list_items, null);
//				convertView = mView;
//			}
//
//			Button btn = (Button) convertView.findViewById(R.id.btn);
//			btn.setOnClickListener(IflytekActivity.this);
//			btn.setTag(position);
//			btn.setText(items[position]);
//
//			return convertView;
//		}
//
//		@Override
//		public int getCount() {
//			return items.length;
//		}
//
//		@Override
//		public Object getItem(int position) {
//			return null;
//		}
//
//		@Override
//		public long getItemId(int position) {
//			return 0;
//		}
//	}
//
//	private void showTip(final String str) {
//		mToast.setText(str);
//		mToast.show();
//	}
//
//	@Override
//	protected void onResume() {
//		// 开放统计 移动数据统计分析
//		FlowerCollector.onResume(IflytekActivity.this);
//		FlowerCollector.onPageStart(TAG);
//		super.onResume();
//	}
//
//	@Override
//	protected void onPause() {
//		// 开放统计 移动数据统计分析
//		FlowerCollector.onPageEnd(TAG);
//		FlowerCollector.onPause(IflytekActivity.this);
//		super.onPause();
//	}
}
