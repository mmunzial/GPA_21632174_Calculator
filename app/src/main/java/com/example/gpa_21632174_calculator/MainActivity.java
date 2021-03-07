package com.example.gpa_21632174_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import static java.sql.Types.NULL;

public class MainActivity extends AppCompatActivity {
    private EditText input_1,input_2,input_3,input_4,input_5;
    public int grade_1,grade_2,grade_3,grade_4,grade_5;
    TextView setOutput;
    ImageView imageview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button comp_gpa_button = (Button) findViewById(R.id.comp_gpa_button);
        imageview = findViewById(R.id.background);
        final TextView output = (TextView)findViewById(R.id.output);

        final EditText grade1text = (EditText) findViewById(R.id.class_1_grade);
        final EditText grade2text = (EditText) findViewById(R.id.class_2_grade);
        final EditText grade3text = (EditText) findViewById(R.id.class_3_grade);
        final EditText grade4text = (EditText) findViewById(R.id.class_4_grade);
        final EditText grade5text = (EditText) findViewById(R.id.class_5_grade);



        input_1 = findViewById(R.id.class_1_grade);
        input_2 = findViewById(R.id.class_2_grade);
        input_3 = findViewById(R.id.class_3_grade);
        input_4 = findViewById(R.id.class_4_grade);
        input_5 = findViewById(R.id.class_5_grade);

        comp_gpa_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (input_1.getText().toString().equals("") || input_2.getText().toString().equals("") || input_3.getText().toString().equals("") || input_4.getText().toString().equals("") || input_5.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(),"Enter a Value for All Classes",Toast.LENGTH_SHORT).show();
                }else {
                    grade_1 = Integer.parseInt(input_1.getText().toString());
                    grade_2 = Integer.parseInt(input_2.getText().toString());
                    grade_3 = Integer.parseInt(input_3.getText().toString());
                    grade_4 = Integer.parseInt(input_4.getText().toString());
                    grade_5 = Integer.parseInt(input_5.getText().toString());
                }

                if (grade_1<=100 && grade_2<=100 && grade_3<=100 && grade_4<=100 && grade_5<=100) {


                    int total = grade_1 + grade_2 + grade_3 + grade_4 + grade_5;
                    int gpa = total / 5;

                    String output_text = String.valueOf(gpa);
                    output.setText(output_text + " GPA");

                    if (gpa >= 60 || gpa < 80) {
                        imageview.setBackgroundColor(Color.YELLOW);
                    }
                    if (gpa >= 80) {
                        imageview.setBackgroundColor(Color.GREEN);
                    }
                    if (gpa <= 59) {
                        imageview.setBackgroundColor(Color.parseColor("#FF7373"));
                    }
                    comp_gpa_button.setTextColor(Color.parseColor("#00FFFFFF"));
                    grade1text.setTextColor(Color.parseColor("BLACK"));
                    grade2text.setTextColor(Color.parseColor("BLACK"));
                    grade3text.setTextColor(Color.parseColor("BLACK"));
                    grade4text.setTextColor(Color.parseColor("BLACK"));
                    grade5text.setTextColor(Color.parseColor("BLACK"));
                }
                else{
                    Toast.makeText(getApplicationContext(),"Values must be between 0-100",Toast.LENGTH_SHORT).show();
                    if (grade_1>100){
                        grade1text.setTextColor(Color.parseColor("RED"));
                        }
                    if (grade_2>100){
                        grade2text.setTextColor(Color.parseColor("RED"));
                    }
                    if (grade_3>100){
                        grade3text.setTextColor(Color.parseColor("RED"));
                    }
                    if (grade_4>100){
                        grade4text.setTextColor(Color.parseColor("RED"));
                    }
                    if (grade_5>100){
                        grade5text.setTextColor(Color.parseColor("RED"));
                    }
                    }
            }

        });


        grade1text.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                comp_gpa_button.setTextColor(Color.parseColor("#000000"));
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        grade2text.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                comp_gpa_button.setTextColor(Color.parseColor("#000000"));
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        grade3text.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                comp_gpa_button.setTextColor(Color.parseColor("#000000"));
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        grade4text.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                comp_gpa_button.setTextColor(Color.parseColor("#000000"));
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        grade5text.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                comp_gpa_button.setTextColor(Color.parseColor("#000000"));
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });








    }
}