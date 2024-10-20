package com.example.homework03_program1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String database_name = "Student.db";
    private static final String students_table_name = "Students";
    private static final String majors_table_name = "Majors";

    public DatabaseHelper(Context c) {
        //Create the database (collection of tables)
        //Context, name, factory (leave null), version number
        //NOTE TO SELF: MUST UPDATE VERSION NUMBER IF INFO IN DATABASE IS WRONG

        super(c,database_name,null,3);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //Create table in database
        //execute the sql statement on the database that was passed to the function onCreate called db
        //NOTE TO SELF: SQL STATEMENTS ARE WRITTEN AS STRINGS

        db.execSQL("CREATE TABLE " + majors_table_name + " (majorID int primary key not null, majorName varchar(50), majorPrefix varchar(3));");
        db.execSQL("CREATE TABLE " + students_table_name + " (username varchar(50) primary key not null, fname varchar(50), lname varchar(50), email varchar(50), age integer, GPA float, foreign key (major) references " + students_table_name + " (majorID));");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
