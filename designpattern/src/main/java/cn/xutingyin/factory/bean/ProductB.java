package cn.xutingyin.factory.bean;

import cn.xutingyin.factory.interfac.Product;

/**
 * 产品B
 */
public class ProductB implements Product {
    @Override
    public int price() {
        return 200;
    }

    @Override
    public String getName() {
        return "Create ProductB ";
    }
}
