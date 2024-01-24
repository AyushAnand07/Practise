package WrapperClass;

//Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
//Example
//ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid
//ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // Valid
//Advantages
//encapsulation, type conversion, autoboxing and unboxing, utility methods, thread safety, and immutability
public class Example {
    public static void main(String[] args) {
        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);
    }
}
