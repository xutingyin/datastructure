package cn.xutingyin.factory.simplefactory;

import cn.xutingyin.factory.bean.ProductA;
import cn.xutingyin.factory.bean.ProductB;
import cn.xutingyin.factory.bean.ProductC;
import cn.xutingyin.factory.interfac.Product;

/**
 * 简单工厂模式
 */
public class SimpleFactory {

    public static Product createProduct(String type) {

        Product product = null;
        switch (type) {
            case "A":
                product = new ProductA();
                break;
            case "B":
                product = new ProductB();
                break;
            case "C":
                product = new ProductC();
                break;

        }
        return product;
    }
}
