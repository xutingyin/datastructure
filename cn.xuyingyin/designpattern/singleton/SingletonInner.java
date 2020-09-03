package designpattern.singleton;

/**
 * @description: 静态内部类单例
 * @author: xuty
 * @date: 2020/9/3 14:11
 */

public class SingletonInner {

    private static class SingletonHolder {
        private static SingletonInner INSTANCE = new SingletonInner();
    }

    private static SingletonInner getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public static void main(String[] args) {
        SingletonInner instance = SingletonInner.getInstance();
        System.out.println(instance);
    }
}
