public class MultiplyStrings {
    class Solution {
        public String multiply(String num1, String num2) {

            int n1=num1.length();
            int n2=num2.length();
            int[] ans=new int[n1+n2];

            for(int i=n1-1;i>=0;i--)
            {
                for(int j=n2-1;j>=0;j--)
                {
                    int number=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                    int carry=number/10;
                    int quo=number%10;


                    ans[i+j+1]=ans[i+j+1]+number;
                    ans[i+j] +=ans[i+j+1]/10;
                    ans[i+j+1]=ans[i+j+1]%10;
                }
            }
            int i=0;
            while(i<ans.length && ans[i]==0)
            {
                i++;
            }
            StringBuilder res=new StringBuilder();
            for(int j=i;j<ans.length;j++)
            {
                res.append(ans[j]);
            }
            if(res.length()==0)
            {
                return "0";
            }
            return res.toString();

        }
    }
}
