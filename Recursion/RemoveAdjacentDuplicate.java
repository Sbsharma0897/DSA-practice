import java.util.HashMap;

public class RemoveAdjacentDuplicate {
    public static void main(String[] args) {

        String s="abccbccba";
        String ans="";
        while(ans.length()!=s.length())
        {
            ans=s;
            s=solve(ans);
        }
        System.out.println(ans);
    }

    static String solve(String s)
    {
       int n=s.length();
       String ans="";
       int i=0;
       while(i<n)
       {
           if(i<n-1 && s.charAt(i)==s.charAt(i+1))
           {
               char ch=s.charAt(i);
               while(i<n && s.charAt(i)==ch)
               {
                  i++;
               }

           }
           else
           {
               ans +=s.charAt(i);
               i++;
           }

       }
       return ans;
    }
}
