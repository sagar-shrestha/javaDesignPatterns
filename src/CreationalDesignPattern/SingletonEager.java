package CreationalDesignPattern;

/*
 * This SingletonEager class will always create
 * instance as the system starts.
 * This feature can be called as benefited or
 * may be called drawback.
 */
public class SingletonEager {

    public static SingletonEager se = new SingletonEager();

    private SingletonEager() {
    }

    public static SingletonEager getInstance() {
        return se;
    }
}