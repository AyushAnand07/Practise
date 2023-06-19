package Inheritance;

import java.io.IOException;

public class SingleInheritance {
        public void print() {
            System.out.println("Parent class !");
        }
    }

    class Child extends SingleInheritance {
        public void display() {
            System.out.println("Child class !");
        }

        public static void main(String[] args) {
            Child obj = new Child();
            obj.print();
            obj.display();
        }
}