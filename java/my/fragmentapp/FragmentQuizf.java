package my.fragmentapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;

public class FragmentQuizf extends Fragment {

    // ...

    public FragmentQuizf() {
        // Required empty public constructor
    }

    // ...

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_quizf, container, false);

        // ResultActivity로 이동하는 버튼 클릭 이벤트 처리
        Button goToResultButton = rootView.findViewById(R.id.button2);
        goToResultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 마지막으로 선택한 라디오 버튼 가져오기
                int selectedButton = 0;
                RadioButton radioButton15 = rootView.findViewById(R.id.radioButton15);
                RadioButton radioButton16 = rootView.findViewById(R.id.radioButton16);
                RadioButton radioButton17 = rootView.findViewById(R.id.radioButton17);
                RadioButton radioButton18 = rootView.findViewById(R.id.radioButton18);
                RadioButton radioButton19 = rootView.findViewById(R.id.radioButton19);

                if (radioButton15.isChecked()) {
                    selectedButton = 1;
                } else if (radioButton16.isChecked()) {
                    selectedButton = 2;
                } else if (radioButton17.isChecked()) {
                    selectedButton = 3;
                } else if (radioButton18.isChecked()) {
                    selectedButton = 4;
                } else if (radioButton19.isChecked()) {
                    selectedButton = 5;
                }

                // ResultActivity로 이동하는 인텐트 생성
                Intent intent = new Intent(getActivity(), ResultActivity.class);
                intent.putExtra("selectedButton", selectedButton);
                startActivity(intent);
            }
        });

        return rootView;
    }
}