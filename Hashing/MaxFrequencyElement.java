package Hashing;

import java.util.HashMap;

public class MaxFrequencyElement {
    public static void main(String[] args) {
        String str="sandeep";
        System.out.println(solve(str));
    }
    static char solve(String str)
    {
        HashMap<Character,Integer> map=new HashMap<>();

        for (int i = 0; i < str.length(); i++)
        {
            char ch=str.charAt(i);
           if(map.containsKey(ch))
           {
               int old=map.get(ch);
               int neww=old+1;
               map.put(ch,neww);
           }
           else
           {
               map.put(ch,1);
           }
        }
        int maxcount=0;
        char character=str.charAt(0);
        for (Character ch:map.keySet())
        {
            if(map.get(ch)>maxcount)
            {
                maxcount=map.get(ch);
                character=ch;
            }
        }
        return character;
    }
}
