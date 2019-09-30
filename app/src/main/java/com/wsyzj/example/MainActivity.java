package com.wsyzj.example;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.wsyzj.example.arithmetic.Arithmetic;

public class MainActivity extends AppCompatActivity {

    private String[] mTitles = {};
    private Class[] mClasses = {};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mTitles);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, mClasses[position]);
                startActivity(intent);
            }
        });

        int[] array = {2, 1, 4, 3, 6, 5, 8, 7, 10, 9};
//        int[] array = Arithmetic.bubbleSort(array);
//        int[] array = Arithmetic.selectionSort(array);
//        int[] array = Arithmetic.insertionSort(array);
//        Arithmetic.quickSort(array, 0, array.length - 1);
        int[] array1 = Arithmetic.shellSort(array);
        count(array1);
    }

    public void count(int[] array) {

        for (int i : array) {
            Log.e("ha", i + "--");
        }

    }
}
