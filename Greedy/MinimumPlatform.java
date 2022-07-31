import java.util.*;

public class MinimumPlatform {
    public static void main(String[] args) {
//https://practice.geeksforgeeks.org/problems/minimum-platforms-1587115620/1
        //
    }
    static int findPlatform(int arr[], int dep[], int N)
    {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int count=0;
        int max=0;
        int i=0;
        int j=0;

        while(i<N && j<N)
        {
            if(arr[i]<=dep[j])
            {
                count++;
                i++;
            }
            else
            {
                count--;
                j++;
            }
            if(count>max)
            {
                max=count;
            }
        }
        return max;

    }


}

