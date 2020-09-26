package cn.xutingyin.factory.bean;

import cn.xutingyin.factory.interfac.Product;

/**
 * 产品C
 */
public class ProductC implements Product {
    @Override
    public int price() {
        return 300;
    }

    @Override
    public String getName() {
        return "Create ProductC ";
    }
}
