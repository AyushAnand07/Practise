package Inheritance;

public class HybridInheritance {
    public void display() {
        System.out.println("I am a method from class A");
    }
}

class B extends HierarchialInheritance {
    public void print() {
        System.out.println("I am a method from class B");
    }
}

class C extends B {
    public void show() {
        System.out.println("I am a method from class C");
    }
}

class D extends C {
    public void show() {
        System.out.println("I am a method from class D");
    }

    public static void main(String[] args) {
        D objD = new D();
        objD.show();
        objD.print();
    }
}
