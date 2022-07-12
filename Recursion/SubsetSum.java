public class SubsetSum {

    public static void main(String[] args) {
        String string="123";
        System.out.println(subsequence("",string));


    }
    static int subsequence(String ans,String string)
    {

        if(string.isEmpty())
        {

            if(ans.length()==1)
            {
                return (int)ans.charAt(0);
            }
            else
            {
                subsequence("",ans);
            }
        }
        char ch=string.charAt(0);
        int left=subsequence(ans+ch,string.substring(1));
        int right=subsequence(ans,string.substring(1));
        return left+right;
    }
}

