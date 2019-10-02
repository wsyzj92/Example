package com.wsyzj.example;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.wsyzj.example.activity.ArithmeticActivity;
import com.wsyzj.example.activity.ReflectActivity;
import com.wsyzj.example.aop.AspectJActivity;

public class MainActivity extends AppCompatActivity {

    private String[] mTitles = {"算法", "反射技术", "AOP面向切面用户行为统计"};
    private Class[] mClasses = {ArithmeticActivity.class, ReflectActivity.class, AspectJActivity.class};

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

    }
}
