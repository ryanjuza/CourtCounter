package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    public void plusTwoForA (View view){
        scoreTeamA= scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    public void plusThreeForA (View view){
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    public void plusOneForA (View view){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void plusTwoForB (View view){
        scoreTeamB= scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    public void plusThreeForB (View view){
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    public void plusOneForB (View view){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Resets score.
     */
    public void reset (View view){
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
        scoreTeamB = 0;
        displayForTeamB(scoreTeamB);
    }
}
