package CreationalDesignPattern;

public class SingletonLazy {

    public static SingletonLazy sl = new SingletonLazy();
    private SingletonLazy(){

    }
    public static SingletonLazy getInstance() {
        if (sl == null) {
            return sl = new SingletonLazy();
        } else {
            return sl;
        }
    }
}
