import java.util.*;

public class MinimumnumberCoin {
    public static void main(String[] args) {
 //https://practice.geeksforgeeks.org/problems/-minimum-number-of-coins4426/1
    }
    static List<Integer> minPartition(int N)
    {
        int array[]={2000,500,200,100,50,20,10,5,2,1};
        List<Integer> ans=new ArrayList<>();

        int i=0;
        while(i<10 && N>0)
        {
            if(array[i]<=N)
            {
                ans.add(array[i]);
                N=N-array[i];
            }
            else
            {
                i++;
            }
        }
        return ans;


    }

}
