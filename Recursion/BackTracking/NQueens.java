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



}
