package com.wsyzj.example.designmode.singleton;

/**
 * <pre>
 *     author : 焦洋
 *     e-mail : wsyzj_92@163.com
 *     time   : 2019/09/24
 *     desc   : 单利设计模式（枚举）
 *     version: 1.0
 * </pre>
 */
enum Singleton1 {

    // 定义枚举元素
    INSTANCE;

    // 私有构造方法
    private Singleton1() {

    }

    // 获取单例的方式：
//    Singleton singleton = Singleton.INSTANCE;
}
