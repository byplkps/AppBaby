package com.example.appbaby.db;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.appbaby.R;

public class DatabaseHelper3 extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "number_db";
    private static final int DATABASE_VERSION = 1;

    public static final String TABLE_NUMBER = "number";

    public static final String COL_ID3 = "_id";
    public static final String COL_CATEGORY3 = "category";
    public static final String COL_DESCRIPTION3 = "description";
    public static final String COL_IMAGE3 = "image";

    private static final String SQL_CREATE_App =
            "CREATE TABLE " + TABLE_NUMBER + " ("
                    + COL_ID3 + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + COL_CATEGORY3 + " TEXT, "
                    + COL_DESCRIPTION3 + " TEXT, "
                    + COL_IMAGE3 + " INTEGER )";

    public DatabaseHelper3(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_App);

        ContentValues cv = new ContentValues();
        cv.put(COL_CATEGORY3, "1");
        cv.put(COL_DESCRIPTION3, "เลข 1 \n" +
                "เขียนเป็นภาษาอังกฤษว่า One \nและเขียนเป็นภาษาไทยว่า หนึ่ง ");
        cv.put(COL_IMAGE3, R.drawable.bb1);
        db.insert(TABLE_NUMBER, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY3, "2");
        cv.put(COL_DESCRIPTION3, "เลข 2 \n" +
                "เขียนเป็นภาษาอังกฤษว่า Two \nและเขียนเป็นภาษาไทยว่า สอง ");
        cv.put(COL_IMAGE3, R.drawable.bb2);
        db.insert(TABLE_NUMBER, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY3, "3");
        cv.put(COL_DESCRIPTION3, "เลข 3 \n" +
                "เขียนเป็นภาษาอังกฤษว่า Three \nและเขียนเป็นภาษาไทยว่า สาม ");
        cv.put(COL_IMAGE3, R.drawable.bb3);
        db.insert(TABLE_NUMBER, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY3, "4");
        cv.put(COL_DESCRIPTION3, "เลข 4 \n" +
                "เขียนเป็นภาษาอังกฤษว่า Four \nและเขียนเป็นภาษาไทยว่า สี่ ");
        cv.put(COL_IMAGE3, R.drawable.bb4);
        db.insert(TABLE_NUMBER, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY3, "5");
        cv.put(COL_DESCRIPTION3, "เลข 5 \n" +
                "เขียนเป็นภาษาอังกฤษว่า Five \nและเขียนเป็นภาษาไทยว่า ห้า ");
        cv.put(COL_IMAGE3, R.drawable.bb5);
        db.insert(TABLE_NUMBER, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY3, "6");
        cv.put(COL_DESCRIPTION3, "เลข 6 \n" +
                "เขียนเป็นภาษาอังกฤษว่า Six \nและเขียนเป็นภาษาไทยว่า หก ");
        cv.put(COL_IMAGE3, R.drawable.bb6);
        db.insert(TABLE_NUMBER, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY3, "7");
        cv.put(COL_DESCRIPTION3, "เลข 7 \n" +
                "เขียนเป็นภาษาอังกฤษว่า Seven \nและเขียนเป็นภาษาไทยว่า เจ็ด ");
        cv.put(COL_IMAGE3, R.drawable.bb7);
        db.insert(TABLE_NUMBER, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY3, "8");
        cv.put(COL_DESCRIPTION3, "เลข 8 \n" +
        "เขียนเป็นภาษาอังกฤษว่า Eight \nและเขียนเป็นภาษาไทยว่า แปด ");
        cv.put(COL_IMAGE3, R.drawable.bb8);
        db.insert(TABLE_NUMBER, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY3, "9");
        cv.put(COL_DESCRIPTION3, "เลข 9 \n" +
                "เขียนเป็นภาษาอังกฤษว่า Nine \nและเขียนเป็นภาษาไทยว่า เก้า ");
        cv.put(COL_IMAGE3, R.drawable.bb9);
        db.insert(TABLE_NUMBER, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY3, "10");
        cv.put(COL_DESCRIPTION3, "เลข 10 \n" +
                "เขียนเป็นภาษาอังกฤษว่า Ten \nและเขียนเป็นภาษาไทยว่า สิบ ");
        cv.put(COL_IMAGE3, R.drawable.bb10);
        db.insert(TABLE_NUMBER, null, cv);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
