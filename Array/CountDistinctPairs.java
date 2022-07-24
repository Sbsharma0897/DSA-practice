import java.util.*;

public class CountDistinctPairs {
    public static void main(String[] args) {
   int[] array={1, 5, 3};
   int k=2;
   TotalPairs(array,k);
    }
    public static void TotalPairs(int[] nums, int k)
    {

        HashSet<Integer> set=new HashSet<Integer>();
        for(int ele:nums)
        {
            set.add(ele);
        }
        System.out.println(set);
       int[] array=new int[set.size()];
       set.toArray();


    }
}
