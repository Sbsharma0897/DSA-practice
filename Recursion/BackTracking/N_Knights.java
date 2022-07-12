package BackTracking;

public class N_Knights {
    public static void main(String[] args) {
        int n=4;
        int[][] matrix=new int[n][n];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                matrix[i][j]=0;
            }
        }
        System.out.println(findingcases(matrix,0,0,n));
    }
    static void display(int[][] matrix)
    {
        int n=matrix.length;
        for(int row=0;row<n;row++)
        {
            for (int col = 0; col < n; col++)
            {
                if(matrix[row][col]==1)
                {
                    System.out.print("K ");
                }
                else
                {
                    System.out.print("X ");
                }
            }
            System.out.println( );
        }
        System.out.println("---------------");
    }
    static int findingcases(int[][] matrix,int i,int j,int n)
    {
        if(n==0)
        {
            display(matrix);

            return 1;
        }
        if(i>= matrix.length || j>= matrix.length)
        {
            return 0;
        }


        int count=0;
        for (int col = j; col < matrix.length; col++)
        {
          if(isSafe(matrix,i,col))
          {
              matrix[i][col]=1;
              if(col==matrix.length-1)
              {
                  count +=findingcases(matrix,i+1,0,n-1) ;
              }
              else
              {
                  count +=findingcases(matrix,i,col+1,n-1);
              }

              matrix[i][col]=0;
          }
        }
        count +=findingcases(matrix,i+1,0,n) ;
        return count;


    }
    static boolean isSafe(int[][] matrix,int i,int j)
    {
        if(i-2>=0 && j-1>=0 && matrix[i-2][j-1]==1)
        {
            return false;
        }
        if(i-2>=0 && j+1<matrix.length && matrix[i-2][j+1]==1)
        {
            return false;
        }
        if(i-1>=0 && j-2>=0 && matrix[i-1][j-2]==1)
        {
            return false;
        }
        if(i-1>=0 && j+2< matrix.length && matrix[i-1][j+2]==1)
        {
            return false;
        }
        return true;
    }
}
