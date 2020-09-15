package com.example.adr02_orm_01.dao;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.adr02_orm_01.models.Student;


@Database(entities = {Student.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract  StudentDAO getStudentDAO();
}
