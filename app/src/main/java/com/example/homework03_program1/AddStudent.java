package com.example.homework03_program1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddStudent extends AppCompatActivity {

    //Create used GUI elements
    EditText et_j_student_fName;
    EditText et_j_student_lName;
    EditText et_j_student_uName;

    TextView txt_j_student_errorUName;

    EditText et_j_student_eMail;
    EditText et_j_student_age;
    EditText et_j_student_GPA;

    Spinner spn_j_student_majors;

    Button btn_j_student_addMajor;
    Button btn_j_student_add;
    Button btn_j_student_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_student);

        //Connect GUI elements
        et_j_student_fName = findViewById(R.id.et_v_student_fName);
        et_j_student_lName = findViewById(R.id.et_v_student_lName);
        et_j_student_uName = findViewById(R.id.et_v_student_uName);

        txt_j_student_errorUName = findViewById(R.id.txt_v_student_errorUName);
        //Set this to invisible by default
        txt_j_student_errorUName.setVisibility(View.INVISIBLE);

        //Connect rest of GUI elements
        et_j_student_eMail = findViewById(R.id.et_v_student_eMail);
        et_j_student_age = findViewById(R.id.et_v_student_age);
        et_j_student_GPA = findViewById(R.id.et_v_student_GPA);

        spn_j_student_majors = findViewById(R.id.spn_v_student_majors);

        btn_j_student_addMajor = findViewById(R.id.btn_v_student_addMajor);
        //Call listeners for each button
        studentMajorButtonListener();
        btn_j_student_add = findViewById(R.id.btn_v_student_add);
        addStudentButton();
        btn_j_student_back = findViewById(R.id.btn_v_student_back);
        studentBackListener();
    }

    private void studentMajorButtonListener() {
        btn_j_student_addMajor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent studentMajor = new Intent(AddStudent.this, AddMajor.class);
                startActivity(studentMajor);
            }
        });
    }

    private void addStudentButton() {
        btn_j_student_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent studentMain = new Intent(AddStudent.this, MainActivity.class);
                //NOTE TO SELF write code for adding student to table of students
                startActivity(studentMain);
            }
        });
    }

    private void studentBackListener() {
        btn_j_student_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent studentMain = new Intent(AddStudent.this, MainActivity.class);
                startActivity(studentMain);
            }
        });
    }
}