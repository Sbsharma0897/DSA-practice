public class MaximumStocks {
    public static void main(String[] args) {
     //Buy Maximum Stocks if i stocks can be bought on i-th day
        //In a stock market, there is a product with its infinite stocks. The stock prices are given for N days, where price[i] denotes the price of the stock on the ith day.
        //There is a rule that a customer can buy at most i stock on the ith day.
    }
    public static int buyMaximumProducts(int n, int k, int[] price) {

        int[][] matrix=new int[n][2];

        for(int i=0;i<n;i++)
        {
            matrix[i][0]=price[i];
            matrix[i][1]=i+1;
        }

        Arrays.sort(matrix,(a,b)->
        {
            if(a[0]>b[0])
            {
                return 1;
            }
            else  if(a[0]<b[0])
            {
                return -1;
            }
            else
            {
                return 0;
            }
        });

        int count=0;
        for(int i=0;i<n;i++)
        {
//            if(k>=matrix[i][0]);
//            {
//                //System.out.println(matrix[i][0]*matrix[i][1]);
//                if(matrix[i][0]*matrix[i][1]<=k)
//                {
//                    count= count+matrix[i][1];
//                    k=k-matrix[i][0]*matrix[i][1];
//                }
//                else
//                {
//
//                    int temp=k/matrix[i][0];
//                    count=count+(temp);
//                    //System.out.println(k+ " " +matrix[i][0]+" "+temp+" "+count);
//                    k=0;
//                    break;
//                }
//            }
            //Now, we will traverse along the sorted list of pairs, and start buying as follows:
            //Let say, we have R rs remaining till now, and the cost of product on this day be C, and we can buy atmost L products on this day then,
            //total purchase on this day (P) = min(L, R/C)
            //Now, add this value to the answer
            //total_purchase = total_purchase + P, where P =min(L, R/C)
            //Now, subtract the cost of buying P items from remaining money, R = R – P*C.
            //Total number of products that we can buy is equal to total_purchase.
            ans += Math.min(arr[i].second,
                    K / arr[i].first);
            K -= arr[i].first
                    * Math.min(arr[i].second,
                    K / arr[i].first);
        }
        return count;

    }
}
