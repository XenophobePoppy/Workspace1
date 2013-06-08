package com.zoom.application;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Toast;

public class Lecture1 extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lecture1);

		//定义UI组件
		final ImageView iv= (ImageView)findViewById(R.id.ImageView01);
		Gallery g = (Gallery) findViewById(R.id.Gallerylecture);

		//设置图片匹配器
		g.setAdapter(new ImageAdapter(this));

		//设置AdapterView点击监听器，Gallery是AdapterView的子类
		g.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				//显示点击的是第几张图片
				Toast.makeText(Lecture1.this, "" + position,
						Toast.LENGTH_LONG).show();
				//设置背景部分的ImageView显示当前Item的图片
				iv.setImageResource(((ImageView)view).getId());
			}
		});
	}

	//定义继承BaseAdapter的匹配器
	public class ImageAdapter extends BaseAdapter {

		//Item的修饰背景
		int mGalleryItemBackground;

		//上下文对象
		private Context mContext;

		//图片数组
		private Integer[] mImageIds = { R.drawable.lecture1,
				R.drawable.lecture1, R.drawable.lecture2,
				R.drawable.lecture3};

		//构造方法
		public ImageAdapter(Context c){
			mContext = c;
			//读取styleable资源
	        TypedArray a = obtainStyledAttributes(R.styleable.Gallerylecture);
	        mGalleryItemBackground = a.getResourceId(
	                R.styleable.Gallerylecture_android_galleryItemBackground, 0);
	        a.recycle();

		}

		//返回项目数量
		@Override
		public int getCount() {
			return mImageIds.length;
		}

		//返回项目
		@Override
		public Object getItem(int position) {
			return position;
		}

		//返回项目Id
		@Override
		public long getItemId(int position) {
			return position;
		}

		//返回视图
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {

			ImageView iv = new ImageView(mContext);
			iv.setImageResource(mImageIds[position]);
			//给生成的ImageView设置Id，不设置的话Id都是-1
			iv.setId(mImageIds[position]);
			iv.setLayoutParams(new Gallery.LayoutParams(120, 160));
			iv.setScaleType(ImageView.ScaleType.FIT_XY);
			iv.setBackgroundResource(mGalleryItemBackground);
			return iv;
		}

	}
}