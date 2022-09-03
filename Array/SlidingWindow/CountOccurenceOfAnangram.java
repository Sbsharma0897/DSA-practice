package SlidingWindow;

public class CountOccurenceOfAnangram {
    public static void main(String[] args) {
   //https://practice.geeksforgeeks.org/problems/count-occurences-of-anagrams5839/1
    }
    int search(String pat, String txt) {

        char pat1[]=pat.toCharArray();
        char txt1[]=txt.toCharArray();

        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:pat1)
        {
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
            }
            else
            {
                map.put(ch,1);
            }
        }
        int size =pat1.length;
        int count=map.size();
        int ans=0;

        int i=0;
        for(int j=0;j<txt1.length;j++)
        {
            char ch=txt1[j];
            if(map.containsKey(ch))
            {
                if(map.get(ch)==1)
                {
                    map.put(ch,0);
                    count--;
                }
                else
                {
                    map.put(ch,map.get(ch)-1);
                }

            }
            if(j-i+1>=size)
            {
                if(count==0)
                {
                    ans++;
                }
                if(map.containsKey(txt1[i]))
                {
                    if(map.get(txt1[i])==0)
                    {
                        map.put(txt1[i],1);
                        count++;
                    }
                    else
                    {
                        map.put(txt1[i],map.get(txt1[i])+1);
                    }

                }
                i++;
            }
        }
        return ans;

    }
}
