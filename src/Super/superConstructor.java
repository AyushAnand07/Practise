package Super;

public class superConstructor {

        // Constructor of superclass
        superConstructor()
        {
            System.out.println("Person class Constructor");
        }
    }
    class Student extends superConstructor {
        Student() {
            // Invoking the parent class constructor with the usage of super() word and must be written at a first statement to work
            super();

            // Print statement whenever subclass constructor is called
            System.out.println("Student class Constructor");
        }
    }

    class Test {

        // Main driver method
        public static void main(String[] args)
        {
            Student s = new Student();
        }
    }

