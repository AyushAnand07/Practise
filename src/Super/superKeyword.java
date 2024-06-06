package Super;

public class superKeyword {
        int maxSpeed = 120;
    }

    class Car extends superKeyword {
        int maxSpeed = 180;
        void display()
        {
            // Printing maxSpeed of parent class (vehicle) as super keyword refers to parent class
            System.out.println("Maximum Speed: " + super.maxSpeed);
        }
    }
    class GFG {

        // Main driver method
        public static void main(String[] args)
        {
            Car small = new Car();
            small.display();
        }
    }
