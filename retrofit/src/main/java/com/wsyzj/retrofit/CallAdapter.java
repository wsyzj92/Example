package com.wsyzj.retrofit;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
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
public interface CallAdapter<R, T> {

    Type responseType();

    T adapt(Call<R> call);

    abstract class Factory {

        public abstract CallAdapter<?, ?> get(Type returnType, Annotation[] annotations, Retrofit retrofit);

        protected static Type getParameterUpperBound(int index, ParameterizedType type) {
            return Utils.getParameterUpperBound(index, type);
        }

        protected static Class<?> getRawType(Type type) {
            return Utils.getRawType(type);
        }
    }
}
