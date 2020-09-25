package singleton;

/**
 * @description: 饿汉式单例
 * @author: xuty
 * @date: 2020/9/3 13:45
 */

public class SingletonHungry {
    // 不管三七二十一，直接来先创建个实例再说
    private static SingletonHungry INSTANCE = new SingletonHungry();

    private static SingletonHungry getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        SingletonHungry instance = SingletonHungry.getInstance();
        System.out.println(instance);
    }
}
