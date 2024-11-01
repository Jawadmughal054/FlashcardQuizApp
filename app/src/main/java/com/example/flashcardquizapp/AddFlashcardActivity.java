package com.example.flashcardquizapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class AddFlashcardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_flashcard);

        Button buttonSaveFlashcard = findViewById(R.id.button_save_flashcard);
        final EditText editTextQuestion = findViewById(R.id.editText_question);
        final EditText editTextAnswer = findViewById(R.id.editText_answer);

        buttonSaveFlashcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Save flashcard logic here
                // For simplicity, let's just display the question and answer
                String question = editTextQuestion.getText().toString();
                String answer = editTextAnswer.getText().toString();

                Intent intent = new Intent(AddFlashcardActivity.this, MainActivity.class);
                intent.putExtra("question", question);
                intent.putExtra("answer", answer);
                startActivity(intent);
            }
        });
    }
}