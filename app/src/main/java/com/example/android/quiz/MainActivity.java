package com.example.android.quiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    boolean isIncremented = false;
    int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
   public void submit(View view){
       RadioButton que1 =(RadioButton) findViewById(R.id.radiobutton1) ;

       if(que1.isChecked())
               score = score + 1;

       RadioButton que2 = (RadioButton) findViewById(R.id.radiobutton2);
       boolean hasAns2 = que2.isChecked();

       if(hasAns2)
           score = score + 1;

       RadioButton que3 = (RadioButton) findViewById(R.id.radiobutton3);
       boolean hasAns3 = que3.isChecked();

       if(hasAns3)
           score = score + 1;

       RadioButton que4 = (RadioButton) findViewById(R.id.radiobutton4);
       boolean hasAns4 = que4.isChecked();

       if(hasAns4)
           score = score + 1;


       CheckBox que5a = (CheckBox) findViewById(R.id.checkbox1);
       CheckBox que5b = (CheckBox) findViewById(R.id.checkbox2);
       CheckBox que5c = (CheckBox) findViewById(R.id.checkbox3);
       boolean hasAns5c = que5c.isChecked();

      if (que5a.isChecked() && que5b.isChecked() && !que5c.isChecked() )
          score = score+1;



           EditText enterAnswer = (EditText) (findViewById(R.id.editText));
       String s = enterAnswer.getText().toString();
            if (s.equals("xyz")){
               score+=1;}

          textView();
       ;

       }

    public void textView (){
        TextView textView=(TextView) findViewById(R.id.textView);
        textView.setText("" + score);
        score=0;
    }
}

