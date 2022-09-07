package SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PrintAllSubarraysDistinctNumbers {
    public static void main(String[] args) {
   //https://www.techiedelight.com/print-sub-arrays-array-distinct-elements/
    }
    public static List<List<Integer>> helper(int[] array, int n)
    {
        List<List<Integer>> list=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();

        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0;
        for(int j=0;j<n;j++)
        {
            if(map.containsKey(array[j]))
            {
                map.put(array[j],map.get(array[j])+1);
            }
            else
            {
                map.put(array[j],1);

            }
            ans.add(array[j]);
            //System.out.println(map.size()+" "+(j-i+1));
            if(map.size()<j-i+1)
            {

                int x=ans.remove(ans.size()-1);

                list.add(new ArrayList<>(ans));
                ans.add(x);

                while(map.size()<j-i+1)
                {
                    if(map.get(array[i])==1)
                    {
                        map.remove(array[i]);
                    }
                    else
                    {
                        map.put(array[i],map.get(array[i])-1);
                    }
                    ans.remove(0);
                    i++;
                }
            }

        }
        list.add(new ArrayList<>(ans));
        return list;
    }
}
