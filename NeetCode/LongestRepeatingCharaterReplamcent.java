public class LongestRepeatingCharaterReplamcent {
    //https://leetcode.com/problems/longest-repeating-character-replacement/submissions/
    class Solution {
        public int characterReplacement(String s, int k) {

            int[] array=new int[26];
            int maxCharCount=0;
            int maxlength=1;
            int i=0;
            int n=s.length();
            for(int j=0;j<n;j++)
            {

                char ch=s.charAt(j);
                array[ch-'A']++;
                maxCharCount=Math.max(maxCharCount,array[ch-'A']);

                while((j-i+1-maxCharCount)>k)
                {
                    char cl=s.charAt(i);
                    array[cl-'A']--;
                    i++;
                    for(int x=0;x<26;x++)
                    {
                        maxCharCount=Math.max(maxCharCount,array[x]);
                    }

                }
                maxlength=Math.max(maxlength,(j-i+1));
            }
            return maxlength;



        }
    }
}
