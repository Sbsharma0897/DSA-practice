public class MinimumFlipstoMakeAlternation {
    //https://leetcode.com/problems/minimum-number-of-flips-to-make-the-binary-string-alternating/
    class Solution {
        public int minFlips(String s) {

            int n=s.length();
            s =s+s;

            int[] one=new int[2*n];
            int[] two=new int[2*n];
            for(int i=0;i<2*n;i++)
            {
                if(i%2==0)
                {
                    one[i]=0;
                    two[i]=1;
                }
                else
                {
                    one[i]=1;
                    two[i]=0;
                }
            }

            int min=Integer.MAX_VALUE;
            int count1=0;
            int count2=0;
            int i=0;

            for(int j=0;j<2*n;j++)
            {
                int a=(s.charAt(j)-'0');
                int b=one[j];
                int c=two[j];
                if(a!=b)
                {

                    count1++;
                }
                if(a!=c)
                {
                    count2++;
                }

                if(j>=n-1)
                {
                    min=Math.min(min,Math.min(count1,count2));
                    //System.out.println(count1+" "+count2+" "+min);
                    //System.out.println(one);
                    int a1=(s.charAt(i)-'0');
                    int b1=one[i];
                    int c1=two[i];

                    if(a1!=b1)
                    {
                        count1--;
                    }
                    if(a1!=c1)
                    {
                        count2--;
                    }
                    i++;

                }
            }
            return min;
        }
    }

}
