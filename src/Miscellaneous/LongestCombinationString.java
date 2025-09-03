package Miscellaneous;
// input- {"spider","ant","man","spiderman","antman"};
//output- spiderman = spider,man
public class LongestCombinationString {
    public static void main(String[]args)
    {
        String[] words={"spider","ant","man","spiderman","antman"};
        String longestWord="";
        for(int i=0;i< words.length;++i)
        {
            if(words[i].length()>longestWord.length())
                longestWord= words[i];
        }
    }
}
