import java.util.*;

public class KnapsackProblem01 {
    public static void main(String[] args) {
    //https://practice.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1


    }
    static int knapSackONE(int W, int wt[], int val[], int n)
    {
        int values=0;
        return knap(wt,val,n,W,values);
        //This is done using recursion and it fails as the givem TC is N*M and we get 2^n as
        //we are finding all subsets of the array;
    }
    static int knap(int[] wt,int[] val,int n,int W,int values)
    {
        if(n==0 || W==0)
        {
            return values;
        }

        if(wt[n-1]<=W)
        {
            int a= knap(wt,val,n-1,W-wt[n-1],values+val[n-1]);
            int b= knap(wt,val,n-1,W,values);

            return Math.max(a,b);

        }
        else
        {
            return knap(wt,val,n-1,W,values);
        }
    }

    static int knapSackTWO(int W, int wt[], int val[], int n)
    {

        return knap(wt,val,n-1,W);
        //This is done using recursion and it fails as the givem TC is N*M and we get 2^n as
        //we are finding all subsets of the array;
    }
    static int knap(int[] wt,int[] val,int index,int W)
    {
        if(index==-1)
        {
            return 0;
        }

        if(wt[index]<=W)
        {
            int a= val[index]+knap(wt,val,index-1,W-wt[index]);
            int b= knap(wt,val,index-1,W);

            return Math.max(a,b);

        }
        else
        {
            return   (wt,val,index-1,W);
        }
    }



    static int knapSackTHREE(int W, int wt[], int val[], int n)
    {
        int dp[][]=new int[n+1][W+1];
        for(int[] array: dp)
        {
            Arrays.fill(array,-1);
        }


        int index=0;
        return knap(wt,val,n,W,dp,index);
//Complexity Analysis:
//
//Time Complexity: O(N*W).
//As redundant calculations of states are avoided.
//Auxiliary Space: O(N*W) + O(N).
//The use of 2D array data structure for storing intermediate states and O(N) auxiliary
// stack space(ASS) has been used for recursion stack:


    }
    static int knap(int[] wt,int[] val,int n,int W,int[][] dp,int index)
    {


        if(W==0)
        {
            return 0;
        }
        if(index==n)
        {
            return 0;
        }

        if(dp[index][W]!=-1)
        {
            return dp[index][W];
        }

        int include=0;
        if(wt[index]<=W)
        {
            include= val[index]+knap(wt,val,n,W-wt[index],dp,index+1);

        }

        int exclude= knap(wt,val,n,W,dp,index+1);
        return dp[index][W]=Math.max(include,exclude);

    }


    static int knapSack(int W, int wt[], int val[], int n)
    {

        //Bottom up approach
        //Complexity Analysis:
        //
        //Time Complexity: O(N*W).
        //where ‘N’ is the number of weight element and ‘W’ is capacity. As for every weight element we traverse through all weight capacities 1<=w<=W.
        //Auxiliary Space: O(N*W).
        //The use of 2-D array of size ‘N*W’.
        int dp[][]=new int[n+1][W+1];

        for(int i=0;i<n+1;i++)
        {
            for(int j=0;j<W+1;j++)
            {
                if(i==0 || j==0)
                {
                    dp[i][j]=0;
                }
                else if(wt[i-1]<=j)
                {
                    dp[i][j]=Math.max((val[i-1]+dp[i-1][j-wt[i-1]]),dp[i-1][j]);
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][W];
    }


}
