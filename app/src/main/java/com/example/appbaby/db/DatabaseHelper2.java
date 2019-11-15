package com.example.appbaby.db;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.appbaby.R;

public class DatabaseHelper2 extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "thai_db";
    private static final int DATABASE_VERSION = 1;

    public static final String TABLE_THAI = "thai";

    public static final String COL_ID2 = "_id";
    public static final String COL_CATEGORY2 = "category";
    public static final String COL_DESCRIPTION2 = "description";
    public static final String COL_IMAGE2 = "image";

    private static final String SQL_CREATE_App =
            "CREATE TABLE " + TABLE_THAI + " ("
                    + COL_ID2 + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + COL_CATEGORY2 + " TEXT, "
                    + COL_DESCRIPTION2 + " TEXT, "
                    + COL_IMAGE2 + " INTEGER )";

    public DatabaseHelper2(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_App);

        ContentValues cv = new ContentValues();
        cv.put(COL_CATEGORY2, "ก");
        cv.put(COL_DESCRIPTION2, "อักษร ก");
        cv.put(COL_IMAGE2, R.drawable.aa1);
        db.insert(TABLE_THAI, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY2, "ข");
        cv.put(COL_DESCRIPTION2, "อักษร ข");
        cv.put(COL_IMAGE2, R.drawable.aa2);
        db.insert(TABLE_THAI, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY2, "ฃ");
        cv.put(COL_DESCRIPTION2, "อักษร ฃ");
        cv.put(COL_IMAGE2, R.drawable.aa3);
        db.insert(TABLE_THAI, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY2, "ค");
        cv.put(COL_DESCRIPTION2, "อักษร ค");
        cv.put(COL_IMAGE2, R.drawable.aa4);
        db.insert(TABLE_THAI, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY2, "ฅ");
        cv.put(COL_DESCRIPTION2, "อักษร ฅ");
        cv.put(COL_IMAGE2, R.drawable.aa5);
        db.insert(TABLE_THAI, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY2, "ฆ");
        cv.put(COL_DESCRIPTION2, "อักษร ฆ");
        cv.put(COL_IMAGE2, R.drawable.aa6);
        db.insert(TABLE_THAI, null, cv);


        cv = new ContentValues();
        cv.put(COL_CATEGORY2, "ง");
        cv.put(COL_DESCRIPTION2, "อักษร ง");
        cv.put(COL_IMAGE2, R.drawable.aa7);
        db.insert(TABLE_THAI, null, cv);


        cv = new ContentValues();
        cv.put(COL_CATEGORY2, "จ");
        cv.put(COL_DESCRIPTION2, "อักษร จ");
        cv.put(COL_IMAGE2, R.drawable.aa8);
        db.insert(TABLE_THAI, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY2, "ฉ");
        cv.put(COL_DESCRIPTION2, "อักษร ฉ");
        cv.put(COL_IMAGE2, R.drawable.aa9);
        db.insert(TABLE_THAI, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY2, "ช");
        cv.put(COL_DESCRIPTION2, "อักษร ช");
        cv.put(COL_IMAGE2, R.drawable.aa10);
        db.insert(TABLE_THAI, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY2, "ซ");
        cv.put(COL_DESCRIPTION2, "อักษร ซ");
        cv.put(COL_IMAGE2, R.drawable.aa11);
        db.insert(TABLE_THAI, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY2, "ฌ");
        cv.put(COL_DESCRIPTION2, "อักษร ฌ");
        cv.put(COL_IMAGE2, R.drawable.aa12);
        db.insert(TABLE_THAI, null, cv);


        cv = new ContentValues();
        cv.put(COL_CATEGORY2, "ญ");
        cv.put(COL_DESCRIPTION2, "อักษร ญ");
        cv.put(COL_IMAGE2, R.drawable.aa13);
        db.insert(TABLE_THAI, null, cv);


        cv = new ContentValues();
        cv.put(COL_CATEGORY2, "ฎ");
        cv.put(COL_DESCRIPTION2, "อักษร ฎ");
        cv.put(COL_IMAGE2, R.drawable.aa14);
        db.insert(TABLE_THAI, null, cv);


        cv = new ContentValues();
        cv.put(COL_CATEGORY2, "ฏ");
        cv.put(COL_DESCRIPTION2, "อักษร ฏ");
        cv.put(COL_IMAGE2, R.drawable.aa15);
        db.insert(TABLE_THAI, null, cv);


        cv = new ContentValues();
        cv.put(COL_CATEGORY2, "ฐ");
        cv.put(COL_DESCRIPTION2, "อักษร ฐ");
        cv.put(COL_IMAGE2, R.drawable.aa16);
        db.insert(TABLE_THAI, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY2, "ฑ");
        cv.put(COL_DESCRIPTION2, "อักษร ฑ");
        cv.put(COL_IMAGE2, R.drawable.aa17);
        db.insert(TABLE_THAI, null, cv);


        cv = new ContentValues();
        cv.put(COL_CATEGORY2, "ฒ");
        cv.put(COL_DESCRIPTION2, "อักษร ฒ");
        cv.put(COL_IMAGE2, R.drawable.aa18);
        db.insert(TABLE_THAI, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY2, "ณ");
        cv.put(COL_DESCRIPTION2, "อักษร ณ");
        cv.put(COL_IMAGE2, R.drawable.aa19);
        db.insert(TABLE_THAI, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY2, "ด");
        cv.put(COL_DESCRIPTION2, "อักษร ด");
        cv.put(COL_IMAGE2, R.drawable.aa20);
        db.insert(TABLE_THAI, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY2, "ต");
        cv.put(COL_DESCRIPTION2, "อักษร ต");
        cv.put(COL_IMAGE2, R.drawable.aa21);
        db.insert(TABLE_THAI, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY2, "ถ");
        cv.put(COL_DESCRIPTION2, "อักษร ถ");
        cv.put(COL_IMAGE2, R.drawable.aa22);
        db.insert(TABLE_THAI, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY2, "ท");
        cv.put(COL_DESCRIPTION2, "อักษร ท");
        cv.put(COL_IMAGE2, R.drawable.aa23);
        db.insert(TABLE_THAI, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY2, "ธ");
        cv.put(COL_DESCRIPTION2, "อักษร ธ");
        cv.put(COL_IMAGE2, R.drawable.aa24);
        db.insert(TABLE_THAI, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY2, "น");
        cv.put(COL_DESCRIPTION2, "อักษร น");
        cv.put(COL_IMAGE2, R.drawable.aa25);
        db.insert(TABLE_THAI, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY2, "บ");
        cv.put(COL_DESCRIPTION2, "อักษร บ");
        cv.put(COL_IMAGE2, R.drawable.aa26);
        db.insert(TABLE_THAI, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY2, "ป");
        cv.put(COL_DESCRIPTION2, "อักษร ป");
        cv.put(COL_IMAGE2, R.drawable.aa27);
        db.insert(TABLE_THAI, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY2, "ผ");
        cv.put(COL_DESCRIPTION2, "อักษร ผ");
        cv.put(COL_IMAGE2, R.drawable.aa28);
        db.insert(TABLE_THAI, null, cv);


        cv = new ContentValues();
        cv.put(COL_CATEGORY2, "ฝ");
        cv.put(COL_DESCRIPTION2, "อักษร ฝ");
        cv.put(COL_IMAGE2, R.drawable.aa29);
        db.insert(TABLE_THAI, null, cv);


        cv = new ContentValues();
        cv.put(COL_CATEGORY2, "พ");
        cv.put(COL_DESCRIPTION2, "อักษร พ");
        cv.put(COL_IMAGE2, R.drawable.aa30);
        db.insert(TABLE_THAI, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY2, "ฟ");
        cv.put(COL_DESCRIPTION2, "อักษร ฟ");
        cv.put(COL_IMAGE2, R.drawable.aa31);
        db.insert(TABLE_THAI, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY2, "ภ");
        cv.put(COL_DESCRIPTION2, "อักษร ภ");
        cv.put(COL_IMAGE2, R.drawable.aa32);
        db.insert(TABLE_THAI, null, cv);


        cv = new ContentValues();
        cv.put(COL_CATEGORY2, "ม");
        cv.put(COL_DESCRIPTION2, "อักษร ม");
        cv.put(COL_IMAGE2, R.drawable.aa33);
        db.insert(TABLE_THAI, null, cv);


        cv = new ContentValues();
        cv.put(COL_CATEGORY2, "ย");
        cv.put(COL_DESCRIPTION2, "อักษร ย");
        cv.put(COL_IMAGE2, R.drawable.aa34);
        db.insert(TABLE_THAI, null, cv);


        cv = new ContentValues();
        cv.put(COL_CATEGORY2, "ร");
        cv.put(COL_DESCRIPTION2, "อักษร ร");
        cv.put(COL_IMAGE2, R.drawable.aa35);
        db.insert(TABLE_THAI, null, cv);


        cv = new ContentValues();
        cv.put(COL_CATEGORY2, "ล");
        cv.put(COL_DESCRIPTION2, "อักษร ล");
        cv.put(COL_IMAGE2, R.drawable.aa36);
        db.insert(TABLE_THAI, null, cv);


        cv = new ContentValues();
        cv.put(COL_CATEGORY2, "ว");
        cv.put(COL_DESCRIPTION2, "อักษร ว");
        cv.put(COL_IMAGE2, R.drawable.aa37);
        db.insert(TABLE_THAI, null, cv);



        cv = new ContentValues();
        cv.put(COL_CATEGORY2, "ศ");
        cv.put(COL_DESCRIPTION2, "อักษร ศ");
        cv.put(COL_IMAGE2, R.drawable.aa38);
        db.insert(TABLE_THAI, null, cv);


        cv = new ContentValues();
        cv.put(COL_CATEGORY2, "ษ");
        cv.put(COL_DESCRIPTION2, "อักษร ษ");
        cv.put(COL_IMAGE2, R.drawable.aa39);
        db.insert(TABLE_THAI, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY2, "ส");
        cv.put(COL_DESCRIPTION2, "อักษร ส");
        cv.put(COL_IMAGE2, R.drawable.aa40);
        db.insert(TABLE_THAI, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY2, "ห");
        cv.put(COL_DESCRIPTION2, "อักษร ห");
        cv.put(COL_IMAGE2, R.drawable.aa41);
        db.insert(TABLE_THAI, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY2, "ฬ");
        cv.put(COL_DESCRIPTION2, "อักษร ฬ");
        cv.put(COL_IMAGE2, R.drawable.aa42);
        db.insert(TABLE_THAI, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY2, "อ");
        cv.put(COL_DESCRIPTION2, "อักษร อ");
        cv.put(COL_IMAGE2, R.drawable.aa43);
        db.insert(TABLE_THAI, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY2, "ฮ");
        cv.put(COL_DESCRIPTION2, "อักษร ฮ");
        cv.put(COL_IMAGE2, R.drawable.aa44);
        db.insert(TABLE_THAI, null, cv);








    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
