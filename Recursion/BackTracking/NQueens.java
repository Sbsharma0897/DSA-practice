package BackTracking;

import java.util.Arrays;

public class NQueens {
    public static void main(String[] args) {
        int n=4;
        int[][] matrix=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for (int j = 0; j < n; j++)
            {
                matrix[i][j]=0;
            }
        }
        int count=findingpath(matrix,4,0,0);
        System.out.println(count);


    }
    static void display(int[][] matrix,int n)
    {
        for(int row=0;row<n;row++)
        {
            for (int col = 0; col < n; col++)
            {
                if(matrix[row][col]==1)
                {
                    System.out.print("Q ");
                }
                else
                {
                    System.out.print("N ");
                }
            }
            System.out.println( );
        }
        System.out.println("---------------");
    }
    static int findingpath(int[][] matrix,int n,int i,int j)
    {
      if(i==n)
      {
          display(matrix,n);
         return 1;
      }
     int count=0;
        for (int col = 0; col < n; col++) {

            if(isSafe(matrix,i,col))
            {
                matrix[i][col]=1;
                count=count+findingpath(matrix,n,i+1,0);
                matrix[i][col]=0;

            }

        }
        return count;
    }
    static boolean isSafe(int[][] matrix,int i,int j)
    {
        for (int row = i-1; row>=0; row--) {
            if(matrix[row][j]==1)
            {
                return false;
            }
        }
        for (int row = i-1,col=j-1; row>=0 && col>=0; row--,col--) {
            if(matrix[row][col]==1)
            {
                return false;
            }
        }
        for (int row = i-1,col=j+1; row>=0 && col<matrix[0].length; row--,col++)
        {
            if(matrix[row][col]==1)
            {
                return false;
            }
        }
        return true;
    }















    class Solution {
        public List<List<String>> solveNQueens(int n) {

            List<List<String>> list=new ArrayList<>();
            char[][] output=new char[n][n];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    output[i][j]='.';
                }
            }
            solve(0,n,list,output);
            return list;
        }
        public void solve(int index,int n,List<List<String>> list,char[][] output)
        {

            if(index==n)
            {

                List<String> ans=new ArrayList<>();
                for(int i=0;i<n;i++)
                {
                    String str="";
                    for(int j=0;j<n;j++)
                    {
                        str=(str+output[i][j]);
                    }
                    ans.add(str);

                }
                list.add(new ArrayList<>(ans));
                return;
            }

            for(int i=0;i<n;i++)
            {
                if(possible(output,index,i,n))
                {
                    output[index][i]='Q';
                    solve(index+1,n,list,output);
                    output[index][i]='.';
                }


            }

        }
        public boolean possible(char[][] nums,int x,int y,int n)
        {


            for(int i=0;i<n;i++)
            {
                if(nums[i][y]=='Q')
                {

                    return false;
                }
            }

            for(int i=0;i<n;i++)
            {
                // System.out.println(nums[x][i]);
                if(nums[x][i]=='Q')
                {
                    return false;
                }
            }


            for(int i=x-1,j=y-1;i>=0 && j>=0;i--,j--)
            {
                // System.out.println(nums[i][j]);
                if(nums[i][j]=='Q')
                {
                    return false;
                }
            }
            for(int i=x-1,j=y+1;i>=0 && j<n;i--,j++)
            {
                // System.out.println(nums[i][j]);
                if(nums[i][j]=='Q')
                {
                    return false;
                }
            }


            return true;
        }
    }

}
