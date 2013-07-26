package com.alexrdelp.orgregistermockup;

import android.os.Bundle;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
    	super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
        Button SignInButton = (Button) findViewById(R.id.SignInButton);
        Button RegisterButton = (Button) findViewById(R.id.RegisterButton);
 
        SignInButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                changeToSignInActivity();
            }
        });
        
        RegisterButton.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View v)
        	{
        		changeToRegisterActivity();
        	}
        });        
    }
    
    void changeToRegisterActivity()
    {
    	startActivity(new Intent(getApplicationContext(), RegisterActivity.class));
    }
   
    void changeToSignInActivity()
    {
    	startActivity(new Intent(getApplicationContext(), SignIn.class));
    }
}
