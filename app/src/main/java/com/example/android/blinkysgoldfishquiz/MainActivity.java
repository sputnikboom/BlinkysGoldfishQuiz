package com.example.android.blinkysgoldfishquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.time.chrono.Chronology;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * Checks the answers given when the SUBMIT button is pressed
     */

    public void submitAnswers(View view) {

        int finalQuizScore = calculateScore();

        //Displays the user's Score as a Toast
        if (finalQuizScore == 10) {
            Toast.makeText(this, "Perfect Score! 10/10", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Try again! " + finalQuizScore + "/10", Toast.LENGTH_SHORT).show();
        }
    }

    private int calculateScore() {

        int quizScore = 0;

        //Checks the score for radioButton questions

        boolean question1 = ((RadioButton) findViewById(R.id.q1_b)).isChecked();
        if (question1) {
            quizScore += 1;
        }

        boolean question2 = ((RadioButton) findViewById(R.id.q2_c)).isChecked();
        if (question2) {
            quizScore += 1;
        }

        boolean question4 = ((RadioButton) findViewById(R.id.q4_a)).isChecked();
        if (question4) {
            quizScore += 1;
        }

        boolean question6 = ((RadioButton) findViewById(R.id.q6_c)).isChecked();
        if (question6) {
            quizScore += 1;
        }

        boolean question7 = ((RadioButton) findViewById(R.id.q7_a)).isChecked();
        if (question7) {
            quizScore += 1;
        }

        boolean question8 = ((RadioButton) findViewById(R.id.q8_false)).isChecked();
        if (question8) {
            quizScore += 1;
        }

        boolean question9 = ((RadioButton) findViewById(R.id.q9_false)).isChecked();
        if (question9) {
            quizScore += 1;
        }

        boolean question10 = ((RadioButton) findViewById(R.id.q10_true)).isChecked();
        if (question10) {
            quizScore += 1;
        }

        //Checks which of the CheckBoxes have been selected
        // if all correct options are selected, increases the user's score

        boolean question3a = ((CheckBox) findViewById(R.id.q3_a)).isChecked();
        boolean question3b = ((CheckBox) findViewById(R.id.q3_b)).isChecked();
        boolean question3c = ((CheckBox) findViewById(R.id.q3_c)).isChecked();
        boolean question3d = ((CheckBox) findViewById(R.id.q3_d)).isChecked();
        boolean question3e = ((CheckBox) findViewById(R.id.q3_e)).isChecked();
        if ((question3a) && (question3b) && (question3c) && (question3d) && (!question3e)) {
            quizScore += 1;
        }


        //Checks the score of EditText question (5) when user clicks Submit

        String q5Answer = ((EditText) findViewById(R.id.question_5)).getText().toString();
        if (q5Answer.equalsIgnoreCase("China")) {
            quizScore += 1;
        }

        return quizScore;


    }
}