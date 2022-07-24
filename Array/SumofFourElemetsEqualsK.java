import java.util.*;

public class SumofFourElemetsEqualsK {
    public static void main(String[] args) {
//https://practice.geeksforgeeks.org/problems/four-elements2452/1
        //Given an array A of N integers. You have to find whether a combination of four elements in
        // the array whose sum is equal to a given value X exists or not.
    }
    boolean find4Numbers(int arr[], int n, int k)
    {

        Arrays.sort(arr);


        for(int i=0;i<n-3;i++)
        {

            for(int j=i+1;j<n-2;j++)
            {

                int halfsum=arr[i]+arr[j];
                int rem=k-halfsum;
                //System.out.println(rem+"rem");
                int l=j+1;
                int h=n-1;
                while(l<h)
                {
                    if(arr[l]+arr[h]==rem)
                    {
                        return true;


                    }
                    else if(arr[l]+arr[h]<rem)
                    {
                        l++;
                    }
                    else
                    {
                        h--;
                    }
                }
            }

        }
        return false;
    }

}
