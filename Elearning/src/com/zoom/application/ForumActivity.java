package com.zoom.application;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;


public class ForumActivity extends Activity {

	private TextView textview;
	// private EditText m_EditText;
   

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
     super.onCreate(savedInstanceState);
     setContentView(R.layout.forum);
     final EditText editText=(EditText)findViewById(R.id.editf);  
     //监听回车键  
     editText.setOnEditorActionListener(new OnEditorActionListener() {  
         public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {  
             Toast.makeText(ForumActivity.this, String.valueOf(actionId), Toast.LENGTH_SHORT).show();  
             return false;  
         }  
     });  
     Button getValue=(Button)findViewById(R.id.submit); 
     textview=(TextView) this.findViewById(R.id.TextViewforum);
     getValue.setOnClickListener(new OnClickListener() {  
         @Override  
         public void onClick(View v) {  
             Toast.makeText(ForumActivity.this, editText.getText().toString(), Toast.LENGTH_SHORT).show(); 
             
             textview.setText(editText.getText());
         }  
     }); 
    
      
}
}
    