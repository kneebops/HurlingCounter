package com.example.android.hurlingcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreKilkenny = 0;
    int scoreGalway = 0;
    int reset = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Kilkenny.
     */
    public void displayForKilkenny(int score) {
        TextView scoreView = (TextView) findViewById(R.id.kilkenny_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds 3 points to Kilkenny.
     */
    public void threePointsKilkenny(View view) {
        scoreKilkenny = scoreKilkenny + 3;
        displayForKilkenny(scoreKilkenny);

    }

    /**
     * Adds 1 point to Kilkenny.
     */
    public void onePointKilkenny(View view) {
        scoreKilkenny = scoreKilkenny + 1;
        displayForKilkenny(scoreKilkenny);

    }

    /**
     * Displays the given score for Galway.
     */
    public void displayForGalway(int score) {
        TextView scoreView = (TextView) findViewById(R.id.galway_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds 3 points to Galway.
     */
    public void threePointsGalway(View view) {
        scoreGalway = scoreGalway + 3;
        displayForGalway(scoreGalway);

    }

    /**
     * Adds 1 point to Galway.
     */
    public void onePointGalway(View view) {
        scoreGalway = scoreGalway + 1;
        displayForGalway(scoreGalway);

    }

    public void reset(View view) {
        scoreKilkenny = reset;
        displayForKilkenny(scoreKilkenny);
        scoreGalway = reset;
        displayForGalway(scoreGalway);
    }
}
