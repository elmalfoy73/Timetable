package bottomnav.hitherejoe.com.bottomnavigationsample;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textTimetable;
    private TextView textAssigment;
    private TextView textSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textTimetable = (TextView) findViewById(R.id.text_timetable);
        textAssigment = (TextView) findViewById(R.id.text_schedules);
        textSetting = (TextView) findViewById(R.id.text_music);

        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.action_favorites:
                                textTimetable.setVisibility(View.VISIBLE);
                                textAssigment.setVisibility(View.GONE);
                                textSetting.setVisibility(View.GONE);
                                break;
                            case R.id.action_schedules:
                                textTimetable.setVisibility(View.GONE);
                                textAssigment.setVisibility(View.VISIBLE);
                                textSetting.setVisibility(View.GONE);
                                break;
                            case R.id.action_music:
                                textTimetable.setVisibility(View.GONE);
                                textAssigment.setVisibility(View.GONE);
                                textSetting.setVisibility(View.VISIBLE);
                                break;
                        }
                        return false;
                    }
                });
    }
}

