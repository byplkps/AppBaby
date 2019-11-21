package com.example.appbaby.model;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity(tableName = "thai")
public class Thai {

    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "category")
    @SerializedName("category")
    public String category;

    @ColumnInfo(name = "description")
    @SerializedName("description")
    public String description;

    @ColumnInfo(name = "image")
    @SerializedName("image")
    public int imageRes;

    public Thai(int id, String category, String description, int imageRes) {
        this.id = id;
        this.category = category;
        this.description = description;
        this.imageRes = imageRes;
    }
}
