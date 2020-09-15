package com.example.adr02_orm_01.dao;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.adr02_orm_01.models.Student;
import com.example.adr02_orm_01.utils.AppConstrants;

import java.util.List;

@Dao
public interface StudentDAO {

    @Query("SELECT * FROM " + AppConstrants.TABLE_STUDENT)
    public List<Student> getStudents();

    @Insert
    public void insert(Student... students);

    @Update
    public void update(Student... students);

    @Delete
    public void delete(Student student);
}
