package com.zoom.application;

import com.zoom.application.R.id;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SlidingDrawer;

public class ISDActivity extends Activity implements OnClickListener{
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setting default screen to login.xml
        setContentView(R.layout.isd);
        Button buttonisdlec1 = (Button) this.findViewById(R.id.buttonisdlec1);
        Button button1 = (Button) this.findViewById(R.id.isdback);
        Button button2 = (Button) this.findViewById(R.id.isdf);
        SlidingDrawer sd = (SlidingDrawer)this.findViewById(R.id.slidingisd); 
        buttonisdlec1.setOnClickListener((OnClickListener) this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        }

	@Override
	public void onClick(View v) {
		switch (v.getId()){
		case R.id.isdback:
		Intent intent = new Intent();
        intent.setClass(ISDActivity.this, IndexActivity.class);
        startActivity(intent);
        break;
		case R.id.isdf:
			Intent intent1 = new Intent();
	        intent1.setClass(ISDActivity.this, ForumActivity.class);
	        startActivity(intent1); 
			break;
		case R.id.buttonisdlec1:
			Intent intent2 = new Intent();
	        intent2.setClass(ISDActivity.this, Lecture1.class);
	        startActivity(intent2); 
			break;
		case R.id.buttonisdlec2:
			Intent intent3 = new Intent();
	        intent3.setClass(ISDActivity.this, Lecture2.class);
	        startActivity(intent3); 
			break;
		}
	}
}
