
import java.util.*;
public class SubarraySumZero {
    public static void main(String[] args) {
        //https://practice.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1
        //Given an array of positive and negative numbers.
        // Find if there is a subarray (of size at-least one) with 0 sum.
    }
    static boolean findsum(int arr[],int n)
    {
        HashSet<Integer> set=new HashSet<>();
        int sum=0;
        for(int ele:arr)
        {
            sum=sum+ele;
            if(sum==0)
            {
                return true;
            }
            if(set.contains(sum))
            {
                return true;
            }
            set.add(sum);
        }
        return false;
    }
}
