package com.example.appbaby;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;

import com.example.appbaby.adapter.Thai_recyclerViewAdapter;
import com.example.appbaby.db.DatabaseHelper2;
import com.example.appbaby.model.Thai;

import static com.example.appbaby.db.DatabaseHelper2.COL_CATEGORY2;
import static com.example.appbaby.db.DatabaseHelper2.COL_DESCRIPTION2;
import static com.example.appbaby.db.DatabaseHelper2.COL_ID2;
import static com.example.appbaby.db.DatabaseHelper2.COL_IMAGE2;
import static com.example.appbaby.db.DatabaseHelper2.TABLE_THAI;


public class AlphabetThai extends AppCompatActivity {



    private List<Thai> mThaiList = new ArrayList<>();
    private Thai_recyclerViewAdapter mAdapter;

    private DatabaseHelper2 mDbHepler;
    private SQLiteDatabase mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet_thai);

        mDbHepler = new DatabaseHelper2(AlphabetThai.this);
        mDatabase = mDbHepler.getWritableDatabase();

        readformDb();


        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        mAdapter = new Thai_recyclerViewAdapter(
                AlphabetThai.this,
                R.layout.item_thai,
                mThaiList

        );

        LinearLayoutManager lm = new LinearLayoutManager(this );


        recyclerView.setLayoutManager(lm);
        recyclerView.setAdapter(mAdapter);


    }

    private void readformDb() {

        mThaiList.clear();
        Cursor cursor = mDatabase.query(TABLE_THAI,null, null,null,null,null,null);

        while (cursor.moveToNext()){
            int id=  cursor.getInt(cursor.getColumnIndex(COL_ID2));
            String category = cursor.getString(cursor.getColumnIndex(COL_CATEGORY2));
            String description = cursor.getString(cursor.getColumnIndex(COL_DESCRIPTION2));
            int image  = cursor.getInt(cursor.getColumnIndex(COL_IMAGE2));

            Thai thai = new Thai(id,category,description,image);
            mThaiList.add(thai);
        }
    }

}

