public class PalindromePartition {
    //https://www.youtube.com/watch?v=3jvWodd7ht0&list=PLot-Xpze53lfOdF3KwpMSFEyfE77zIwiP&index=28
}
class Solution {
    public List<List<String>> partition(String s) {

        List<List<String>> list=new ArrayList<>();
        List<String> output=new ArrayList<>();

        solve(s,output,list,0);
        return list;

    }
    public static void solve(String s,List<String> output,List<List<String>> list,int index)
    {
        if(s.isEmpty())
        {
            list.add(new ArrayList<>(output));
            return;
        }

        for(int i=1;i<=s.length();i++)
        {
            if(isPalin(s.substring(0,i)))
            {
                output.add(s.substring(0,i));
                solve(s.substring(i),output,list,index);
                output.remove(output.size()-1);

            }
        }
    }
    public static boolean isPalin(String s)
    {
        int i=0;
        int j=s.length()-1;

        while(i<=j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }






    class Solution {
        public List<List<String>> partition(String s) {
            List<List<String>> list=new ArrayList<>();
            List<String> ans=new ArrayList<>();
            int index=0;
            solve(s,list,ans,index,"");
            return list;

        }
        public static void solve(String s,List<List<String>> list,List<String> ans,int index,String present)
        {
            //System.out.println(ans+" "+present);
            if(index==s.length()-1)
            {
                present=present+s.charAt(index);
                if(Palin(present))
                {

                    ans.add(present);
                    list.add(new ArrayList<>(ans));
                    ans.remove(ans.size()-1);

                }
                return;


            }

            present=present+s.charAt(index);

            if(Palin(present))
            {

                ans.add(present);
                solve(s,list,ans,index+1,"");
                ans.remove(ans.size()-1);
            }
            solve(s,list,ans,index+1,present);


        }
        public static boolean Palin(String s)
        {
            int i=0;
            int j=s.length()-1;
            while(i<j)
            {
                if(s.charAt(i)!=s.charAt(j))
                {
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }
    }
