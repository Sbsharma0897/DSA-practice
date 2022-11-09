public class MinimumHmps {
    public static void main(String[] args) {
        //https://practice.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1?utm_source=youtube&utm_medium=courseteam_practice_desc&utm_campaign=gfg_sde_sheet
    }
    //N^n-TC;

    class Solution{
        static int minJumps(int[] arr){

            int ans=solve(arr,0);
            if(ans==Integer.MAX_VALUE)
            {
                return -1;
            }
            return ans;
        }
        static int solve(int[] arr,int i)
        {
            if(i==arr.length-1)
            {
                return 0;
            }
            if(i>=arr.length || arr[i]==0)
            {
                return Integer.MAX_VALUE-1;
            }

            int val=arr[i];
            int count=Integer.MAX_VALUE-1;
            for(int x=i+1;x<=i+val;x++)
            {
                count=Math.min(solve(arr,x),count);
            }
            return count+1;
        }

    }
