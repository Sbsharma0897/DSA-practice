import java.util.*;

public class NthFiboNumber {
    public static void main(String[] args) {
        //https://practice.geeksforgeeks.org/problems/nth-fibonacci-number1335/1
//Given a positive integer n, find the nth fibonacci number. Since the answer can be very large,
// return the answer modulo 1000000007.
    }
    static long nthFibonacci(long n){

        long[] dp=new long[(int)(n+1)];
        Arrays.fill(dp,-1);
        return Fibo(n,dp);
    }
    static long Fibo(long n,long[] dp)
    {
        int mod=1000000007;
        if(n==1 || n==0)
        {
            return n%mod;
        }
        if(dp[(int)n]!=-1)
        {
            return dp[(int)n]%mod;
        }

        dp[(int)n]=Fibo(n-1,dp)+Fibo(n-2,dp);
        return dp[(int)n]%mod;
    }
}
