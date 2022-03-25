package com.example.day4;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner list;
    ArrayList arList;
    ArrayAdapter arAdapter;
    CheckBox c;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = findViewById(R.id.spinner);
        c = findViewById(R.id.checkBox);
        c.isChecked();
        arList = new ArrayList();
        arList.add("Sofo");
        arList.add("Mishka");
        arList.add("Nukri");
        arList.add("Bela");
        arList.add("Gio");
        arList.add("Juli");
        arList.add("Sofo");
        arList.add("Mishka");
        arList.add("Nukri");
        arList.add("Bela");
        arList.add("Gio");
        arList.add("Juli");
        arList.add("Sofo");
        arList.add("Mishka");
        arList.add("Nukri");
        arList.add("Bela");
        arList.add("Gio");
        arList.add("Juli");
        arAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, arList);
        list.setAdapter(arAdapter);
        /*list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Hello"+" " +arList.get(i), Toast.LENGTH_SHORT).show();
            }
        });*/
        list.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "HI", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public void chk(View view) {
        Toast.makeText(this, "" + c.isChecked(), Toast.LENGTH_SHORT).show();
    }
}