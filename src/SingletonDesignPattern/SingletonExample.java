package SingletonDesignPattern;

public class SingletonExample {
        // static class
        private static SingletonExample instance;
        private SingletonExample()
        {
            System.out.println("Singleton is Instantiated.");
        }
        public static SingletonExample getInstance()
        {
            if (instance == null)
                instance = new SingletonExample();
            return instance;
        }
        public static void doSomething()
        {
            System.out.println("Somethong is Done.");
        }
    }

    class GFG {
        public static void main(String[] args)
        {
            SingletonExample.getInstance().doSomething();
        }
    }
