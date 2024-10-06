package com.example.homework03_program1;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class AddNewStudent extends AppCompatActivity {

    TextView txt_j_add_label;
    EditText et_j_add_first;
    EditText et_j_add_last;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_new_student);
        //Connect used GUI elements to code
        txt_j_add_label = findViewById(R.id.txt_v_Add_Label);
        et_j_add_first = findViewById(R.id.et_v_add_firstName);
        et_j_add_last = findViewById(R.id.et_v_add_lastName);
    }
}