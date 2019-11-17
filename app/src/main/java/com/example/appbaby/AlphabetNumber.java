package com.example.appbaby;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;

import com.example.appbaby.adapter.Number_recyclerViewAdapter;
import com.example.appbaby.db.DatabaseHelper3;
import com.example.appbaby.model.Number;

import static com.example.appbaby.db.DatabaseHelper3.COL_CATEGORY3;
import static com.example.appbaby.db.DatabaseHelper3.COL_DESCRIPTION3;
import static com.example.appbaby.db.DatabaseHelper3.COL_ID3;
import static com.example.appbaby.db.DatabaseHelper3.COL_IMAGE3;
import static com.example.appbaby.db.DatabaseHelper3.TABLE_NUMBER;



public class AlphabetNumber extends AppCompatActivity {


    private List<Number> mNumberList = new ArrayList<>();
    private Number_recyclerViewAdapter mAdapter;

    private DatabaseHelper3 mDbHepler;
    private SQLiteDatabase mDatabase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet_number);

        mDbHepler = new DatabaseHelper3(AlphabetNumber.this);
        mDatabase = mDbHepler.getWritableDatabase();

        readformDb();


        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        mAdapter = new Number_recyclerViewAdapter(
                AlphabetNumber.this,
                R.layout.item_number,
                mNumberList

        );

        LinearLayoutManager lm = new LinearLayoutManager(this );


        recyclerView.setLayoutManager(lm);
        recyclerView.setAdapter(mAdapter);

    }

    private void readformDb() {

        mNumberList.clear();
        Cursor cursor = mDatabase.query(TABLE_NUMBER,null, null,null,null,null,null);

            while (cursor.moveToNext()){
            int id=  cursor.getInt(cursor.getColumnIndex(COL_ID3));
            String category = cursor.getString(cursor.getColumnIndex(COL_CATEGORY3));
            String description = cursor.getString(cursor.getColumnIndex(COL_DESCRIPTION3));
            int image  = cursor.getInt(cursor.getColumnIndex(COL_IMAGE3));

            Number number = new Number(id,category,description,image);
            mNumberList.add(number);
        }
    }

}

