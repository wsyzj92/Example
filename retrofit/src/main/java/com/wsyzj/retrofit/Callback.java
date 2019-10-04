package com.wsyzj.retrofit;

/**
 * <pre>
 *     author : 焦洋
 *     e-mail : wsyzj_92@163.com
 *     time   : 2019/10/02
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public interface Callback<T> {

    void onResponse(Call<T> call, Response<T> response);

    void onFailure(Call<T> call, Throwable t);

}
