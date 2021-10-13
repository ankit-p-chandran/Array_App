package com.example.array_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

//    String fristValue;
//    String secValue;
    ListView ltArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ltArray= findViewById(R.id.ltArray);

        ArrayList<String> stringArray = new ArrayList<>();

//        for(int i=0;i<4;i++){
//
//        }
        stringArray.add("A");
        stringArray.add("B");
        stringArray.add("C");
        stringArray.add("D");
        stringArray.add("E");

        ArrayAdapter<String> myArrayAdapter =
                new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,stringArray);
        ltArray.setAdapter(myArrayAdapter);

//        for(int i=0;i<stringArray.size();i++){
//            Log.d("array","Value is "+stringArray.get(i));
//          }



//        String[] a={"hello","world"};
//
//        fristValue=a[0];
//        secValue=a[1];
//        Log.d("array","1st Value is"+fristValue+secValue);
    }
}