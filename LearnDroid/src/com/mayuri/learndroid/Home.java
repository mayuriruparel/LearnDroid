package com.mayuri.learndroid;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Home extends Activity {

	Button btnContents;
	Button btnAbtUs;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btnContents = (Button) this.findViewById(R.id.btnContents);
        btnAbtUs =(Button)this.findViewById(R.id.btnAbtUs);
        
        btnContents.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				 Intent mainIntent = new Intent(Home.this,Contents.class);
	                Home.this.startActivity(mainIntent);
	              
				
			}
		});
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_home, menu);
        return true;
    }
}
