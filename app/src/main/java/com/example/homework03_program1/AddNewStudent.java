package com.example.homework03_program1;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddNewStudent extends AppCompatActivity {

    TextView txt_j_addStudent_label;
    EditText et_j_addStudent_firstName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_new_student);
        //Connect used GUI elements to code
        txt_j_addStudent_label = findViewById(R.id.txt_v_Add_Label);
        et_j_addStudent_firstName = findViewById(R.id.et_v_add_firstName);
    }
}