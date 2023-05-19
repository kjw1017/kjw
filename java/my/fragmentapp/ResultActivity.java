package my.fragmentapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private int score = 0;

    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        resultTextView = findViewById(R.id.result_text_view);

        // 이전 Activity에서 전달된 데이터 가져오기
        int correctAnswers = getIntent().getIntExtra("correctAnswers", 0);
        int totalQuestions = getIntent().getIntExtra("totalQuestions", 0);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int correctAnswer1 = extras.getInt("correctAnswer1", 0);
            int correctAnswer2 = extras.getInt("correctAnswer2", 0);
            if (correctAnswer1 == 1) {
                score++; // 정답인 경우 score 증가
            }
            if (correctAnswer2 == 1) {
                score++; // 정답인 경우 score 증가
            }
        }

        // 결과 화면에 맞힌 문제 수와 전체 문제 수 표시
        String resultText = "맞힌 문제: " + correctAnswers + "/" + totalQuestions;
        resultTextView.setText(resultText);
    }
}