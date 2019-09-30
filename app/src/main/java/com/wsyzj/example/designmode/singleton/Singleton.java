package com.wsyzj.example.designmode.singleton;

/**
 * <pre>
 *     author : 焦洋
 *     e-mail : wsyzj_92@163.com
 *     time   : 2019/09/24
 *     desc   : 单利设计模式（饿汉式）
 *     version: 1.0
 * </pre>
 */
class Singleton {

    // 加载该类时自动创建
    private static Singleton sSingleton = new Singleton();

    // 私有构造方法，防止外部创建多个实例
    private Singleton() {

    }

    // 对外提供获取单利的方法
    public static Singleton newSingleton() {
        return sSingleton;
    }
}
