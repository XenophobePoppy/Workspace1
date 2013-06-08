package com.zoom.application;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class IndexActivity extends Activity implements OnClickListener{

	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.indexview);
        

        Button button = (Button) this.findViewById(R.id.buttonisd);
        button.setOnClickListener(this);
    }
    
    
    	public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setClass(IndexActivity.this, ISDActivity.class);
                    startActivity(intent);
            
    	}
    	
    }

