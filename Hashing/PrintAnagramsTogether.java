package Hashing;
import java.util.*;

public class PrintAnagramsTogether {
    public static void main(String[] args) {
        //https://practice.geeksforgeeks.org/problems/print-anagrams-together/1
        //Given an array of strings, return all groups of strings that are anagrams.
        // The groups must be created in order of their appearance in the original array.
        // Look at the sample case for clarification.


        String words[] = {"act","god","cat","dog","tac"};
        System.out.println(Anagrams(words));
    }
    public static List<List<String>>  Anagrams(String[] string_list)
    {

        Arrays.sort(string_list);
        System.out.println(Arrays.toString(string_list));
      HashMap<String,ArrayList<String>> map=new HashMap<>();

      for (String str:string_list)
      {
         char[] original=str.toCharArray();
         Arrays.sort(original);
         String sorted=new String(original);
         if(map.containsKey(sorted))
         {
             ArrayList<String> got=map.get(sorted);
             got.add(str);
             map.put(sorted,got);
         }
         else
         {
             map.put(sorted,new ArrayList<>(Arrays.asList(str)));
         }
      }
      List<List<String>> ans=new ArrayList<>(map.values());
      return ans;


    }
}
