package com.example.adr02_orm_01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.adr02_orm_01.dao.AppDatabase;
import com.example.adr02_orm_01.dao.StudentDAO;
import com.example.adr02_orm_01.models.Student;
import com.example.adr02_orm_01.utils.AppConstrants;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    public Button btn_submit;
    private AppDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initGUI();
        initDatabase();
    }


    private void initGUI(){
        this.btn_submit = findViewById(R.id.btn_submit);
        this.btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hello motherfucker", Toast.LENGTH_SHORT).show();
                StudentDAO studentDAO = database.getStudentDAO();
                Student sdt = new Student();
                sdt.setName("Tuyen Nguyen Dinh");
                sdt.setDtb(10.0);
                studentDAO.insert(sdt);

                List<Student> listStudent = studentDAO.getStudents();
                for (int i = 0; i < listStudent.size(); i++){
                    Log.d("name", listStudent.get(i).getName());
                    Log.d("name", String.valueOf(listStudent.get(i).getDtb()));
                }
            }
        });
    }

    private void initDatabase(){
        database = Room.databaseBuilder(this, AppDatabase.class, AppConstrants.DATABASE)
                .allowMainThreadQueries().build();
    }



}