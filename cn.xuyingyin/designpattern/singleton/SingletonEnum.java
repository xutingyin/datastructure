package designpattern.singleton;

/**
 * @description: 枚举单例:Effective Java作者Josh Bloch 提倡的方式，它不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象
 * @author: xuty
 * @date: 2020/9/3 14:18
 */

public enum SingletonEnum {
    INSTANCE;

    public static void main(String[] args) {
        System.out.println(SingletonEnum.INSTANCE);
    }
}
