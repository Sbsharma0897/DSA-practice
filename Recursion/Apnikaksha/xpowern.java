package Apnikaksha;

public class xpowern {
    public static void main(String[] args) {

        int n=6;
        int x=2;
        System.out.println(calcPower(x,n));
    }

    static int  calcPower(int x,int n)
    {
        if(x==0)
        {
          return 0;
        }
        if(n==0)
        {
            return 1  ;
        }
        if(n%2==0)
        {
            int returnanswer= calcPower(x,n/2);
            return returnanswer*returnanswer;
        }
        else
        {
            int returnanswer= calcPower(x,n/2);
            return returnanswer*returnanswer *x;
        }
    }
}
