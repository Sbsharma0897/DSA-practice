package BackTracking;

public class Maze {
    public static void main(String[] args) {
       int i=0;
       int j=0;

//        System.out.println(count(i,j));
        System.out.println(countpath("",i,j) );
    }
    static int count(int i,int j)
    {
        if(i==2 || j==2 )
        {
            return 1;
        }
        return count(i+1,j)+count(i,j+1);

    }

    static int countpath(String p,int i,int j)
    {
        if(i==2 && j==2)
        {
            System.out.println(p);

            return 1;
        }
        int count=0;
        if(i<2)
       {
           count=count+countpath(p+'D',i+1,j);
       }
        if(j<2)
        {
            count=count+countpath(p+'R',i,j+1);
        }
        return count;

    }
}
