//===
//Author        : Cecil Younglove
//Date          : October 4th, 2024
//Description   : ADD LATER
//===
package com.example.homework03_program1;

import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    //Only call the GUI elements touched by the code
    Button btn_j_main_addStudent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        btn_j_main_addStudent = findViewById(R.id.btn_v_main_addStudent);
        addStudentButtonListener();
    }

    private void addStudentButtonListener() {

    }
}