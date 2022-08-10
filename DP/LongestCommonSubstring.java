public class LongestCommonSubstring {
    public static void main(String[] args) {
   //https://practice.geeksforgeeks.org/problems/longest-common-substring1452/1

    }
    int longestCommonSubstr(String virat, String rohit, int n1, int n2){
//Recursion

        int count=0;
        return SimilarText(virat,rohit,n1,n2,dp,count);
    }

    static int SimilarText(String virat,String rohit,int n1,int n2,int count)
    {
        if(n1==0 || n2==0)
        {
            return count;
        }

        if(virat.charAt(n1-1)==rohit.charAt(n2-1))
        {
            count=SimilarText(virat,rohit,n1-1,n2-1,dp,count+1);

        }
        int a=SimilarText(virat,rohit,n1-1,n2,dp,0);
        int b=SimilarText(virat,rohit,n1,n2-1,dp,0);

        return Math.max(count,Math.max(a,b));

    }
}
