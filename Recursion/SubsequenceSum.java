import java.util.ArrayList;

public class SubsequenceSum {
    public static void main(String[] args) {
        int[] array={2,1,4,5,1,1,2,3};
        int n=array.length;
        int target=4;
        ArrayList<Integer> list=new ArrayList<>();
        solve(array,target,n,0,list,0);

    }
    public static void solve(int[] array,int target,int n,int index, ArrayList<Integer> list,int sum)
    {
        if(index>=n)
        {
            if(sum==target)
            {
                System.out.println(list);
                return;
            }
            return ;
        }
        list.add(array[index]);
        solve(array,target,n,index+1,list,sum+array[index]);
        list.remove(list.size()-1);
        solve(array,target,n,index+1,list,sum);


    }
}
