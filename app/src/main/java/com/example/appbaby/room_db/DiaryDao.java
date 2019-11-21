package com.example.appbaby.room_db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.appbaby.model.Diary;

import java.util.List;


@Dao
public interface DiaryDao {



    @Query("SELECT * FROM diary")
    List<Diary> getAll();

    @Insert
    void insert(Diary diary);

}

