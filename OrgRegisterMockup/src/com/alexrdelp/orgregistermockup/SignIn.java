
package com.alexrdelp.orgregistermockup;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class SignIn extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sign_in);
		
		//define buttons
		Button SignInButton = (Button) findViewById(R.id.SignInButton2);
	
		//define button behavior
		SignInButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View v) {
				tryToSignIn();
				
			}
		});
	
	}



	void tryToSignIn()
	{
		//TODO read name and password info
		//TODO verify name and password info against a saved list of names and their passwords
		//if correct, call signed in activity InUseActivity.class
		startActivity(new Intent(getApplicationContext(), InUseActivity.class));
	}


}
