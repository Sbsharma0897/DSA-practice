public class IsoMorphicStrings {
    public static void main(String[] args) {
        //https://leetcode.com/problems/isomorphic-strings/submissions/

        public boolean isIsomorphic(String s, String t) {

            if(s.length()!=t.length())
            {
                return false;
            }
            HashMap<Character,Character> map=new HashMap<>();
            for(int i=0;i<s.length();i++)
            {
                char c1=s.charAt(i);
                char c2=t.charAt(i);

                if(map.containsKey(c1))
                {
                    if(map.get(c1)!=c2)
                    {
                        return false;
                    }

                }
                else
                {
                    for(char key:map.keySet())
                    {
                        char value=map.get(key);
                        if(value==c2)
                        {
                            return false;
                        }
                    }

                    map.put(c1,c2);
                }
            }
            return true;

        }









        class Solution {
            public boolean isIsomorphic(String s, String t) {

                if(s.length()!=t.length())
                {
                    return false;
                }
                HashMap<Character,Character> map=new HashMap<>();
                for(int i=0;i<s.length();i++)
                {
                    char c1=s.charAt(i);
                    char c2=t.charAt(i);

                    if(map.containsKey(c1))
                    {
                        if(map.get(c1)!=c2)
                        {
                            return false;
                        }

                    }
                    else
                    {

                        map.put(c1,c2);
                    }
                }
                String d=s;
                s=t;
                t=d;
                map.clear();
                for(int i=0;i<s.length();i++)
                {
                    char c1=s.charAt(i);
                    char c2=t.charAt(i);

                    if(map.containsKey(c1))
                    {
                        if(map.get(c1)!=c2)
                        {
                            return false;
                        }

                    }
                    else
                    {

                        map.put(c1,c2);
                    }
                }
                return true;


            }
        }






        HashMap<Character, Character> charCount
                = new HashMap();
        char c = 'a';
        for (int i = 0; i < str1.length; i++) {
            if (charCount.containsKey(str1[i])) {
                c = charCount.get(str1[i]);
                if (c != str2[i])
                    return false;
            }
            else if (!charCount.containsValue(str2[i])) {
                charCount.put(str1[i], str2[i]);
            }
            else {
                return false;
            }
        }
        return true;
    }
    }
}
