public class  DiceRoll {
    public static void main(String[] args) {
       // n = 2, k = 6, target = 7
        int n=10;
        int  k=10;
        int target=45;
        System.out.println(counter(n,k,target,0));


    }
    static long counter(int n,int k,int target,int sum)
    {

        if(n==0)
        {
            if(sum==target)
            {
                return 1;
            }
            return 0;
        }

        long count=0;
        for(int i=1;i<=k;i++)
        {
            count=count+counter(n-1,k,target,sum+i);
        }
        return count;
    }
}
