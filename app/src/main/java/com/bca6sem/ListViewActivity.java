package com.bca6sem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        ListView itemslv=findViewById(R.id.itemslv);
        String names[]={"Savitri","Manisha","Diksha","Sugam","Karan","Paras"};
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_view_items,R.id.namesTv,names);

  itemslv.setAdapter(adapter);
    }

}