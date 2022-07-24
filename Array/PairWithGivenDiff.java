import java.util.*;

public class PairWithGivenDiff {
    public static void main(String[] args) {
     //https://practice.geeksforgeeks.org/problems/find-pair-given-difference1559/1
  ///Given an array Arr[] of size L and a number N, you need to write a program
        // to find if there exists a pair of elements in the array whose difference is N.
    }
    public boolean findPair(int arr[], int size, int n)
    {
        Arrays.sort(arr);
        int i=0;
        int j=1;

        while(i<size && j<size )
        {
            if(arr[j]-arr[i]==n && i!=j )
            {
                return true;
            }
            else  if(arr[j]-arr[i]>n)
            {
                i++;
            }
            else
            {
                j++;
            }
        }
        return false;
    }
}
