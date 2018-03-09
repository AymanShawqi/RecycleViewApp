package com.android.recycleviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Person> personList=new ArrayList<>();
        personList.add(new Person("ayman",19));
        personList.add(new Person("omr",30));
        personList.add(new Person("ali",22));
        personList.add(new Person("hassan",50));
        personList.add(new Person("yossif",40));
        personList.add(new Person("Eman",13));

        PersonAdapter adapter=new PersonAdapter(this,personList);
        RecyclerView recyclerView=findViewById(R.id.recycle);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
