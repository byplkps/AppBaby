package com.example.appbaby;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appbaby.adapter.Eng_recyclerViewAdapter;
import com.example.appbaby.db.DatabaseHelper;
import com.example.appbaby.model.Eng;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Eng> mEngList = new ArrayList<>();
    private Eng_recyclerViewAdapter mAdapter;

    private DatabaseHelper mDbHepler;
    private SQLiteDatabase mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button engButton = findViewById(R.id.az_button);
        engButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AlphabetEng.class);
                intent.putExtra("type", 0);
                startActivity(intent);
            }
        });


        Button thaiButton = findViewById(R.id.thai_button);
        thaiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AlphabetThai.class);
                intent.putExtra("type", 0);
                startActivity(intent);
            }
        });

        Button numButton = findViewById(R.id.num_button);
        numButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AlphabetNumber.class);
                intent.putExtra("type", 0);
                startActivity(intent);
            }
        });

        Button DiaryButton = findViewById(R.id.diary_button);
        DiaryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DiaryActivity.class);
                intent.putExtra("type", 0);
                startActivity(intent);
            }
        });

    }
}


