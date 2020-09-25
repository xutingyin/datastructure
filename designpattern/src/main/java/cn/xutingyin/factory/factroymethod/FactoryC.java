package cn.xutingyin.factory.factroymethod;

import cn.xutingyin.factory.bean.ProductC;
import cn.xutingyin.factory.interfac.IFactory;
import cn.xutingyin.factory.interfac.Product;

/**
 * 生产产品A的工厂FactoryA
 */
public class FactoryC implements IFactory {
    @Override
    public Product createProduct() {
        return new ProductC();
    }
}
