import  java.util.*;

public class PrintPaths {
    public static void main(String[] args) {
        int[][] matrix=
                {
                        {1,2,3},
                        {4,5,6}
                };
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0;
        int j=0;
        solve(matrix,list,ans,i,j);
        System.out.println(list);
    }

    private static void solve(int[][] matrix, ArrayList<ArrayList<Integer>> list, ArrayList<Integer> ans, int i, int j)
    {
        if(i<0 || i>=2 || j<0 || j>=3)
        {
            return;
        }
        if(i==1 && j==2)
        {
            ans.add(matrix[i][j]);
            list.add(new ArrayList<>(ans));
            ans.remove(ans.size()-1);
            return ;
        }
        ans.add(matrix[i][j]);
        solve(matrix,list,ans,i+1,j);
        solve(matrix,list,ans,i,j+1);
        ans.remove(ans.size()-1);
    }


}
