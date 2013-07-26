package com.alexrdelp.orgregistermockup;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class InUseActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_in_use);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.in_use, menu);
		return true;
	}

}
