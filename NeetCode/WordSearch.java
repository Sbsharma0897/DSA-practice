public class WordSearch {
    public static void main(String[] args) {
        //https://leetcode.com/problems/word-search/submissions/
    }
    tc-n*m*4^(strig length)
    class Solution {
        public boolean exist(char[][] board, String word) {

            int m=board.length;
            int n=board[0].length;
            boolean[][] visited=new boolean[m][n];

            for(boolean[] array:visited)
            {
                Arrays.fill(array,false);
            }

            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(solve(board,visited,word,0,i,j,m,n))
                    {
                        return true;
                    }

                }
            }
            return false;


        }
        public static boolean solve(char[][] board,boolean[][] visited,String word,int index,int i,int j,int m,int n)
        {
            if(index==word.length())
            {
                return true;
            }
            if( i<0 || i>=m || j<0 || j>=n || board[i][j]!=word.charAt(index) || visited[i][j]==true)
            {
                return false;
            }
            visited[i][j]=true;
            if(solve(board,visited,word,index+1,i+1,j,m,n))
            {
                return true;
            }
            if(solve(board,visited,word,index+1,i-1,j,m,n))
            {
                return true;
            }
            if(solve(board,visited,word,index+1,i,j+1,m,n))
            {
                return true;
            }
            if(solve(board,visited,word,index+1,i,j-1,m,n))
            {
                return true;
            }
            visited[i][j]=false;
            return false;
        }
    }
}
