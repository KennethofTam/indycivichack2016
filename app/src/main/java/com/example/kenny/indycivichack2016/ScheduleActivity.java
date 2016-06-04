package com.example.kenny.indycivichack2016;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Kenny on 6/4/2016.
 */
public class ScheduleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.schedule_page);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Button scheduleButton1 = (Button) findViewById(R.id.scheduleButton1);
        scheduleButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent init = new Intent( ScheduleActivity.this, MainActivity.class);
                startActivity(init);
            }
        });


    }

}
