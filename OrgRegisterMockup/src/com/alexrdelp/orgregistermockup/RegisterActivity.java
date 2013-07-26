package com.alexrdelp.orgregistermockup;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends Activity {

	private EditText OrganizationNameField;
	private EditText EmailField2;
	private EditText PasswordField2;
	private EditText PasswordField2Confirm;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		
		
		OrganizationNameField = (EditText) findViewById(R.id.OrganizationNameField);
		EmailField2 = (EditText) findViewById(R.id.EmailField2);
		PasswordField2 = (EditText) findViewById(R.id.PasswordField2);
		PasswordField2Confirm = (EditText) findViewById(R.id.PasswordField2Confirm);
		
		Button RegisterButton = (Button) findViewById(R.id.RegisterButton2);
		
		RegisterButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				tryToRegister();
				
			}
		});
	}

	void tryToRegister()
	{
		getUserInfo();
		//TODO make sure email is acceptable
		//TODO check if exists already
		//TODO check of passwords match
		//TODO show a message indicating failure or success
		//TODO and possible redirecting to a confirmation email 
		//switch to sign in activity
		startActivity(new Intent(getApplicationContext(), SignIn.class));
	}
	
	void getUserInfo()
	{
		
	}
}
