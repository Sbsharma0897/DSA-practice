package SlidingWindow;

public class LongestKUnqiueCharaters {
    public static void main(String[] args) {
   //https://practice.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1
    }
    public int longestkSubstr(String s, int k)
    {
        int maxlength=-1;
        HashMap<Character,Integer> map=new HashMap<>();
        char[] array=s.toCharArray();
        int n=array.length;
        int i=0;
        for(int j=0;j<n;j++)
        {
            char ch=array[j];
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
            }
            else
            {
                map.put(ch,1);
            }
            if(map.size()==k)
            {
                maxlength=Math.max(maxlength,j-i+1);
            }
            else if(map.size()>k)
            {
                while(map.size()>k)
                {
                    char c=array[i];
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
        }
        return maxlength;

    }
}
