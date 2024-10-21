package com.example.homework03_program1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddMajor extends AppCompatActivity {

    //Establishing used GUI elements
    EditText et_j_major_majorName;
    EditText et_j_major_majorPrefix;

    Button btn_j_major_addMajor;
    Button btn_j_major_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_major);

        //Connecting to used GUI elements
        et_j_major_majorName = findViewById(R.id.et_v_major_majorName);
        et_j_major_majorPrefix = findViewById(R.id.et_v_major_majorPrefix);

        btn_j_major_addMajor = findViewById(R.id.btn_v_major_addMajor);
        btn_j_major_back = findViewById(R.id.btn_v_major_back);

        //Call button listener for back button
    }

    private void majorBackListener() {
        btn_j_major_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent majorToStudent = new Intent(AddMajor.this, AddStudent.class);
            }
        });
    }
}