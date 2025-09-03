package HashMap;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class HashMapCountElements {
    public static void majorityElements(int []ar)
    {
        int n= ar.length;
        Map<Integer,Integer> hashmap= new HashMap<>();
        for (int j : ar) {
            if (hashmap.containsKey(j))    //true
            {
                hashmap.put(j, j + 1);
            } else {                        //false
                hashmap.put(j, 1);
            }
        }
        for(int key: hashmap.keySet())
        {
            if(hashmap.get(key)>n/3)
                System.out.println(key);
        }


    }


    public static void main(String []args)throws IOException
    {
        int []ar= {1,2,3,4,5,6,2,4,5};
        majorityElements(ar);
    }
}
