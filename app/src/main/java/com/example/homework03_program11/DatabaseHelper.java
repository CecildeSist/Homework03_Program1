package com.example.homework03_program11;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String database_name = "College.db";
    public static final String majors_table_name = "Majors";
    public static final String students_table_name = "Students";

    public DatabaseHelper(Context c) {
        super(c, database_name, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + majors_table_name + " (majorID int primary key autoincrement not null, majorName varchar(50), majorPrefix varchar(50));");
        db.execSQL("CREATE TABLE " + students_table_name + " (username varchar(50) primary key not null, fname varchar(50), lname varchar(50), email varchar(50), age integer, GPA float, foreign key (majorID) references " + majors_table_name + " (majorID));");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + majors_table_name + ";");
        db.execSQL("DROP TABLE IF EXISTS " + students_table_name +  + ";");

        onCreate(db);
    }

    public String getMajors_table_name() {
        return
    }
}
