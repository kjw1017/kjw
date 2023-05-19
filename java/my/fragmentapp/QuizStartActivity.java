package my.fragmentapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizStartActivity extends AppCompatActivity {

    Fragment fragment;

    Button next;

    int prob_count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_start);
        next = findViewById(R.id.next);

        fragment = new FragmentQuiz1();

        transaction(fragment);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                prob_count++;
                if (prob_count == 2) {
                    fragment = new FragmentQuiz2();
                    transaction(fragment);
                } else if(prob_count == 3) {
                    fragment = new FragmentQuiz3();
                    transaction(fragment);
                } else if(prob_count == 4) {
                    fragment = new FragmentQuiz4();
                    transaction(fragment);
                } else if(prob_count == 5) {
                    fragment = new FragmentQuiz5();
                    transaction(fragment);
                }else if(prob_count == 6) {
                    fragment = new FragmentQuiz6();
                    transaction(fragment);
                } else if(prob_count == 7) {
                    fragment = new FragmentQuiz7();
                    transaction(fragment);
                }else if(prob_count == 8) {
                    fragment = new FragmentQuiz8();
                    transaction(fragment);
                }else if(prob_count == 9) {
                    fragment = new FragmentQuiz9();
                    transaction(fragment);
                }else if(prob_count == 10) {
                    fragment = new FragmentQuiz10();
                    transaction(fragment);
                }else if(prob_count == 11) {
                    fragment = new FragmentQuiz11();
                    transaction(fragment);
                }else if(prob_count == 12) {
                    fragment = new FragmentQuiz12();
                    transaction(fragment);
                }else if(prob_count == 13) {
                    fragment = new FragmentQuiz13();
                    transaction(fragment);
                }else if(prob_count == 14) {
                    fragment = new FragmentQuiz14();
                    transaction(fragment);
                }else if(prob_count == 15) {
                    fragment = new FragmentQuiz15();
                    transaction(fragment);
                    next.setText("문제완료");
                }else if(prob_count == 16) {
                    fragment = new FragmentQuiz16();
                    transaction(fragment);
                    next.setText("문제완료");
                }


            }
        });
        }
    public void transaction(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        ft.replace(R.id.framelayoutid, fragment,"Quiz");
        ft.commit();
    }
}