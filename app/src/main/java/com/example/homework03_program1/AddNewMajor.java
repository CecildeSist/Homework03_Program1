package com.example.homework03_program1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddNewMajor extends AppCompatActivity {

    TextView txt_j_major_addNewMajor;
    EditText et_j_major_et;
    Button btn_j_major_add;
    //Ask teacher if back button needed

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_new_major);

        //Connect used GUI elements
        txt_j_major_addNewMajor = findViewById(R.id.txt_v_major_addNewMajor);
        et_j_major_et = findViewById(R.id.et_v_major_editText);
        btn_j_major_add = findViewById(R.id.btn_v_major_addMajor);
    }
}