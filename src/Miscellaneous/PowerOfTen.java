package Miscellaneous;

public class PowerOfTen {
    public static void main(String[] args) {
        int n=100;
        if(n<=0)
        {
            System.out.println("Not possible");
            System.exit(0);
        }

        while(n%10==0)
        {
            n=n/10;
        }

        if(n==1)
            System.out.println("N is power of 10");
        else
            System.out.println("Not power of 10");
    }
}
