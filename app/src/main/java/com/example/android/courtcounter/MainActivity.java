package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //GLOBAL VARIABLES:
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    TextView myView;

    final int FIELDGOAL = 3;
    //TextView)findViewById(R.id.team_a_score).setText(scoreTeamA));


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //myView = (TextView)findViewById(R.id.team_a_score);
        //myView.setText(scoreTeamA);

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("scoreTeamA", scoreTeamA);
        outState.putInt("scoreTeamB", scoreTeamB);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        //displayForTeamA(scoreTeamA);
        //displayForTeamB(scoreTeamB);
        scoreTeamA = savedInstanceState.getInt("scoreTeamA");
        scoreTeamB = savedInstanceState.getInt("scoreTeamB");
        //myView.setText(scoreTeamA);
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

    /* BUTTONS
        increment score for either team A or B by 7
     */
    public void incrementByTD(View view) {
        if (view.getId() == R.id.buttonTDA) {
            scoreTeamA = scoreTeamA + 7;
            displayForTeamA(scoreTeamA);
        } else {
            scoreTeamB = scoreTeamB + 7;
            displayForTeamB(scoreTeamB);
        }
    }

    /* BUTTONS
        increment score for either team A or B by 8
     */
    public void incrementByTD2(View view) {
        if (view.getId() == R.id.buttonTD2A) {
            scoreTeamA = scoreTeamA + 8;
            displayForTeamA(scoreTeamA);
        } else {
            scoreTeamB = scoreTeamB + 8;
            displayForTeamB(scoreTeamB);
        }
    }

    /* BUTTONS
        increment score for either team A or B by FIELDGOAL
     */
    public void incrementByFG(View view) {

        if (view.getId() == R.id.buttonFGA) {
            scoreTeamA = scoreTeamA + FIELDGOAL;
            displayForTeamA(scoreTeamA);
        } else {
            scoreTeamB = scoreTeamB + FIELDGOAL;
            displayForTeamB(scoreTeamB);
        }
    }

    /* BUTTONS
    reset score for either team A or B
    */
    public void incrementBySafety(View view) {

        if (view.getId() == R.id.buttonSafetyA) {
            scoreTeamA = scoreTeamA + 2;
            displayForTeamA(scoreTeamA);
        } else {
            scoreTeamB = scoreTeamB + 2;
            displayForTeamB(scoreTeamB);
        }
    }

    /* BUTTONS
    reset score for both global Variables and then displays them
    */
    public void resetScoreAll(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);


    }

}
