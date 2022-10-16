public class UniqueEmail {

    class Solution {
        public int numUniqueEmails(String[] emails) {

            HashSet<String> set=new HashSet<>();

            for(int i=0;i<emails.length;i++)
            {
                String string=emails[i];
                String first="";
                String second="";
                for(int j=0;j<string.length();j++)
                {
                    char ch=string.charAt(j);
                    if(ch=='@')
                    {
                        first=second;
                        second="";
                    }
                    else
                    {
                        second =second+ch;
                    }
                }
                String firstans="";
                for(int j=0;j<first.length();j++)
                {
                    char ch=first.charAt(j);
                    if(ch=='.')
                    {
                        continue;
                    }
                    else if(ch=='+')
                    {
                        break;
                    }
                    else
                    {
                        firstans=firstans+ch;
                    }
                }
                // System.out.println(firstans+second);
                set.add(firstans+'@'+second);
            }
            return set.size();

        }
    }






    class Solution {
        public int numUniqueEmails(String[] emails) {

            HashSet<String> set=new HashSet<>();

            for(int i=0;i<emails.length;i++)
            {
                String string=emails[i];

                String array[]=string.split("@");
                String array1[]=array[0].split("\\+");

                String first=array1[0].replace(".","");

                //System.out.println(first);
                set.add(first+"@"+array[1]);

            }
            return set.size();

        }
    }
}
