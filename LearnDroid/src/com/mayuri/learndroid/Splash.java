package com.mayuri.learndroid;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class Splash extends Activity {

	private final int SPLASH_DISPLAY_LENGHT = 3000;	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        
          new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(Splash.this,Home.class);
                Splash.this.startActivity(mainIntent);
                Splash.this.finish();
            }
        }, SPLASH_DISPLAY_LENGHT);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_splash, menu);
        return true;
    }
}
