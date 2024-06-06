package Polymorphism;

public class MethodOverriding {
        //defining a method
        void run(){System.out.println("Vehicle is running");}
    }
    //Creating a child class
    class Test extends MethodOverriding{
        //defining the same method as in the parent class
        void run(){System.out.println("Bike is running safely");
        }

        public static void main(String args[]){
            Test obj = new Test();
            obj.run();//calling method
        }
    }

