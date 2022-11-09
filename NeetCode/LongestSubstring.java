public class LongestSubstring {
    class Solution {
        //https://leetcode.com/problems/longest-substring-without-repeating-characters/submissions/
        public int lengthOfLongestSubstring(String s) {
            int maxlength=0;

            HashMap<Character,Integer> map=new HashMap<>();
            int i=0;
            int n=s.length();
            for(int j=0;j<n;j++)
            {
                char ch=s.charAt(j);
                if(map.containsKey(ch))
                {
                    map.put(ch,map.get(ch)+1);
                }
                else
                {
                    map.put(ch,1);
                }

                if(map.size()==j-i+1)
                {
                    maxlength=Math.max(maxlength,(j-i+1));

                }
                else
                {
                    char c=s.charAt(i);

                    if(map.get(c)==1)
                    {
                        map.remove(c);
                    }
                    else
                    {
                        map.put(c,map.get(c)-1);
                    }
                    i++;
                }
            }
            return maxlength;


        }
    }
}
