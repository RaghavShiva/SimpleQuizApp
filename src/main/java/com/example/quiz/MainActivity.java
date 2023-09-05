package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   String[] ques={"Java is a person?","Java was introduced in 1233?",
  "Java was created using Python?","Java has abstract classes?",
          "Java supports interface?"};
   boolean[] ans={false,false,false,true,true};
   int score=0;
  Button yes;
  Button no;
  TextView question;
   int index = 0;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        question=findViewById(R.id.question);

        yes=findViewById(R.id.yes);
        no=findViewById(R.id.no);
        question.setText(ques[0]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index < ques.length) {
                    if (ans[index])
                        score++;
                    index++;
                    if (index < ques.length)
                        question.setText(ques[index]);
                    else{
                        Toast.makeText(MainActivity.this, "Your score is: " +score+"/"+ques.length, Toast.LENGTH_SHORT).show();
                    Toast.makeText(MainActivity.this, "Restart the app to attempt again", Toast.LENGTH_SHORT).show();
                } }
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if(index < ques.length){
                        if(!ans[index])
                            score++;
                        index++;
                        if(index<ques.length)
                            question.setText(ques[index]);
                        else {
                            Toast.makeText(MainActivity.this, "Your score is: " + score + "/" + ques.length, Toast.LENGTH_SHORT).show();
                            Toast.makeText(MainActivity.this, "Restart the app to attempt again", Toast.LENGTH_SHORT).show();
                        }
                    }
            }
        });

    }

}
