package com.example.adr02_orm_01.models;


import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "students")
public class Student {

    @NonNull
    @PrimaryKey
    public Long id;
    public String name;
    public Double dtb;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDtb() {
        return dtb;
    }

    public void setDtb(Double dtb) {
        this.dtb = dtb;
    }
}
