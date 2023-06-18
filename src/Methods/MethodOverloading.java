package Methods;

import java.io.IOException;
import java.util.Scanner;

public class MethodOverloading {
    public void add(int a,int b){
        System.out.println("Sum is"+ (a+b));
    }
    public void add(float a,float b){
        System.out.println("Sum is"+ (a+b));
    }
    public void add(int a,int b,int c){
        System.out.println("Sum is"+ (a+b+c));
    }
}

class tryMethodOverloading
{
    public static void main(String args[])throws IOException
    {
        Scanner d = new Scanner(System.in);
        MethodOverloading t = new MethodOverloading();
        System.out.println("Enter 3 integers");
        int a= d.nextInt();
        int b = d.nextInt();
        int c = d.nextInt();
        System.out.println("Enter 2 float digits");
        float aa = d.nextFloat();
        float bb = d.nextFloat();
        t.add(a,b);
        t.add(a,b,c);
        t.add(aa,bb);
    }
}
