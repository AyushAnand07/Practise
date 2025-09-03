package SingletonDesignPattern;

public class SingletonDoubleCheck {
    private static volatile SingletonDoubleCheck instance;

    // Private constructor to prevent instantiation
    private SingletonDoubleCheck() {
    }

    // Public method to get the instance
    public static SingletonDoubleCheck getInstance() {
        // First check (without synchronization)
        if (instance == null) {
            synchronized (SingletonDoubleCheck.class) {
                // Second check (with synchronization)
                if (instance == null) {
                    instance = new SingletonDoubleCheck();
                }
            }
        }
        return instance;
    }
}
