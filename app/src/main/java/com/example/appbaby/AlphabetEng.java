package com.example.appbaby;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;

import com.example.appbaby.adapter.Eng_recyclerViewAdapter;
import com.example.appbaby.db.DatabaseHelper;
import com.example.appbaby.model.Eng;

import static com.example.appbaby.db.DatabaseHelper.COL_CATEGORY1;
import static com.example.appbaby.db.DatabaseHelper.COL_DESCRIPTION1;
import static com.example.appbaby.db.DatabaseHelper.COL_IMAGE1;
import static com.example.appbaby.db.DatabaseHelper.COL_ID1;
import static com.example.appbaby.db.DatabaseHelper.TABLE_ENG;



public class AlphabetEng extends AppCompatActivity {


    private List<Eng> mEngList = new ArrayList<>();
    private Eng_recyclerViewAdapter mAdapter;

    private DatabaseHelper mDbHepler;
    private SQLiteDatabase mDatabase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet_eng);

        mDbHepler = new DatabaseHelper(AlphabetEng.this);
        mDatabase = mDbHepler.getWritableDatabase();

        readformDb();


        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        mAdapter = new Eng_recyclerViewAdapter(
                AlphabetEng.this,
                R.layout.item_eng,
                mEngList

        );

        LinearLayoutManager lm = new LinearLayoutManager(this );


        recyclerView.setLayoutManager(lm);
        recyclerView.setAdapter(mAdapter);

    }

    private void readformDb() {

        mEngList.clear();
        Cursor cursor = mDatabase.query(TABLE_ENG,null, null,null,null,null,null);

        while (cursor.moveToNext()){
            int id=  cursor.getInt(cursor.getColumnIndex(COL_ID1));
            String category = cursor.getString(cursor.getColumnIndex(COL_CATEGORY1));
            String description = cursor.getString(cursor.getColumnIndex(COL_DESCRIPTION1));
            int image  = cursor.getInt(cursor.getColumnIndex(COL_IMAGE1));

            Eng eng = new Eng(id,category,description,image);
            mEngList.add(eng);
        }
    }

}



