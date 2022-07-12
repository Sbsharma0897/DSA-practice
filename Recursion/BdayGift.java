import java.util.ArrayList;

public class BdayGift {
    public static void main(String[] args) {
        int n=4;
        int k=2;
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        System.out.println(solve(n,k,ans,list,1));
    }
    static ArrayList<ArrayList<Integer>> solve(int n,int k,ArrayList<Integer> ans,ArrayList<ArrayList<Integer>> list,int index)
    {
        if(k==0)
        {
            ArrayList<Integer> temp=new ArrayList<>(ans);
            list.add(temp);
            return list;
        }
        if(index>n)
        {
            return list;
        }

        for (int i = index; i <=n; i++) {
            ans.add(i);
            solve(n,k-1,ans,list,i+1);
            ans.remove(ans.size()-1);
        }
        return list;
    }

}
