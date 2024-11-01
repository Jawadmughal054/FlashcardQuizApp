package com.example.flashcardquizapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class QuizActivity extends AppCompatActivity {

    private int score = 0;
    private int currentQuestion = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        Button buttonSubmitAnswer = findViewById(R.id.button_submit_answer);
        final EditText editTextAnswer = findViewById(R.id.editText_answer);
        final TextView textViewQuestion = findViewById(R.id.textView_question);
        final TextView textViewScore = findViewById(R.id.textView_score);

        // For simplicity, let's assume we have a list of questions and answers
        String[] questions = {"What is Android?", "What is Java?"};
        String[] answers = {"An operating system", "A programming language"};

        textViewQuestion.setText(questions[currentQuestion]);

        buttonSubmitAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userAnswer = editTextAnswer.getText().toString();
                if (userAnswer.equalsIgnoreCase(answers[currentQuestion])) {
                    score++;
                    textViewScore.setText("Score: " + score);
                }

                currentQuestion++;
                if (currentQuestion < questions.length) {
                    textViewQuestion.setText(questions[currentQuestion]);
                    editTextAnswer.setText("");
                } else {
                    // Quiz finished
                    textViewQuestion.setText("Quiz finished! Your score: " + score);

                }
            }
        });
    }
}