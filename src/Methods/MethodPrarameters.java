package Methods;

import java.io.IOException;
import java.util.Scanner;

public class MethodPrarameters {
    public void add(int a,int b)//Parameters
    {
        System.out.println("Sum is " +(a+b));
    }
}
class tryadd{
    public static void main(String args[])throws IOException{
        Scanner d = new Scanner(System.in);
        int aa,bb;
        System.out.println("Enter 2 values to add up");
        aa= d.nextInt();
        bb = d.nextInt();
        MethodPrarameters t = new MethodPrarameters();
        t.add(aa,bb);
    }
}
