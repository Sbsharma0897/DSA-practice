package Apnikaksha;

public class PlaceTiles {
    public static void main(String[] args) {
        int n=2;
       int m=2;
       int width=m;
        System.out.println(tileNumbers(n,m,width));
    }
    static int tileNumbers(int n,int m,int width)
    {
        if(n<0 || m<0)
        {
            return 0;
        }
        if(n==0 && m==m)
        {
            return 1;
        }

        int count=0;
        count=tileNumbers(n-1,m,width)+tileNumbers(n-width,m ,width);


        return count;




    }
}
