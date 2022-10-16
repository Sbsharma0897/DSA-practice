public class BestTimetoBuySellStock {
    public static void main(String[] args) {
        //https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
        public int maxProfit(int[] prices) {
            int n=prices.length;
            int buy=0;
            int sell=1;
            int maxProfit=0;
            while(sell<n)
            {
                if(prices[sell]<=prices[buy])
                {
                    buy=sell;
                    sell++;
                }
                else
                {
                    maxProfit=Math.max(maxProfit,prices[sell]-prices[buy]);
                    sell++;
                }
                // System.out.println(maxProfit+" "+ buy+" "+sell);
            }

            return maxProfit;

        }
    }
}
