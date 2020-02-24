package com.wsyzj.example.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.wsyzj.example.R;

import org.reactivestreams.Subscription;

import java.util.concurrent.TimeUnit;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

/**
 * <pre>
 *     author : 焦洋
 *     e-mail : wsyzj_92@163.com
 *     time   : 2020/02/24
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public class RxJavaActivity extends AppCompatActivity {

    private Button btn_send_code;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rxjava);
        btn_send_code = findViewById(R.id.btn_send_code);
    }

    /**
     * 发验证码
     *
     * @param view
     */
    public void sendCode(View view) {
        final int count = 3;

        Flowable.interval(0, 1, TimeUnit.SECONDS)
                .take(count + 1)
                .map(new Function<Long, Long>() {
                    @Override
                    public Long apply(Long aLong) throws Exception {
                        return count - aLong;
                    }
                })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new FlowableSubscriber<Long>() {
                    @Override
                    public void onSubscribe(Subscription s) {
//                        btn_send_code.setEnabled(false);
                        Log.e("onSubscribe", Thread.currentThread().getName());
                        btn_send_code.setText(count + "S");
                    }

                    @Override
                    public void onNext(Long aLong) {
                        Log.e("onNext", Thread.currentThread().getName());
                        btn_send_code.setText("S");
                    }

                    @Override
                    public void onError(Throwable t) {
                        Log.e("onError", Thread.currentThread().getName());
                        btn_send_code.setEnabled(true);
                        btn_send_code.setText("发送验证码");
                    }

                    @Override
                    public void onComplete() {
                        Log.e("onComplete", Thread.currentThread().getName());
                        btn_send_code.setEnabled(true);
                        btn_send_code.setText("发送验证码");
                    }
                });


//        //开始倒计时
//        final int count = 3;//倒计时3秒
//        Observable.interval(0, 1, TimeUnit.SECONDS)//延迟0，间隔1s，单位秒
//                .take(count + 1)//限制发射次数（因为倒计时要显示 3 2 1 0 四个数字）
//                //使用map将数字转换，这里aLong是从0开始增长的,所以减去aLong就会输出3 2 1 0这种样式
//                .map(new Function<Long, Long>() {
//                    @Override
//                    public Long apply(Long aLong) throws Exception {
//                        return count - aLong;
//                    }
//                })
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Observer<Long>() {
//                    @Override
//                    public void onSubscribe(Disposable d) {
//
//                    }
//
//                    @Override
//                    public void onNext(Long num) {
//                        //接收到消息，这里需要判空，因为3秒倒计时中间如果页面结束了，会造成找不到 tvAdCountDown
//                        if (btn_send_code != null) {
//                            btn_send_code.setText(num + "");
//                        }
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//
//                    }
//
//                    @Override
//                    public void onComplete() {
//                        //完成之后跳转到主页面
//
//                    }
//                });
    }
}
