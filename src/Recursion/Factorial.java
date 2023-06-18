package Recursion;

import java.io.IOException;

public class Factorial {
    public int factorialnum(int n){
        if (n != 0)  // termination condition
            return n * factorialnum(n-1); // recursive call
        else
            return 1;
}
}

class tryRecursion{
    public static void main(String []args)throws IOException
    {
        Factorial f = new Factorial();
        int fac = f.factorialnum(5);
        System.out.println("Factorial is " +fac);
    }
}
