package SlidingWindow;

public class SubarraywithGivenSum {
    public static void main(String[] args) {
    //https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1
    }
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        int i;
        int j=0;
        int sum=0;
        for(i=0;i<n;i++)
        {
            while(sum<s && j<n)
            {
                sum=sum+arr[j];
                j++;
            }
            if(sum==s && i!=j)
            {
                ans.add(i+1);
                ans.add(j);
                return ans;
            }
            sum=sum-arr[i];

        }
        //System.out.println(sum+" "+i+" "+j);
        ans.add(-1);
        return ans;

    }
}
