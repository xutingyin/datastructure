package designpattern.singleton;

/**
 * 最不安全的单例模式
 */
public class Singleton {
    private static Singleton INSTANCE;

    public Singleton() {}

    public static Singleton getInstance() {
        if (null == INSTANCE) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        System.out.println(instance);
    }
}
