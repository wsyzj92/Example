package com.wsyzj.example.designmode.singlefactorypattern;

/**
 * <pre>
 *     author : 焦洋
 *     e-mail : wsyzj_92@163.com
 *     time   : 2019/09/25
 *     desc   : 简单工程模式 工厂生产产品流程
 *     version: 1.0
 * </pre>
 */
class SingleFactoryPattern {

    public static void main(String array) {
        Factory factory = new Factory();

        // 调用工厂类的静态方法 & 传入不同参数从而创建产品实例
        try {
            factory.Manufacture("A").show();
        } catch (Exception e) {
            System.out.println("没有找到这类产品A");
        }

        try {
            Factory.Manufacture("B").show();
        } catch (Exception e) {
            System.out.println("没有找到这类产品B");
        }

        try {
            factory.Manufacture("C").show();
        } catch (Exception e) {
            System.out.println("没有找到这类产品C");
        }

        try {
            factory.Manufacture("D").show();
        } catch (Exception e) {
            System.out.println("没有找到这类产品D");
        }
    }
// 优点
//    将创建实例的工作与使用实例的工作分开，使用者不必关心类对象如何创建，实现了解耦；
//    把初始化实例时的工作放到工厂里进行，使代码更容易维护。 更符合面向对象的原则 & 面向接口编程，而不是面向实现编程。

// 缺点
//    工厂类集中了所有实例（产品）的创建逻辑，一旦这个工厂不能正常工作，整个系统都会受到影响；
//    违背“开放 - 关闭原则”，一旦添加新产品就不得不修改工厂类的逻辑，这样就会造成工厂逻辑过于复杂。
//    简单工厂模式由于使用了静态工厂方法，静态方法不能被继承和重写，会造成工厂角色无法形成基于继承的等级结构。
}
