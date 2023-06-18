package Constructor;
import java.io.*;
public class Constructor {
    int number;
    public Constructor(){
        number = 100;
    }
}

class tryConstructor
{
    public static void main(String args[])throws IOException
    {
        Constructor d = new Constructor();
        System.out.println(d.number);
    }
}