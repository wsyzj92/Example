package com.wsyzj.example.designmode.singleton;

/**
 * <pre>
 *     author : 焦洋
 *     e-mail : wsyzj_92@163.com
 *     time   : 2019/09/24
 *     desc   : 单利设计模式懒汉式
 *     version: 1.0
 * </pre>
 */
class Singleton2 {

    // 不直接创建，外部调用时创建，减少不需要的消耗
    private static Singleton2 singleton2 = null;

    // 私有构造方法，防止外部创建
    private Singleton2() {

    }

    // 对外提供获取实例的方法
    // 这里使用同步锁，当一个线程在执行时，其他线程处于阻塞等待状态
    // 双重校验，防止多个线程同时执行
    public static Singleton2 getInstance() {
        if (singleton2 == null) {
            synchronized (Singleton2.class) {
                if (singleton2 == null) {
                    return singleton2 = new Singleton2();
                }
            }
        }
        return singleton2;
    }
}
