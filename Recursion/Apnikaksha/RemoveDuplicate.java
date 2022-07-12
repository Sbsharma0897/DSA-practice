package Apnikaksha;

import java.util.Arrays;

public class RemoveDuplicate {
    static boolean[] map=new boolean[26];
    public static void main(String[] args) {
       String string="sandeepsharma";
        System.out.println(removeDuplicates(string));

    }
    static String removeDuplicates(String string)
    {
        if(string.length()==0)
        {
           return "";
        }
        char current=string.charAt(0);
        if(map[current-'a']==false)
        {
            map[current-'a']=true;
            return current+removeDuplicates(string.substring(1));
        }
        else
        {
            return removeDuplicates(string.substring(1));
        }
    }
}
