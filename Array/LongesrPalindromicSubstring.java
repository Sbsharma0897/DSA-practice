public class LongesrPalindromicSubstring {
    public static void main(String[] args) {
        public static int solve(String string)
        {
            int n=string.length();
            int longest=1;
            int current=1;
            int left=0;
            int right=0;
            //odd
            for(int i=0;i<n;i++)
            {
                left=i-1;
                right=i+1;
                current=1;

                while(left>=0 && right<=n-1)
                {
                    if(string.charAt(left)==string.charAt(right))
                    {
                        current=current+2;
                        longest=Math.max(longest,current);
                        left--;
                        right++;
                    }
                    else
                    {
                        break;
                    }
                }

            }

            //even
            for(int i=0;i<n-1;i++)
            {
                left=i;
                right=i+1;
                current=0;

                while(left>=0 && right<=n-1)
                {
                    if(string.charAt(left)==string.charAt(right))
                    {
                        current=current+2;
                        longest=Math.max(longest,current);
                        left--;
                        right++;
                    }
                    else
                    {
                        break;
                    }
                }

            }
            return longest;
        }
    }
}
