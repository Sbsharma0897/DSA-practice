package Apnikaksha;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int n=3;
        tower(n,"S","H","D");

    }
    static void tower(int n,String src,String helper,String dest)
    {
      if(n==1)
      {
          System.out.println("trandfer disk"+n +"from"+src+"t0"+dest);
          return ;
      }
      tower(n-1,src,dest,helper);
        System.out.println("trandfer disk"+n +"from"+src+"t0"+dest);
        tower(n-1,helper,src,dest);
    }

}

