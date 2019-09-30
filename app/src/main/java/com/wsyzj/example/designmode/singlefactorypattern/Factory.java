package com.wsyzj.example.designmode.singlefactorypattern;

/**
 * <pre>
 *     author : 焦洋
 *     e-mail : wsyzj_92@163.com
 *     time   : 2019/09/25
 *     desc   : 简单工厂模式（工厂类）
 *     version: 1.0
 * </pre>
 */
class Factory {

    public static Product Manufacture(String productName) {
        //工厂类里用switch语句控制生产哪种商品；
//使用者只需要调用工厂类的静态方法就可以实现产品类的实例化。
        switch (productName) {
            case "A":
                return new ProductA();
            case "B":
                return new ProductA();
            case "C":
                return new ProductA();
            default:
                return null;
        }
    }
}
