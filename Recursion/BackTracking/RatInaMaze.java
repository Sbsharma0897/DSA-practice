package BackTracking;

public class RatInaMaze {
    public static void main(String[] args) {
        int[][] maze=
                {
                        {1,0,0,0},
                        {1,1,0,0},
                        {1,1,0,0},
                        {0,1,1,1}
                };
        int[][] visited={
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0}
        };
        findingpath(maze,visited,0,0,"");
        findingpathFuncall(maze,visited,0,0,"");

    }
    static void findingpath(int[][] maze,int[][] visited,int i,int j,String p)
    {
        if(maze[i][j] == 0 || (visited[i][j] == 1))
        {
            return;
        }
        if(i==3 && j==3)
        {
            System.out.println(p);
            return;
        }
        visited[i][j]=1;
        if(i<maze.length-1)
        {
            findingpath(maze,visited,i+1,j,p+'D');
        }
        if(j>0)
        {
            findingpath(maze,visited,i,j-1,p+'L');
        }
        if(j<maze[0].length-1)
        {
            findingpath(maze,visited,i,j+1,p+'R');
        }
        if(i>0)
        {
            findingpath(maze,visited,i-1,j,p+'U');
        }
        visited[i][j]=0;
    }

    static void findingpathFuncall(int[][] maze,int[][] visited,int i,int j,String p)
    {

        if(i==3 && j==3)
        {
            System.out.println(p);
            return;
        }
        visited[i][j]=1;
        if(isPath(maze,visited,i+1,j))
        {
            findingpath(maze,visited,i+1,j,p+'D');
        }
        if(isPath(maze,visited,i,j-1))
        {
            findingpath(maze,visited,i,j-1,p+'L');
        }
        if(isPath(maze,visited,i,j+1))
        {
            findingpath(maze,visited,i,j+1,p+'R');
        }
        if(isPath(maze,visited,i-1,j))
        {
            findingpath(maze,visited,i-1,j,p+'U');
        }

        visited[i][j]=0;
    }

    static boolean isPath(int[][] maze,int[][] visited,int i,int j)
    {
        if((i>=0 && i<=maze.length-1) && (j>=0 && i<=maze[0].length-1) && visited[i][j]==0 && maze[i][j]==1)
        {
            return true;
        }
        return false;
    }
}
