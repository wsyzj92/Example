package com.wsyzj.retrofit;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/**
 * <pre>
 *     author : 焦洋
 *     e-mail : wsyzj_92@163.com
 *     time   : 2019/10/03
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public class DefaultCallAdapterFactory extends CallAdapter.Factory {

    static final CallAdapter.Factory INSTANCE = new DefaultCallAdapterFactory();

    @Override
    public CallAdapter<?, ?> get(Type returnType, Annotation[] annotations, Retrofit retrofit) {
        if (getRawType(returnType) != Call.class) {
            return null;
        }

        final Type responseType = Utils.getCallResponseType(returnType);

        return new CallAdapter<Object, Object>() {
            @Override
            public Type responseType() {
                return responseType;
            }

            @Override
            public Object adapt(Call<Object> call) {
                return call;
            }
        };
    }
}
