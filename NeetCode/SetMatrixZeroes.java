public class SetMatrixZeroes {
    public static void main(String[] args) {
        class Solution {
            public void setZeroes(int[][] matrix) {

                int m=matrix.length;
                int n=matrix[0].length;
                int row=-1;
                int col=-1;
                for(int i=0;i<m;i++)
                {

                    for(int j=0;j<n;j++)
                    {

                        if(matrix[i][j]==0)
                        {
                            if(i==0)
                            {
                                row=0;
                                matrix[0][j]=0;
                            }
                            else
                            {
                                matrix[i][0]=0;
                                matrix[0][j]=0;
                            }

                        }
                    }
                }

                for(int i=1;i<m;i++)
                {
                    if(matrix[i][0]==0)
                    {
                        for(int j=0;j<n;j++)
                        {
                            matrix[i][j]=0;
                        }
                    }

                }
                for(int i=0;i<n;i++)
                {
                    if(matrix[0][i]==0)
                    {
                        for(int j=0;j<m;j++)
                        {
                            matrix[j][i]=0;
                        }
                    }

                }
                if(row==0)
                {
                    for(int i=0;i<n;i++)
                    {
                        matrix[0][i]=0;
                    }
                }




            }

        }
    }
}
