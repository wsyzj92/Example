package com.wsyzj.retrofit;

import java.io.IOException;

import okhttp3.Request;

/**
 * <pre>
 *     author : 焦洋
 *     e-mail : wsyzj_92@163.com
 *     time   : 2019/10/02
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public interface Call<T> extends Cloneable {

    Response<T> execute() throws IOException;

    void enqueue(Callback<T> callback);

    boolean isExecuted();

    void cancel();

    boolean isCanceled();

    Call<T> clone();

    Request request();
}
