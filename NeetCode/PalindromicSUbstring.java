public class PalindromicSUbstring {
    public static void main(String[] args) {
        //https://leetcode.com/problems/palindromic-substrings/
    }
    class Solution {
        public int countSubstrings(String s) {

            int n=s.length();
            int count=0;
            for(int i=0;i<n;i++)
            {
                count += helper(s,i,i);
                count += helper(s,i,i+1);
            }
            return count;

        }
        public static int helper(String s,int i,int j)
        {
            int count=0;

            while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j))
            {
                count++;
                i--;
                j++;
            }
            return count;

        }
    }
}
