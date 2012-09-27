package com.mayuri.learndroid;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class Contents extends Activity {

	TextView txtNewApp;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_contents);
       getActionBar().setDisplayHomeAsUpEnabled(true);
        txtNewApp = (TextView) this.findViewById(R.id.txtNewApp);
        
        txtNewApp.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			
				Toast.makeText(Contents.this, "New App", Toast.LENGTH_LONG).show();
				
			}
		});
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_contents, menu);
        return true;
    }

    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
