package Interface;

interface Animal {
    public abstract void animalSound(); // interface method (does not have a body) //public abstract by default
    public void sleep(); // interface method (does not have a body)
}

class Pig implements Animal {
    public void animalSound() {
        System.out.print("The person sleeping is ");
    }
    public void sleep() {
        System.out.println("Ayush");
    }
}

class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}