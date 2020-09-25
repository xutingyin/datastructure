package cn.xutingyin.factory;

import cn.xutingyin.factory.interfac.Product;
import cn.xutingyin.factory.simplefactory.SimpleFactory;

public class SimpleFactoryMain {
    public static void main(String[] args) {
        Product productA = SimpleFactory.createProduct("A");
        System.out.println(productA.getName() + "--price:" + productA.price());

        Product productB = SimpleFactory.createProduct("B");
        System.out.println(productA.getName() + "--price:" + productB.price());

        Product productC = SimpleFactory.createProduct("C");
        System.out.println(productA.getName() + "--price:" + productC.price());

        // 如果此时想再增加一个产品D,那么就必须修改SimpleFactory工厂类，就破坏了开闭原则[对修改关闭，对拓展开放]
    }
}
