package String;

public class Palindrome {
    public static void main(String[] args)
    {
        String s= "Namann";
        s= s.toLowerCase();
        int left= 0;
        int right= s.length()-1;
        boolean b= true;
        for(int i=0;i<s.length()-1;++i)
        {
            if(s.charAt(left)!= s.charAt(right))
                b= false;
            left++;
            right--;
        }
        if(b== true)
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");
    }
}
