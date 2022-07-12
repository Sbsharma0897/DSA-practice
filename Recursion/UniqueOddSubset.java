import java.util.ArrayList;
import java.util.HashMap;

public class UniqueOddSubset {
    public static void main(String[] args) {
        int n=4;
         int[] array={19,27,26,27};
        int k=3;
        ArrayList<Integer> ans= new ArrayList<>();
        System.out.println(solve(n,k,array,ans,0));
    }
    static String solve(int n,int k,int[] array,ArrayList<Integer> ans,int index)
    {
        if(index==array.length)
        {
            HashMap<Integer,Integer> map=new HashMap<>();
            int sum=0;
            for (int i = 0; i < ans.size(); i++)
            {
                map.put(ans.get(i),1);
                sum=sum+ans.get(i);
            }
            if(map.size()>=k && sum%2==1)
            {
                return "True";
            }
            else
            {
                return "False";
            }
        }
        String returned=solve(n,k,array,new ArrayList<Integer>(ans),index+1);
        if(returned=="True")
        {
            return returned;
        }
        ans.add(array[index]);
        return solve(n,k,array,new ArrayList<Integer>(ans),index+1);

    }
}
