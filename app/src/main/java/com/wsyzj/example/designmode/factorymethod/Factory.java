package com.wsyzj.example.designmode.factorymethod;

/**
 * <pre>
 *     author : 焦洋
 *     e-mail : wsyzj_92@163.com
 *     time   : 2019/09/27
 *     desc   : 工厂方法设计模式抽象的工厂类
 *     version: 1.0
 * </pre>
 */
abstract class Factory {
    abstract Product manufeture();
}

class FactoryA extends Factory {

    @Override
    Product manufeture() {
        return new ProductA();
    }
}

class FactoryB extends Factory {

    @Override
    Product manufeture() {
        return new ProductB();
    }
}