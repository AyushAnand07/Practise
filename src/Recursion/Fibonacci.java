package Recursion;

import java.io.IOException;

public class Fibonacci {
    int n1 = 0, n2 = 1, n3 = 0;

    public void fibonaccinum(int number) {
        if (number > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            fibonaccinum(number - 1);
        }
    }
}
class tryFibonacci
{
    public static void main(String args[])throws IOException
    {
        Fibonacci f = new Fibonacci();
        f.fibonaccinum(15);
    }
}

