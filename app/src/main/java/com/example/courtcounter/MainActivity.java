package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void TeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.AScore);
        scoreView.setText(String.valueOf(score));
    }

    public void Point3A(View view) {
        scoreA += 3;
        TeamA(scoreA);
    }

    public void Point2A(View view) {
        scoreA += 2;
        TeamA(scoreA);
    }

    public void Point1A(View view) {
        scoreA += 1;
        TeamA(scoreA);
    }

    public void TeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.BScore);
        scoreView.setText(String.valueOf(score));
    }

    public void Point3B(View view) {
        scoreB += 3;
        TeamB(scoreB);
    }

    public void Point2B(View view) {
        scoreB += 2;
        TeamB(scoreB);
    }

    public void Point1B(View view) {
        scoreB += 1;
        TeamB(scoreB);
    }

    public void Reset(View view) {
        scoreA = 0;
        scoreB = 0;
        TeamA(scoreA);
        TeamB(scoreB);
    }
}