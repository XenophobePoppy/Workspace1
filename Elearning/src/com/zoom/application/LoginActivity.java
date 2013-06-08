package com.zoom.application;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
 
public class LoginActivity extends Activity implements OnClickListener{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setting default screen to login.xml
        setContentView(R.layout.login);
 
        Button btnLogin = (Button) this.findViewById(R.id.btnLogin);
        
        btnLogin.setOnClickListener(this);
    }

	@Override
	public void onClick(View v) {
		Intent i = new Intent(getApplicationContext(), IndexActivity.class);
        startActivity(i);// TODO Auto-generated method stub
        EditText editUser = (EditText)this.findViewById(R.id.editUser);
        String text= editUser.getText().toString();
        
       
	}
	
    }
    
