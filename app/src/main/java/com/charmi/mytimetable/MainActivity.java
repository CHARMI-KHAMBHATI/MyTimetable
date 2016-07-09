package com.charmi.mytimetable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // monday button
        Button button_monday = (Button) findViewById(R.id.monday);
        button_monday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToMondayActivity();
            }
        });

        // tuesday button
       Button button_tuesday = (Button) findViewById(R.id.tuesday);
        button_tuesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToTuesdayActivity();
            }
        });

        // weednesday
        Button button_wednesday = (Button) findViewById(R.id.wednesday);
        button_wednesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToWednesdayActivity();
            }
        });

        // thursday
        Button button_thursday = (Button) findViewById(R.id.thursday);
        button_thursday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToThursdayActivity();
            }
        });

        // friday
        Button button_friday = (Button) findViewById(R.id.friday);
        button_friday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToFridayActivity();
            }
        });

        // saturday
        Button button_saturday = (Button) findViewById(R.id.saturday);
        button_saturday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSaturdayActivity();
            }
        });
    }

    private void goToMondayActivity() {
        Intent intent = new Intent(this, monday.class);
        startActivity(intent);

    }

    private void goToTuesdayActivity() {
        Intent intent = new Intent(this, tuesday.class);
        startActivity(intent);

    }

    private void goToWednesdayActivity() {
        Intent intent = new Intent(this, wednesday.class);
        startActivity(intent);

    }
    private void goToThursdayActivity() {
        Intent intent = new Intent(this, thursday.class);
        startActivity(intent);

    }private void goToFridayActivity() {
        Intent intent = new Intent(this, friday.class);
        startActivity(intent);

    }private void goToSaturdayActivity() {
        Intent intent = new Intent(this, saturday.class);
        startActivity(intent);

    }
}
