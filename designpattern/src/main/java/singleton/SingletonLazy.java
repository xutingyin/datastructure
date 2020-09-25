package singleton;

/**
 * @description:懒汉式单例：要用的时候才进行实例的创建,是线程安全的
 * @author: xuty
 * @date: 2020/9/3 13:49
 */

public class SingletonLazy {
    private static SingletonLazy INSTANCE;

    private SingletonLazy() {}

    private static synchronized SingletonLazy getinstance() {
        // 为空的时候，才进行创建
        if (null == INSTANCE) {
            INSTANCE = new SingletonLazy();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        SingletonLazy instance = SingletonLazy.getinstance();
        System.out.println(instance);
    }
}
