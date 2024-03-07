package com.example.valuta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        ArrayList<DataFlags> list = new ArrayList<>();
        list.clear();

        list.add(new DataFlags(R.drawable.ba, R.string.bosnia,R.string.bosniaBAM));
        list.add(new DataFlags(R.drawable.dz,R.string.algeria,R.string.algeriaDZD));
        list.add(new DataFlags(R.drawable.il,R.string.israel,R.string.israelNIS));
        list.add(new DataFlags(R.drawable.lb,R.string.livan,R.string.livanLBP));

        MyListAdapter myListAdaptery = new MyListAdapter(this, list);
        listView.setAdapter(myListAdaptery);
    }
}