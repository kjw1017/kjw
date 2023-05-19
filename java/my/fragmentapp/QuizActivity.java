package my.fragmentapp;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class QuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
    }

    public void QuizStartActivity(View view) {  //xml의 onclick속성 이름 확인하기

        Intent intent = new Intent(QuizActivity.this,QuizStartActivity.class);

        //startActivity(intent);
        startActivityForResult(intent,1);  //밑줄은 다른 거 써달라는 요구(안고쳐도 됨)
    }
}