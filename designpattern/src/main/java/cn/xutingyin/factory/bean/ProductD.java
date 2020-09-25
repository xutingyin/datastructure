package cn.xutingyin.factory.bean;

import cn.xutingyin.factory.interfac.Product;

/**
 * 产品D
 */
public class ProductD implements Product {
    @Override
    public int price() {
        return 400;
    }

    @Override
    public String getName() {
        return "Create ProductD ";
    }
}
