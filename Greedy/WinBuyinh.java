public class WinBuyinh {
    public static void main(String[] args) {
  //https://practice.geeksforgeeks.org/problems/wine-buying-and-selling/1?utm_source=youtube&utm_
        // medium=collab_anujbhaiya_description&utm_campaign=wine-buying-and-selling
        //Given an array, arr[] of size N represents N house built along a straight line with equal
        // distance between adjacent houses. Each house has a certain number of wine and they want
        // to buy/sell those wines to other houses. Transporting one bottle of wine from one house
        // to an adjacent house results in one unit of work. The task is to find the minimum number
        // of work is required to fulfill all the demands of those N houses.
    }
    int wineSellingBETTER(int A[],int N){
        int buy=0;
        int sell=0;
        int count=0;
        while(buy<N && sell<N)
        {
            while(A[buy]<=0)
            {
                buy++;
                if(buy==N)
                {
                    return count;
                }
            }
            while(A[sell]>=0)
            {
                sell++;
                if(buy==N)
                {
                    return count;
                }
            }
            if(Math.abs(A[buy])>=Math.abs(A[sell]))
            {
                count +=Math.abs(A[sell]*Math.abs(buy-sell));
                A[buy]=A[buy]+A[sell];
                A[sell]=0;
            }
            else
            {
                count +=Math.abs(A[buy]*Math.abs(buy-sell));
                A[sell]=A[sell]+A[buy];
                A[buy]=0;
            }

        }
        return count;

    }

    int wineSelling(int A[],int N){
        int buy=0;
        int sell=0;
        int count=0;
        while(buy<N && sell<N)
        {
            if(A[buy]>0 && A[sell]<0)
            {

                if(A[buy]>=-A[sell])
                {
                    A[buy]=A[buy]+A[sell];
                    count += (-A[sell]*Math.abs(buy-sell));

                    A[sell]=0;

                    sell++;
                }
                else if(A[buy]<-A[sell])
                {
                    count += (A[buy]*Math.abs(buy-sell));

                    A[sell]=A[sell]+A[buy];
                    A[buy]=0;
                    buy++;
                }


            }
            else if(A[buy]<=0)
            {
                buy++;

            }
            else if(A[sell]>=0)
            {

                sell++;
            }
        }
        return count;
}
