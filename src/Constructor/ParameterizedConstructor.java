package Constructor;

import java.io.IOException;

public class ParameterizedConstructor {
    int number;
    public ParameterizedConstructor(int n)
    {
        this.number = n;
    }
}

class tryConst
{
    public static void main(String args[])throws IOException
    {
        ParameterizedConstructor d = new ParameterizedConstructor(1000);
        System.out.println(d.number);
    }
}
