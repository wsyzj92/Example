package com.wsyzj.example.designmode.factorymethod;

/**
 * <pre>
 *     author : 焦洋
 *     e-mail : wsyzj_92@163.com
 *     time   : 2019/09/27
 *     desc   : 工厂方法设计模式抽象产品类
 *     version: 1.0
 * </pre>
 */
abstract class Product {

    abstract void show();
}

class ProductA extends Product {

    @Override
    void show() {
        System.out.println("生产出了产品A");
    }
}

class ProductB extends Product {

    @Override
    void show() {
        System.out.println("生产出了产品B");

    }
}