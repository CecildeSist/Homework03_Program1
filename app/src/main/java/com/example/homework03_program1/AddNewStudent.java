package com.example.homework03_program1;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class AddNewStudent extends AppCompatActivity {

    TextView txt_j_add_label;
    EditText et_j_add_first;
    EditText et_j_add_last;
    EditText et_j_add_user;
    EditText et_j_add_email;
    EditText et_j_add_age;
    EditText et_j_add_gpa;
    Spinner spn_j_add_majorSpin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_new_student);
        //Connect used GUI elements to code
        txt_j_add_label = findViewById(R.id.txt_v_Add_Label);
        et_j_add_first = findViewById(R.id.et_v_add_firstName);
        et_j_add_last = findViewById(R.id.et_v_add_lastName);
        et_j_add_user = findViewById(R.id.et_v_add_username);
        et_j_add_email = findViewById(R.id.et_v_add_email);
        et_j_add_age = findViewById(R.id.et_v_add_age);
        et_j_add_gpa = findViewById(R.id.et_v_add_GPA);
        spn_j_add_majorSpin = findViewById(R.id.spn_v_add_majorSpin);
    }
}