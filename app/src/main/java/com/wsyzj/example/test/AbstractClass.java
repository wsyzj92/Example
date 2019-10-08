package com.wsyzj.example.test;

import java.io.Serializable;

/**
 * <pre>
 *     author : 焦洋
 *     e-mail : wsyzj_92@163.com
 *     time   : 2019/10/02
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public class AbstractClass implements Cloneable, Serializable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
