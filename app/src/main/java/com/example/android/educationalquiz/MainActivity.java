package com.example.android.educationalquiz;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast welcome=Toast.makeText(this,"Welcome",Toast.LENGTH_LONG);
        welcome.show();
    }
//declare & initialize variables
    int scoreQ1=0;
    int scoreQ2=0;
    int scoreQ3=0;
    int scoreQ4=0;
    int scoreQ5=0;
    int scoreQ6=0;
    int scoreQ7=0;
    int scoreQ8=0;
    int scoreQ9=0;
    int scoreQ10=0;
    int result;

    /**
     * check the answers of the questions
     * @param view
     */
    public void checkQuiz(View view) {
        //check the answer if true or false for first question
        TextView won_1=(TextView)findViewById(R.id.quiz1state);
        won_1.setTextColor(Color.RED);

        RadioButton third =(RadioButton)findViewById(R.id.thirdRadioButton);

        if(third.isChecked()) {
            scoreQ1=1;
            won_1.setText(scoreQ1+"/1");

        }
        else {
            won_1.setText(scoreQ1+"/1");
        }

        //check the answer if true or false for third question
        TextView won_2=(TextView)findViewById(R.id.quiz3state);
        won_2.setTextColor(Color.RED);

        RadioButton first=(RadioButton)findViewById(R.id.ramadan);
        if(first.isChecked()){
            scoreQ2=1;
            won_2.setText(scoreQ2+"/1");
        }
        else won_2.setText(scoreQ2+"/1");
        //check the answer if true or false for fourth question
        TextView won_3=(TextView)findViewById(R.id.quiz1Mathstate);
        won_3.setTextColor(Color.RED);

        RadioButton thirdMath =(RadioButton)findViewById(R.id.thirdRadioButtonMath);

        if(thirdMath.isChecked()) {
            scoreQ3=1;
            won_3.setText(scoreQ3+"/1");

        }
        else {
            won_3.setText(scoreQ3+"/1");
        }
        //check the answer if true or false for fifth question
        TextView won_4=(TextView)findViewById(R.id.quiz2Mathstate);
        won_4.setTextColor(Color.RED);

        CheckBox firstCheckBoxMath=(CheckBox)findViewById(R.id.firstBoxMath);
        CheckBox secondCheckBoxMath=(CheckBox)findViewById(R.id.secondBoxMath);
        CheckBox thirdCheckBoxMath=(CheckBox)findViewById(R.id.thirdBoxMath);
        CheckBox fourthCheckBoxMath=(CheckBox)findViewById(R.id.fourthBoxMath);

        if(firstCheckBoxMath.isChecked()&&secondCheckBoxMath.isChecked()&&thirdCheckBoxMath.isChecked()&&!fourthCheckBoxMath.isChecked()){
            scoreQ4=1;
            won_4.setText(scoreQ4+"/1");
        }
        else {
            won_4.setText(scoreQ4+"/1");
        }

        EditText catEditText=(EditText)findViewById(R.id.catEditText);
        TextView catText=(TextView)findViewById(R.id.catText);
        catText.setTextColor(Color.RED);
        if(catEditText.getText().toString().equalsIgnoreCase("cat")){
            scoreQ5=1;
            catText.setText(scoreQ5+"/1");
        }
        else catText.setText(scoreQ5+"/1");

        EditText cowEditText=(EditText)findViewById(R.id.cowEditText);
        TextView cowText=(TextView)findViewById(R.id.cowText);
        cowText.setTextColor(Color.RED);
        if(cowEditText.getText().toString().equalsIgnoreCase("cow")){
            scoreQ6=1;
            cowText.setText(scoreQ6+"/1");
        }
        else cowText.setText(scoreQ6+"/1");

        EditText rabbitEditText=(EditText)findViewById(R.id.rabbitEditText);
        TextView rabbitText=(TextView)findViewById(R.id.rabbitText);
        rabbitText.setTextColor(Color.RED);
        if(rabbitEditText.getText().toString().equalsIgnoreCase("rabbit")){
            scoreQ7=1;
            rabbitText.setText(scoreQ7+"/1");
        }
        else rabbitText.setText(scoreQ7+"/1");

        EditText lionEditText=(EditText)findViewById(R.id.lionEditText);
        TextView lionText=(TextView)findViewById(R.id.lionText);
        lionText.setTextColor(Color.RED);
        if(lionEditText.getText().toString().equalsIgnoreCase("lion")){
            scoreQ8=1;
            lionText.setText(scoreQ8+"/1");
        }
        else lionText.setText(scoreQ8+"/1");

        EditText sheepEditText=(EditText)findViewById(R.id.sheepEditText);
        TextView sheepText=(TextView)findViewById(R.id.sheepText);
        sheepText.setTextColor(Color.RED);
        if(sheepEditText.getText().toString().equalsIgnoreCase("sheep")){
            scoreQ9=1;
            sheepText.setText(scoreQ9+"/1");
        }
        else sheepText.setText(scoreQ9+"/1");

        EditText duckEditText=(EditText)findViewById(R.id.duckEditText);
        TextView duckText=(TextView)findViewById(R.id.duckText);
        sheepText.setTextColor(Color.RED);
        if(duckEditText.getText().toString().equalsIgnoreCase("duck")){
            scoreQ10=1;
        }
        duckText.setText(scoreQ10+"/1");

        //summing the scores
        result=scoreQ1+scoreQ2+scoreQ3+scoreQ4+scoreQ5+scoreQ6+scoreQ7+scoreQ8+scoreQ9+scoreQ10;

        //display toast for scores
        Toast toast= Toast.makeText(this,"your scores = "+result,Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL,Gravity.CENTER_HORIZONTAL,0);
        toast.show();
    }

    /**
     * function for sending scores and name for the second intent
     * @param view
     */
    public void SendData(View view) {
        EditText name=(EditText)findViewById(R.id.name);
        String userName= name.getText().toString();
        Intent intent=new Intent(MainActivity.this,ThanksActivity.class);
        intent.putExtra("username",userName);
        intent.putExtra("scores",(result)+"");
        startActivityForResult(intent,0);

    }
}
