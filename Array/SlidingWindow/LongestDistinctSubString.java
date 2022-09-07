package SlidingWindow;

public class LongestDistinctSubString {
    public static void main(String[] args) {
   //https://practice.geeksforgeeks.org/problems/longest-distinct-characters-in-string5848/1
    }
    static int longestSubstrDistinctChars(String S){
        HashMap<Character,Integer> map=new HashMap<>();
        int length=S.length();
        int i=0;
        int j;
        int maxlength=-1;
        for(j=0;j<length;j++)
        {
            char ch=S.charAt(j);
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
            }
            else
            {
                map.put(ch,1);
            }

            if(map.size()==(j-i+1))
            {
                int x=j-i+1;
                if(x>maxlength)
                {
                    maxlength=x;
                }
            }
            else  if(map.size()>(j-i+1))
            {
                while(map.size()!=(j-i+1))
                {
                    ch=S.charAt(i);
                    if(map.get(ch)==1)
                    {
                        map.remove(ch);
                    }
                    else
                    {
                        map.put(ch,map.get(ch)-1);
                    }
                    i++;
                }
                int x=j-i+1;
                if(x>maxlength)
                {
                    maxlength=x;
                }

            }
        }
        return maxlength;
    }






    static int longestSubstrDistinctChars(String S){

        int maxlength=-1;
        HashMap<Character,Integer> map=new HashMap<>();

        char[] array=S.toCharArray();
        int n=array.length;
        int i=0;
        int j=0;
        for(j=0;j<n;j++)
        {
            if(map.containsKey(array[j]))
            {
                i=Math.max(i,map.get(array[j])+1);
            }
            map.put(array[j],j);
            maxlength=Math.max(maxlength,(j-i+1));
        }
        return maxlength;

    }
}
