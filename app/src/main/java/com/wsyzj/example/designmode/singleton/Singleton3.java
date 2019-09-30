package com.wsyzj.example.designmode.singleton;

/**
 * <pre>
 *     author : 焦洋
 *     e-mail : wsyzj_92@163.com
 *     time   : 2019/09/24
 *     desc   : 单利设计模式(静态内部类)
 *     version: 1.0
 * </pre>
 */
class Singleton3 {

    private static class Singleton4 {
        private static Singleton3 singleton3 = new Singleton3();
    }

    // 私有构造方法，防止多次创建类的对象
    private Singleton3() {

    }

    //
    public Singleton3 getInstance() {
        return Singleton4.singleton3;
    }

    // 调用过程说明：
    // 1. 外部调用类的getInstance()
    // 2. 自动调用Singleton3.singleton3
    // 2.1 此时单例类Singleton4得到初始化
    // 2.2 而该类在装载 & 被初始化时，会初始化它的静态域，从而创建单例；
    // 2.3 由于是静态域，因此只会JVM只会加载1遍，Java虚拟机保证了线程安全性
    // 3. 最终只创建1个单例
}
