package Apnikaksha;

public class Permutation {
    public static void main(String[] args) {
        String string="abc";
        permute(string,"");
    }
    static void permute(String string,String ans)
    {
        if(string.length()==0)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<string.length();i++)
        {
            String processed=ans+string.charAt(i);
            String remainder=string.substring(0,i)+string.substring(i+1);
            permute(remainder,processed);
        }
    }
}
