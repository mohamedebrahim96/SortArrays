package com.vacuum.app.sortarrays;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button up,down;
    List<Dog> list = new ArrayList<Dog>();
    ListView listView;
    ListAdapter adapter;
    EditText edittext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);



        listView = (ListView) findViewById(R.id.list);
        up = (Button) findViewById(R.id.up);
        down = (Button) findViewById(R.id.down);
        edittext = (EditText) findViewById(R.id.edittext);



        list.add(new Dog("Ahmed",22));
        list.add(new Dog("Sayed",18));
        list.add(new Dog("Ali",10));
        list.add(new Dog("Mohamed",32));
        list.add(new Dog("Mahmoud",15));
        adapter = new ListAdapter(this,R.layout.activity_listview, list);
        listView.setAdapter(adapter);


        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Collections.sort(list, Dog.DESCENDING_COMPARATOR);
                adapter = new ListAdapter(MainActivity.this,R.layout.activity_listview, list);
                listView.setAdapter(adapter);
            }
        });
        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Collections.sort(list, Dog.ascending_COMPARATOR);
                adapter= new ListAdapter(MainActivity.this,R.layout.activity_listview, list);
                listView.setAdapter(adapter);
            }
        });
    }
}
