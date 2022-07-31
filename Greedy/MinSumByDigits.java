import java.util.*;

public class MinSumByDigits {
    public static void main(String[] args) {
//https://practice.geeksforgeeks.org/problems/min-sum-formed-by-digits3551/1
  //Given an array of digits (values are from 0 to 9), find the minimum possible sum
        // of two numbers formed from digits of the array. All digits of given array
        // must be used to form the two numbers.
    }
    public static long minSum(int arr[], int n)
    {
        Arrays.sort(arr);
        String num1="";
        String num2="";

        if(n==1)
        {
            return arr[0];
        }
        int i=0;
        while(i<n)
        {
            num1 +=arr[i];
            i++;
            if(i<n)
            {
                num2 +=arr[i];
                i++;
            }
        }
        //System.out.println(Long.parseLong(num1)+"  "+num2);
        long n1=Long.parseLong(num1.trim());
        long n2=Long.parseLong(num2.trim());

        return n1+n2;
    }

}
