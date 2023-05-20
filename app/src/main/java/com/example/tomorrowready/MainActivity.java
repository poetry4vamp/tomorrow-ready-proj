package com.example.tomorrowready;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button compassButton;
    private Button hotlineButton;
    private Button planButton;
    private Button updatesButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //compass tool button
        compassButton = (Button) findViewById(R.id.btn_compass);
        compassButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CompassTool.class);
                startActivity(intent);
            }
        });

        //emergency hotline button
        hotlineButton = (Button) findViewById(R.id.button4_hotline);
        hotlineButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CompassTool.class);
                startActivity(intent);
            }
        });

        //preparedness plan button
        planButton = (Button) findViewById(R.id.button_plan);
        planButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CompassTool.class);
                startActivity(intent);
            }
        });

        //monitoring updates button
        updatesButton = (Button) findViewById(R.id.button2_updates);
        updatesButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CompassTool.class);
                startActivity(intent);
            }
        });

    }
}
