package com.example.android.recyclergridlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Student> students;
    StudentRecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        //recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(3,1));
    }

    @Override
    protected void onStart() {
        super.onStart();
        super.onStart();
        students = generateStudents(50);
        adapter = new StudentRecyclerAdapter(students,this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        recyclerView.setAdapter(adapter);
    }

    private ArrayList<Student> generateStudents(int count){
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            Student student = new Student("Student " + i);
            students.add(student);
        }
        return students;
    }

}
