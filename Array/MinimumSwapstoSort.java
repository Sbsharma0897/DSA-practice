import java.util.*;
public class MinimumSwapstoSort {
    public static void main(String[] args) {
//https://practice.geeksforgeeks.org/problems/minimum-swaps/1
        //Given an array of n distinct elements. Find the minimum number of swaps
        // required to sort the array in strictly increasing order.
    }
    public int minSwaps(int nums[])
    {
        int[] array=Arrays.copyOf(nums,nums.length);
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0;
        for(int ele:nums)
        {

            map.put(ele,i);
            i++;
        }
        Arrays.sort(array);
        HashMap<Integer,Integer> mapnew=new HashMap<>();
        i=0;
        for(int ele:array)
        {

            mapnew.put(ele,i);
            i++;
        }

        int count=0;
        i=0;
        int temp=0;
        while(i<nums.length)
        {
            if(nums[i]==array[i])
            {
                i++;
            }
            else
            {
                int secondnumber=array[i];
                int firstindex=map.get(secondnumber);
                //System.out.println(secondnumber+" "+secondnumber);
                //System.out.println(firstindex+" "+firstindex);
                if(array[firstindex]==nums[i])
                {

                    temp=nums[i];
                    nums[i]=nums[firstindex];
                    nums[firstindex]=temp;
                    count++;
                    i++;
                }
                else
                {
                    int secondindex=mapnew.get(nums[i]);
                    //System.out.println(secondindex+" "+firstindex);
                    temp=nums[firstindex];
                    nums[firstindex]=nums[secondindex];
                    nums[secondindex]=temp;
                    map.put(nums[firstindex],firstindex);
                    // System.out.println(nums[secondindex]+" "+nums[firstindex]);

                    temp=nums[i];
                    nums[i]=nums[secondindex];
                    nums[secondindex]=temp;

                    count=count+2;
                    i++;

                }
            }
            //System.out.println(Arrays.toString(nums)+" "+count);
        }
        return count;

    }
}
