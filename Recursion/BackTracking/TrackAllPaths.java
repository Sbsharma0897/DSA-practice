package BackTracking;

import java.sql.Array;
import java.util.Arrays;

public class TrackAllPaths {

    public static void main(String[] args) {
        boolean[][] matrix={
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };
//        path(matrix,"",0,0);
        int[][] path=
                {
                        {0,0,0},
                        {0,0,0},
                        {0,0,0}
                };
        pathprint(matrix,"",0,0,path,1);

    }
    static void path(boolean[][] matrix, String p,int i,int j)
    {
        if(matrix[i][j]==false)
        {
            return;
        }
        if(i==2 && j==2)
        {

            System.out.println(p);
            return;
        }
        matrix[i][j]=false;

        if(i<matrix.length-1)
        {

           path(matrix,p+'D',i+1,j);
        }
        if(j<matrix[0].length-1)
        {
            path(matrix,p+'R',i,j+1);
        }
        if(i>0)
        {
            path(matrix,p+'U',i-1,j);
        }
        if(j>0)
        {
            path(matrix,p+'L',i,j-1);
        }
        matrix[i][j]=true;


    }

    static void pathprint(boolean[][] matrix, String p,int i,int j,int[][] path,int steps)
    {


        if(matrix[i][j]==false)
        {
            return;
        }
        path[i][j]=steps;
        if(i==2 && j==2)
        {
            for(int[] arr:path)
            {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        matrix[i][j]=false;

        if(i<matrix.length-1)
        {

            pathprint(matrix,p+'D',i+1,j,path,steps+1);
        }
        if(j<matrix[0].length-1)
        {
            pathprint(matrix,p+'R',i,j+1,path,steps+1);
        }
        if(i>0)
        {
            pathprint(matrix,p+'U',i-1,j,path,steps+1);
        }
        if(j>0)
        {
            pathprint(matrix,p+'L',i,j-1,path,steps+1);
        }
        matrix[i][j]=true;
        path[i][j]=0;


    }
}
