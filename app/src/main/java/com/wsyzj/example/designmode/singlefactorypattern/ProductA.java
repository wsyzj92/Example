package com.wsyzj.example.designmode.singlefactorypattern;

/**
 * <pre>
 *     author : 焦洋
 *     e-mail : wsyzj_92@163.com
 *     time   : 2019/09/25
 *     desc   : 简单生产模式（具体产品类）
 *     version: 1.0
 * </pre>
 */
class ProductA extends Product {

    @Override
    void show() {
        System.out.println("生产出了具体产品A");
    }
}

class ProductB extends Product {

    @Override
    void show() {
        System.out.println("生产出了具体产品B");
    }
}

class ProductC extends Product {

    @Override
    void show() {
        System.out.println("生产出了具体产品C");
    }
}
