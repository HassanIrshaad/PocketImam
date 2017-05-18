package com.test.hassan.pocketimam;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Hassan on 09-May-17.
 */

public class Fajr_Activity extends Activity {

    public int counter = 5;
   // public String test = "الله أكبر";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from new_activity.xml
        final MediaPlayer first_rakat = MediaPlayer.create(this, R.raw.first_rakat);
        final MediaPlayer final_rakat = MediaPlayer.create(this, R.raw.finishing_rakat);

        setContentView(R.layout.fajr_layout);

        final TextView countdown = (TextView) findViewById(R.id.countdown);
        final TextView rakat_title = (TextView) findViewById(R.id.rakat_title);

        Button button = (Button) findViewById(R.id.back_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Fajr_Activity.this,
                        MainActivity.class);
                startActivity(myIntent);
                first_rakat.stop();
                final_rakat.stop();
            }
        });

        Button playfajr = (Button) this.findViewById(R.id.play_button);
        playfajr.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                new CountDownTimer(7000, 1000){
                    public void onTick(long MillisUntilFinished){
                        countdown.setText(String.valueOf(counter));
                        counter--;
                        if(counter==0)
                            counter=0;
                    }
                    public void onFinish() {
                        countdown.setText(" ");
                        rakat_title.setText("2 Sunnah");
                        for(int i = 0; i<2; i++) {
                            first_rakat.start();
                            first_rakat.setOnCompletionListener(new MediaPlayer.OnCompletionListener(){
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    final_rakat.start();
                                    first_rakat.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            rakat_title.setText("2 Farz");
                                        }
                                    });
                                }
                            });
                        }
                        rakat_title.setText(" ");
                    }
                }.start();
               // if(counter == 0) {
                //    first_rakat.start();
                   // second_rakat.start();
               // }
            }
        });
    }
}

