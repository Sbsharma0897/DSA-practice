
public class KthSmallest {

    public static void main(String[] args) {

           int n=4;
           int k=5;
           int x=5;
           x=Integer.parseInt(String.valueOf(x));
           char ans=search(n,k,"0",1);
        System.out.println(ans);
        }
        static char search(int n,int k,String p,int i)
        {
            if(i==n)
            {

                return p.charAt(k-1);
            }

            int temp=p.length();
            String result = "";
            for(int x=0;x<temp;x++)
            {

                if(p.charAt(x)=='0')
                {

                    result +="01";

                }
                else
                {
                    result +="10";

                }
            }
            return search(n,k,result,i+1);
        }

}
