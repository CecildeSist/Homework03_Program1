//===
//Author: Cecil
//Date: October 27th, 2024
//Description: NOTE TO SELF add this later
//===

//I tried to take on too much at once. Hopefully starting from the ground up will help me keep
//things clear in my head.
package com.example.homework03_program11;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //Creating used GUI elements
    //Creating interacted GUI elements
    Button btn_j_main_addStudent;
    Button btn_j_main_find;
    ListView lv_j_main_students;

    //Other used objects
    DatabaseHelper dbHelper;
    public static ArrayList<Student> listOfStudents = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //Connecting interacted GUI elements
        btn_j_main_addStudent = findViewById(R.id.btn_v_main_addStudent);
        btn_j_main_find = findViewById(R.id.btn_v_main_find);
        lv_j_main_students = findViewById(R.id.lv_v_main_students);

        //Next step: add first three functions back to DatabaseHelper (DONE)
        dbHelper = new DatabaseHelper(this);

        //Next step: add next six functions back to DatabaseHelper
    }
}