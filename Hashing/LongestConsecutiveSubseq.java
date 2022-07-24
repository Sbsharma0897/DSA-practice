package Hashing;

import java.util.*;

public class LongestConsecutiveSubseq {
    public static void main(String[] args) {
        //https://practice.geeksforgeeks.org/problems/longest-consecutive-subsequence2449/1
        //Given an array of positive integers. Find the length of the longest
        // sub-sequence such that elements in the s
        // ubsequence are consecutive integers, the consecutive numbers can be in any order.
    }
    static int findLongestConseqSubseq(int arr[], int N)
    {
        HashSet<Integer> set=new HashSet<>();
        for(int ch:arr)
        {
            set.add(ch);
        }

        int maxcount=Integer.MIN_VALUE;

        for(int i=0;i<N;i++)
        {
            if(set.contains(arr[i]-1))
            {
                continue;
            }
            else
            {
                int count=0;
                int temp=arr[i];
                while(set.contains(temp))
                {
                    count++;
                    temp=temp+1;
                }

                maxcount=Math.max(count,maxcount);
            }
        }
        return maxcount;
    }
}
