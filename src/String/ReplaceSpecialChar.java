package String;

public class ReplaceSpecialChar {

    public static String replace(String string)
    {
        String rep = string.replaceAll("[^a-zA-Z0-9]","");// ^is used to indicate replace except these
        return rep;
    }

    public static void main(String []args)
    {
        String ss= ReplaceSpecialChar.replace("A@y$u%s^h*");
        System.out.println(ss);
    }
}
