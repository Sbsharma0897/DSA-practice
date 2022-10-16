public class LengthofLastWord {
    public static void main(String[] args) {
        //https://leetcode.com/problems/length-of-last-word/
    }
    public int lengthOfLastWord(String s) {

        int n=s.length();
        int saved=0;
        int length=0;
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch==' ' && i>0 && s.charAt(i-1)!=' ')
            {
                saved=length;
                length=0;

            }
            else if(ch!=' ')
            {
                //System.out.println(i+" i "+saved+" saved ");
                length++;
            }

        }
        if(length!=0)
        {
            saved=length;
        }
        return saved;

    }






    class Solution {
        public int lengthOfLastWord(String s) {

            int n=s.length();
            int saved=0;
            int length=0;
            for(int i=n-1;i>=0;i--)
            {
                char ch=s.charAt(i);
                if(ch==' ')
                {
                    if(saved!=0)
                    {
                        return length;
                    }
                    else
                    {
                        length=0;
                    }

                }
                else
                {
                    length++;
                    saved++;
                }
            }
            return saved;


        }
    }
}
