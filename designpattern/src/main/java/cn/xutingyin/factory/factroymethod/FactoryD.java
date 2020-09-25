package cn.xutingyin.factory.factroymethod;

import cn.xutingyin.factory.bean.ProductD;
import cn.xutingyin.factory.interfac.IFactory;
import cn.xutingyin.factory.interfac.Product;

/**
 * 生产产品D的工厂FactoryD
 */
public class FactoryD implements IFactory {
    @Override
    public Product createProduct() {
        return new ProductD();
    }
}
