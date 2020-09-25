package cn.xutingyin.factory.factroymethod;

import cn.xutingyin.factory.bean.ProductA;
import cn.xutingyin.factory.interfac.IFactory;
import cn.xutingyin.factory.interfac.Product;

/**
 * 生产产品A的工厂FactoryA
 */
public class FactoryA implements IFactory {
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
