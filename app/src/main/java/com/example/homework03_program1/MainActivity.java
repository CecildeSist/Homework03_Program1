//===
//Author: Cecil Younglove
//Date: October 17th, 2024
//Description: NOTE TO SELF ADD THIS LATER
//===
package com.example.homework03_program1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    //Creating interacted GUI elements
    Button btn_j_main_addStudent;
    ListView lv_j_main_students;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //Connecting interacted GUI elements
        btn_j_main_addStudent = findViewById(R.id.btn_v_main_addStudent);
        lv_j_main_students = findViewById(R.id.lv_v_main_students);

        //Start AddStudent on button click
        mainButtonListener();
    }

    private void mainButtonListener() {
        btn_j_main_addStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainToStudent = new Intent(MainActivity.this, AddStudent.class);
                startActivity(mainToStudent);
            }
        });
    }
}