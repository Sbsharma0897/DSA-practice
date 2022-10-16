public class FirstIndexofFIrstOccurence {
    public static void main(String[] args) {
        //https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
    }
    class Solution {
        public int strStr(String haystack, String needle) {

            for(int i=0;i<=haystack.length()-needle.length();i++)
            {
                int k=0;

                for(int j=i;j<haystack.length();j++)
                {
                    if(k==needle.length())
                    {
                        break;
                    }
                    char c1=haystack.charAt(j);
                    char c2=needle.charAt(k);

                    if(c1!=c2)
                    {
                        break;
                    }
                    k++;

                }
                if(k==needle.length())
                {
                    return i;
                }
            }
            return -1;

        }
    }
}
