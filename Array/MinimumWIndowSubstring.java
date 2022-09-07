public class MinimumWIndowSubstring {
    public static void main(String[] args) {
    //https://practice.geeksforgeeks.org/problems/smallest-window-in-a-string-containing-all-the-characters-of-another-string-1587115621/1
    }
    public static String smallestWindow(String s, String p)
    {
        char[] array1=s.toCharArray();
        char[] array2=p.toCharArray();

        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<array2.length;i++)
        {
            char ch=array2[i];
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
            }
            else
            {
                map.put(ch,1);
            }
        }
        int count=map.size();
        int minlength=Integer.MAX_VALUE;
        int mini=0;
        int minj=0;


        int i=0;

        for(int j=0;j<array1.length;j++)
        {
            char ch=array1[j];
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
            if(count==0)
            {
                //System.out.println(count);
                if(j-i+1<minlength)
                {
                    minlength=j-i+1;
                    mini=i;
                    minj=j;
                }

                while(count==0)
                {
                    char c=array1[i];
                    i++;
                    if(map.containsKey(c))
                    {

                        if(map.get(c)==0)
                        {
                            map.put(c,1);
                            count++;
                            break;
                        }
                        else
                        {
                            map.put(c,map.get(c)+1);

                        }
                    }

                    if(j-i+1<minlength)
                    {
                        minlength=j-i+1;
                        mini=i;
                        minj=j;
                    }
                }
            }

        }
        if(minlength==Integer.MAX_VALUE)
        {
            return "-1";
        }
        else
        {
            String bag="";
            for(int z=mini;z<=minj;z++)
            {
                bag=bag+array1[z];
            }
            return bag;
        }
    }
}
