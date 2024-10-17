package com.example.homework03_program1;

import android.os.Bundle;
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
    }
}