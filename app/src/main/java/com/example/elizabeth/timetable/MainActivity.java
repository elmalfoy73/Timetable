package com.example.elizabeth.timetable;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textTimetable;
    private TextView textAssigment;
    private TextView textSetting;
    private RecyclerView lessons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textTimetable = (TextView) findViewById(R.id.text_timetable);
        textAssigment = (TextView) findViewById(R.id.text_assigment);
        textSetting = (TextView) findViewById(R.id.text_setting);
        lessons = (RecyclerView) findViewById(R.id.lessons);

        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.action_timetable:
                                textTimetable.setVisibility(View.VISIBLE);
                                textAssigment.setVisibility(View.GONE);
                                textSetting.setVisibility(View.GONE);
                                lessons.setVisibility(View.VISIBLE);
                                break;
                            case R.id.action_assigment:
                                textTimetable.setVisibility(View.GONE);
                                textAssigment.setVisibility(View.VISIBLE);
                                textSetting.setVisibility(View.GONE);
                                break;
                            case R.id.action_setting:
                                textTimetable.setVisibility(View.GONE);
                                textAssigment.setVisibility(View.GONE);
                                textSetting.setVisibility(View.VISIBLE);
                                break;

                        }
                        return true;
                    }
                });
    }
}

