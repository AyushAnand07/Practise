package String;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s1 = "xxy";
        String s2 = "aab";
        boolean b= true;
        if (s1.length() != s2.length())
            System.out.println("Not isomorphic");
        else {
            Map<Character, Integer> m1 = new HashMap<>();
            Map<Character, Integer> m2 = new HashMap<>();

            for(int i=0;i<s1.length();++i)
            {
                if(!m1.containsKey(s1.charAt(i)))
                    m1.put(s1.charAt(i),i);

                if(!m2.containsKey(s2.charAt(i)))
                    m2.put(s2.charAt(i),i);

                if(!m1.get(s1.charAt(i)).equals(m2.get(s2.charAt(i)))) //checking if both indices match or not, if not that not isomorphic
                    b= false;
            }

            if(b== true)
                System.out.println("Isomorphic");
            else
                System.out.println("Not Isomorphic");
        }
    }
}
