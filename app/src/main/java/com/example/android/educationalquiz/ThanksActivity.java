package com.example.android.educationalquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class ThanksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanks);

        Intent intent=getIntent();
        String userName=intent.getStringExtra("username");
        String score=intent.getStringExtra("scores");

        int result=Integer.parseInt(score);

        ImageView imageView=(ImageView)findViewById(R.id.sad);
        switch (result){
            case 0:
            case 1:
            case 2:
                imageView.setImageResource(R.drawable.sad);
                break;
            case 3:
            case 4:
            case 5:
                imageView.setImageResource(R.drawable.ok);
                break;
            case 6:
            case 7:
            case 8:
                imageView.setImageResource(R.drawable.good);
                break;
            case 9:
            case 10:
                imageView.setImageResource(R.drawable.excellent);
                break;
        }

        TextView welcome=(TextView)findViewById(R.id.welcome);
        welcome.setText(getResources().getString(R.string.thanks)+" "+userName+"\nYour Scores are "+score);
    }
}
