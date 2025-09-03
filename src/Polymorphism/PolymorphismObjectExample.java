package Polymorphism;

public class PolymorphismObjectExample {
    void show() {
        System.out.println("Parent's show()");
    }
}

// Inherited class
class Child extends PolymorphismObjectExample {
    // This method overrides show() of Parent
    @Override
    void show() {
        System.out.println("Child's show()");
    }
}

class TestMain {
    public static void main(String[] args) {
        // If a Parent type reference refers to a Parent object, then Parent's show is called
        PolymorphismObjectExample obj1 = new PolymorphismObjectExample();
        obj1.show();

        // If a Parent type reference refers to a Child object Child's show() is called. This is called RUN TIME POLYMORPHISM.
        PolymorphismObjectExample obj2 = new Child();
        obj2.show();

        //Child child= new PolymorphismObjectExample();  We cant cast parent class like this to a child class object
       // child.show();
    }
}
