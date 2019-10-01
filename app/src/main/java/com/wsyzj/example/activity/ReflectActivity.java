package com.wsyzj.example.activity;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.wsyzj.example.R;

/**
 * <pre>
 *     author : 焦洋
 *     e-mail : wsyzj_92@163.com
 *     time   : 2019/09/30
 *     desc   : 反射
 *     version: 1.0
 * </pre>
 */
public class ReflectActivity extends AppCompatActivity {

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.activity_reflect);
        method();
        method1();
    }

    // 获取目标类型的Class对象
    private void method() {
        // 方式一
        Boolean aBoolean = true;
        Class<? extends Boolean> aClass = aBoolean.getClass();
        System.out.println(aClass);

        // 方式二
        Class<?> bClass = Boolean.class;
        System.out.println(bClass);

        // 方式三
        try {
            Class<?> cClass = Class.forName("java.lang.Boolean");
            System.out.println(cClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 方式四
        Class<?> dClass = Boolean.TYPE;
        System.out.println(dClass);
    }

    // 通过 Class 对象分别获取Constructor类对象、Method类对象 & Field 类对象
    private void method1() {
        Class<String> stringClass = String.class;
    }
}
