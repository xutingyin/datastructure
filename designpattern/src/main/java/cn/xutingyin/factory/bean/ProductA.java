package cn.xutingyin.factory.bean;

import cn.xutingyin.factory.interfac.Product;

/**
 * 产品A
 */
public class ProductA implements Product {
    @Override
    public int price() {
        return 100;
    }

    @Override
    public String getName() {
        return "Create ProductA ";
    }
}
