package com.example.homework03_program11;

public class Major {
    private int id;
    private String mName;
    private String mPrefix;

    public Major(int i, String n, String p) {
        id = i;
        mName = n;
        mPrefix = p;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmPrefix() {
        return mPrefix;
    }

    public void setmPrefix(String mPrefix) {
        this.mPrefix = mPrefix;
    }
}
