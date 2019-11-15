package com.example.appbaby.db;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.appbaby.R;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "eng_db";
    private static final int DATABASE_VERSION = 1;

    public static final String TABLE_ENG = "Eng";

    public static final String COL_ID1 = "_id";
    public static final String COL_CATEGORY1 = "category";
    public static final String COL_DESCRIPTION1 = "description";
    public static final String COL_IMAGE1 = "image";

    private static final String SQL_CREATE_App =
            "CREATE TABLE " + TABLE_ENG + " ("
                    + COL_ID1 + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + COL_CATEGORY1 + " TEXT, "
                    + COL_DESCRIPTION1 + " TEXT, "
                    + COL_IMAGE1 + " INTEGER )";

    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_App);

        ContentValues cv = new ContentValues();
        cv.put(COL_CATEGORY1, "A");
        cv.put(COL_DESCRIPTION1, "อักษร A");
        cv.put(COL_IMAGE1, R.drawable.a);
        db.insert(TABLE_ENG, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY1, "B");
        cv.put(COL_DESCRIPTION1, "อักษร B");
        cv.put(COL_IMAGE1, R.drawable.b);
        db.insert(TABLE_ENG, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY1, "C");
        cv.put(COL_DESCRIPTION1, "ตัวอักษร C");
        cv.put(COL_IMAGE1, R.drawable.c);
        db.insert(TABLE_ENG, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY1, "D");
        cv.put(COL_DESCRIPTION1, "ตัวอักษร D");
        cv.put(COL_IMAGE1, R.drawable.d);
        db.insert(TABLE_ENG, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY1, "E");
        cv.put(COL_DESCRIPTION1, "ตัวอักษร E");
        cv.put(COL_IMAGE1, R.drawable.e);
        db.insert(TABLE_ENG, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY1, "G");
        cv.put(COL_DESCRIPTION1, "ตัวอักษร G");
        cv.put(COL_IMAGE1, R.drawable.g);
        db.insert(TABLE_ENG, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY1, "H");
        cv.put(COL_DESCRIPTION1, "ตัวอักษร H");
        cv.put(COL_IMAGE1, R.drawable.h);
        db.insert(TABLE_ENG, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY1, "I");
        cv.put(COL_DESCRIPTION1, "ตัวอักษร I");
        cv.put(COL_IMAGE1, R.drawable.i);
        db.insert(TABLE_ENG, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY1, "J");
        cv.put(COL_DESCRIPTION1, "ตัวอักษร J");
        cv.put(COL_IMAGE1, R.drawable.j);
        db.insert(TABLE_ENG, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY1, "K");
        cv.put(COL_DESCRIPTION1, "ตัวอักษร K");
        cv.put(COL_IMAGE1, R.drawable.k);
        db.insert(TABLE_ENG, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY1, "L");
        cv.put(COL_DESCRIPTION1, "ตัวอักษร L");
        cv.put(COL_IMAGE1, R.drawable.l);
        db.insert(TABLE_ENG, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY1, "M");
        cv.put(COL_DESCRIPTION1, "ตัวอักษร M");
        cv.put(COL_IMAGE1, R.drawable.m);
        db.insert(TABLE_ENG, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY1, "N");
        cv.put(COL_DESCRIPTION1, "ตัวอักษร N");
        cv.put(COL_IMAGE1, R.drawable.n);
        db.insert(TABLE_ENG, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY1, "O");
        cv.put(COL_DESCRIPTION1, "ตัวอักษร O");
        cv.put(COL_IMAGE1, R.drawable.o);
        db.insert(TABLE_ENG, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY1, "P");
        cv.put(COL_DESCRIPTION1, "ตัวอักษร P");
        cv.put(COL_IMAGE1, R.drawable.p);
        db.insert(TABLE_ENG, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY1, "Q");
        cv.put(COL_DESCRIPTION1, "ตัวอักษร Q");
        cv.put(COL_IMAGE1, R.drawable.q);
        db.insert(TABLE_ENG, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY1, "R");
        cv.put(COL_DESCRIPTION1, "ตัวอักษร R");
        cv.put(COL_IMAGE1, R.drawable.r);
        db.insert(TABLE_ENG, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY1, "S");
        cv.put(COL_DESCRIPTION1, "ตัวอักษร S");
        cv.put(COL_IMAGE1, R.drawable.s);
        db.insert(TABLE_ENG, null, cv);


        cv = new ContentValues();
        cv.put(COL_CATEGORY1, "T");
        cv.put(COL_DESCRIPTION1, "ตัวอักษร T");
        cv.put(COL_IMAGE1, R.drawable.t);
        db.insert(TABLE_ENG, null, cv);


        cv = new ContentValues();
        cv.put(COL_CATEGORY1, "U");
        cv.put(COL_DESCRIPTION1, "ตัวอักษร U");
        cv.put(COL_IMAGE1, R.drawable.u);
        db.insert(TABLE_ENG, null, cv);


        cv = new ContentValues();
        cv.put(COL_CATEGORY1, "V");
        cv.put(COL_DESCRIPTION1, "ตัวอักษร v");
        cv.put(COL_IMAGE1, R.drawable.v);
        db.insert(TABLE_ENG, null, cv);


        cv = new ContentValues();
        cv.put(COL_CATEGORY1, "W");
        cv.put(COL_DESCRIPTION1, "ตัวอักษร w");
        cv.put(COL_IMAGE1, R.drawable.w);
        db.insert(TABLE_ENG, null, cv);


        cv = new ContentValues();
        cv.put(COL_CATEGORY1, "X");
        cv.put(COL_DESCRIPTION1, "ตัวอักษร X");
        cv.put(COL_IMAGE1, R.drawable.x);
        db.insert(TABLE_ENG, null, cv);


        cv = new ContentValues();
        cv.put(COL_CATEGORY1, "Y");
        cv.put(COL_DESCRIPTION1, "ตัวอักษร Y");
        cv.put(COL_IMAGE1, R.drawable.y);
        db.insert(TABLE_ENG, null, cv);


        cv = new ContentValues();
        cv.put(COL_CATEGORY1, "Z");
        cv.put(COL_DESCRIPTION1, "ตัวอักษร Z");
        cv.put(COL_IMAGE1, R.drawable.z);
        db.insert(TABLE_ENG, null, cv);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

