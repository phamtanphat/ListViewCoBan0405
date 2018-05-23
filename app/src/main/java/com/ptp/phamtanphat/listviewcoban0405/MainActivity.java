package com.ptp.phamtanphat.listviewcoban0405;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<String> mangten;
    ArrayAdapter arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.listview);

        mangten = new ArrayList<>();

        mangten.add("Nguyen Van A");
        mangten.add("Nguyen Van B");
        mangten.add("Nguyen Van C");
        mangten.add("Nguyen Van D");
        mangten.add("Nguyen Van E");

        arrayAdapter = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,mangten);
        lv.setAdapter(arrayAdapter);
        
    }
}
