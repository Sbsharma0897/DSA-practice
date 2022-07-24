package Hashing;

import java.util.*;


public class WinnerOfElection {
    public static void main(String[] args) {
 //https://practice.geeksforgeeks.org/problems/winner-of-an-election-where-votes-are-represented-as-candidate-names-1587115621/1
    }
    public static String[] winner(String arr[], int n)
    {
        HashMap<String,Integer> map=new HashMap<>();
        for (String el:arr)
        {
            map.put(el,map.getOrDefault(el,0)+1);
        }
        int max=0;
        String name="";
        for (String el: map.keySet())
        {
           int x=map.get(el);
           if(x>max)
           {
               max=x;

           }
            if(x==max && el.compareTo(name)<0)
            {
                name=el;
            }
        }
        String[] ans={name,String.valueOf(max)};
          return ans;
    }

    public static void findWinner(String votes[])
    {
        // Insert all votes in a hashmap
        Map<String,Integer> map =
                new HashMap<String, Integer>();
        for (String str : votes)
        {
            if (map.keySet().contains(str))
                map.put(str, map.get(str) + 1);
            else
                map.put(str, 1);
        }

        // Traverse through map to find the candidate
        // with maximum votes.
        int maxValueInMap = 0;
        String winner = "";
        for (Map.Entry<String,Integer> entry : map.entrySet())
        {
            String key  = entry.getKey();
            Integer val = entry.getValue();
            if (val > maxValueInMap)
            {
                maxValueInMap = val;
                winner = key;
            }

            // If there is a tie, pick lexicographically
            // smaller.
            else if (val == maxValueInMap &&
                    winner.compareTo(key) > 0)
                winner = key;
        }
        System.out.println(winner);
    }
}
