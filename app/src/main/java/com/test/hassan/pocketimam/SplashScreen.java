package com.test.hassan.pocketimam;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by Hassan on 10-May-17.
 */

public class SplashScreen extends Activity {
    private static int splashInterval = 4000;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from new_activity.xml
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent);
                this.finish();
            }

            private void finish(){

            }
        }, splashInterval);
    }
}
