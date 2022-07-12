public class LargestNumebr {
    static String string="4551711527";
    static String max=string;
    public static void main(String[] args) {
        int k=3;


        int index=0;
        solve(string,k,index);
        System.out.println(max);
    }

    static void solve(String string,int k,int index)
    {
        if(Long.parseLong(string)>Long.parseLong(max))
        {
            max=string;

        }

        if(k==0 )
        {
           return;

        }
        for (int i = index; i <string.length(); i++)
        {
            int maxelement=i;
            int j;
            for ( j = i+1; j < string.length(); j++)
            {
                //System.out.println(Integer.parseInt(String.valueOf(string.charAt(j)))>Integer.parseInt(String.valueOf(string.charAt(maxelement))));
                if(Integer.parseInt(String.valueOf(string.charAt(j)))>Integer.parseInt(String.valueOf(string.charAt(maxelement))))
                {
                    maxelement=j;
                }
            }

            char[] c = string.toCharArray();
            char temp = c[i];
            c[i] = c[maxelement];
            c[maxelement] = temp;

            String swappedString = new String(c);
            solve(swappedString,k-1,index+1);
        }
    }
}
