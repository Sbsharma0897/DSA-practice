public class SmallestNumber {
    public static void main(String[] args) {
    //https://practice.geeksforgeeks.org/problems/smallest-number5829/1
   //The task is to find the smallest number with given sum of digits as S and number of digits as D.
    }
    static String smallestNumber(int S, int D){

        if(D*9<S)
        {
            return "-1";
        }
        int ans[]=new int[D];
        for(int i=D-1;i>=0;i--)
        {
            if(S>9)
            {
                ans[i]=9;
                S=S-9;
            }
            else
            {
                if(i==0)
                {
                    ans[i]=S;
                    S=0;
                }
                else
                {
                    ans[i]=S-1;
                    S=1;
                    i--;
                    while(i>0)
                    {
                        ans[i]=0;
                        i--;
                    }
                    ans[i]=1;
                }
            }

        }
        String s="";
        for(int i=0;i<D;i++)
        {
            s=s+ans[i];
        }
        return s;

    }
}
