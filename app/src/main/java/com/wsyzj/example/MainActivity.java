package com.wsyzj.example;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.wsyzj.example.activity.ArithmeticActivity;
import com.wsyzj.example.activity.ReflectActivity;
import com.wsyzj.example.aop.AspectJActivity;
import com.wsyzj.example.arithmetic.Fibonacci;

public class MainActivity extends AppCompatActivity {

    private String[] mTitles = {"算法", "反射技术", "AOP面向切面用户行为统计"};
    private Class[] mClasses = {ArithmeticActivity.class, ReflectActivity.class, AspectJActivity.class};

    // 静态代码块
    static {

    }

    // 非静态代码块
    {

    }

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

        int p = Fibonacci.fibonacci(6, "   main  ");
        System.out.println(p);
    }


    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }
}
