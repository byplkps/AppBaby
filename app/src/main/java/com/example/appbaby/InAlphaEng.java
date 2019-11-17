package com.example.appbaby;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class InAlphaEng extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in_alpha_eng);

        Intent intent = getIntent();
        String categoryName = intent.getStringExtra("name");
        int categoryImageRes = intent.getIntExtra("image", 0);

        ImageView coverImageView = findViewById(R.id.cover_image_view);
        coverImageView.setImageResource(categoryImageRes);

        TextView engNameTextView = findViewById(R.id.category_name_text_view);
        engNameTextView.setText(categoryName);
    }


}



