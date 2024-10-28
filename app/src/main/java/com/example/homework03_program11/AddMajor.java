package com.example.homework03_program11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddMajor extends AppCompatActivity {

    //Establishing used GUI elements
    EditText et_j_major_majorName;
    EditText et_j_major_majorPrefix;

    TextView tv_j_major_errorName;

    Button btn_j_major_addMajor;
    Button btn_j_major_back;

    DatabaseHelper dbHelper;

    Intent fromAddMajorToAddStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_major);

        //Connecting to used GUI elements
        et_j_major_majorName = findViewById(R.id.et_v_major_majorName);
        et_j_major_majorPrefix = findViewById(R.id.et_v_major_majorPrefix);

        tv_j_major_errorName = findViewById(R.id.tv_v_addMajor_errorName);

        btn_j_major_addMajor = findViewById(R.id.btn_v_major_addMajor);
        btn_j_major_back = findViewById(R.id.btn_v_major_back);

        //Make text view invisible by default
        tv_j_major_errorName.setVisibility(View.INVISIBLE);

        fromAddMajorToAddStudent = new Intent(AddMajor.this, AddStudent.class);

        dbHelper = new DatabaseHelper(this);

        //Call button listener for back button
        majorBackListener();
    }

    private void majorBackListener() {
        btn_j_major_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent majorToStudent = new Intent(AddMajor.this, AddStudent.class);
                startActivity(majorToStudent);
            }
        });
    }

    private void majorAddListener() {
        btn_j_major_addMajor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create strings in which to store major name and prefix
                String newMajorName, newMajorPrefix;
                newMajorName = et_j_major_majorName.getText().toString();
                newMajorPrefix = et_j_major_majorPrefix.getText().toString();
            }
        });
    }
}