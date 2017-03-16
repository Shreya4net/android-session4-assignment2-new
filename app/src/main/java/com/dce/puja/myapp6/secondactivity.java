package com.dce.puja.myapp6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class secondactivity extends AppCompatActivity {
    ArrayList<Person> personlist;

    String name[] = {"abc", "xyz", "shalini", "Puja", "Shashank","Nikhil"};
    String city[]={"Nagpur","Mumbai","Indore","Delhi","Nasik","Ahmedabad"};
    double phoneno[] = {123456789, 888880765, 4444456, 45645, 76666095,45467834};

ListView lvperson;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lvperson=(ListView)  findViewById(R.id.Listviewperson);
        setContentView(R.layout.activity_secondactivity);


        personlist = new ArrayList<>();
        for (int i=0; i<name.length; i++) {
            Person person = new Person(i+1,name[i],city[i],phoneno[i]);
            personlist.add(person);
        }
        Myadapter adapter= new Myadapter(this,personlist);
        lvperson.setAdapter(adapter);
    }
}
