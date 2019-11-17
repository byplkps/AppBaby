package com.example.appbaby.model;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "number")
public class Number {

    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "category")
    public String category;

    @ColumnInfo(name = "description")
    public String description;

    @ColumnInfo(name = "image")
    public int imageRes;

    public Number(int id, String category, String description, int imageRes) {
        this.id = id;
        this.category = category;
        this.description = description;
        this.imageRes = imageRes;
    }
}
