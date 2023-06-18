package Recursion;

import java.io.IOException;

public class ReverseNumber {
    int reverse = 0, remainder = 0;
    public int reverse(int number) {

        do {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;

        } while (number > 0);

        return reverse;
    }
}
class TryReverse {
    public static void main(String args[]) throws IOException {
        ReverseNumber r = new ReverseNumber();
        int num = 123456789;
        int rr = r.reverse(num);
        System.out.println("Original Number " +num);
        System.out.print("Reversed Number " + rr);
    }
}

