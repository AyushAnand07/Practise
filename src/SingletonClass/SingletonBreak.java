package SingletonClass;
import java.lang.reflect.Constructor;
public class SingletonBreak {
    private static SingletonBreak instance;

    private SingletonBreak() {  // Private constructor prevents instantiation
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create.");
        }
    }

    public static SingletonBreak getInstance() {
        if (instance == null) {
            instance = new SingletonBreak();
        }
        return instance;
    }
}

 class SingletonBreakReflection {
    public static void main(String[] args) {
        try {
            SingletonBreak instance1 = SingletonBreak.getInstance();

            // Use Reflection to access private constructor
            Constructor<SingletonBreak> constructor = SingletonBreak.class.getDeclaredConstructor();
            constructor.setAccessible(true); // Bypass private constructor

            SingletonBreak instance2 = constructor.newInstance(); // Creates second instance!

            System.out.println("Instance 1: " + instance1);
            System.out.println("Instance 2: " + instance2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
