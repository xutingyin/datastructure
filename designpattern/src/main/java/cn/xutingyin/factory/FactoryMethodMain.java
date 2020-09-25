package cn.xutingyin.factory;

import cn.xutingyin.factory.factroymethod.FactoryA;
import cn.xutingyin.factory.factroymethod.FactoryB;
import cn.xutingyin.factory.factroymethod.FactoryC;
import cn.xutingyin.factory.factroymethod.FactoryD;
import cn.xutingyin.factory.interfac.IFactory;
import cn.xutingyin.factory.interfac.Product;

public class FactoryMethodMain {
    public static void main(String[] args) {
        // 为了解决简单工厂遗留的这个问题，我们可以使用工厂方法模式
        IFactory factoryA = new FactoryA();
        Product productA = factoryA.createProduct();
        System.out.println(productA.getName() + ",price: " + productA.price());

        IFactory factoryB = new FactoryB();
        Product productB = factoryB.createProduct();
        System.out.println(productB.getName() + ",price: " + productB.price());

        IFactory factoryC = new FactoryC();
        Product productC = factoryC.createProduct();
        System.out.println(productC.getName() + ",price: " + productC.price());
        // 如果此时想要再增加一个产品D,只需要新增一个FactoryD和ProductD,这是扩展，没有对原有的工厂类作出任何修改，所以遵循了开闭原则
        IFactory factoryD = new FactoryD();
        Product productD = factoryD.createProduct();
        System.out.println(productD.getName() + ",price: " + productD.price());
        // 使用工厂
    }
}
