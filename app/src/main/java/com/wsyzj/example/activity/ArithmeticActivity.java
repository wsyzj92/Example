package com.wsyzj.example.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.wsyzj.example.R;
import com.wsyzj.example.arithmetic.Arithmetic;

import java.util.Arrays;

/**
 * <pre>
 *     author : 焦洋
 *     e-mail : wsyzj_92@163.com
 *     time   : 2019/09/26
 *     desc   : 算法
 *     version: 1.0
 * </pre>
 */
public class ArithmeticActivity extends AppCompatActivity {

    private int[] ARRAY = {2, 1, 4, 3, 6, 5, 8, 7, 10, 9, 5};
    private int[] ARRAY_COPY = ARRAY;

    private TextView tv_sort_before;
    private TextView tv_sort_after;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arithmetc);

        tv_sort_before = findViewById(R.id.tv_sort_before);
        tv_sort_after = findViewById(R.id.tv_sort_after);
        tv_sort_before.setText("排序前： " + Arrays.toString(ARRAY));
    }

    /**
     * 冒泡排序
     *
     * @param view
     */
    public void bubbleSort(View view) {
        ARRAY = ARRAY_COPY;
        int[] ints = Arithmetic.bubbleSort(ARRAY);
        tv_sort_after.setText("排序后： " + Arrays.toString(ints));
    }

    /**
     * 选择排序
     *
     * @param view
     */
    public void selectionSort(View view) {
        ARRAY = ARRAY_COPY;
        int[] ints = Arithmetic.selectionSort(ARRAY);
        tv_sort_after.setText("排序后： " + Arrays.toString(ints));
    }

    /**
     * 插入排序
     *
     * @param view
     */
    public void insertionSort(View view) {
        ARRAY = ARRAY_COPY;
        int[] ints = Arithmetic.insertionSort(ARRAY);
        tv_sort_after.setText("排序后： " + Arrays.toString(ints));
    }

    /**
     * 快速排序
     *
     * @param view
     */
    public void quickSort(View view) {
        ARRAY = ARRAY_COPY;
        Arithmetic.quickSort(ARRAY, 0, ARRAY.length - 1);
        tv_sort_after.setText("排序后： " + Arrays.toString(ARRAY));
    }

    /**
     * 希尔排序
     *
     * @param view
     */
    public void shellSort(View view) {
        ARRAY = ARRAY_COPY;
        int[] ints = Arithmetic.shellSort(ARRAY);
        tv_sort_after.setText("排序后： " + Arrays.toString(ints));
    }
}
