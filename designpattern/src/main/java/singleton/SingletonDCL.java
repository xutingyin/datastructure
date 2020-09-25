package singleton;

/**
 * @description: 双重校验锁单例
 * @author: xuty
 * @date: 2020/9/3 14:39
 */

public class SingletonDCL {
    // 防止指令重排序、保证线程可见性
    private volatile static SingletonDCL INSTANCE;

    private SingletonDCL() {}

    private static SingletonDCL getInstance() {
        if (null == INSTANCE) {
            synchronized (SingletonDCL.class) {
                if (null == INSTANCE) {
                    INSTANCE = new SingletonDCL();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        SingletonDCL instance = SingletonDCL.getInstance();
        System.out.println(instance);
    }
}
