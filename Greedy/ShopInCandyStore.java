public class ShopInCandyStore {
    public static void main(String[] args) {
   //Shop in Candy Store
        //In a candy store, there are N different types of candies available and the prices of all the N different types of candies are provided to you.
        //You are now provided with an attractive offer.
        //You can buy a single candy from the store and get at most K other candies ( all are different types ) for free.
        //Now you have to answer two questions. Firstly, you have to find what is the
        // minimum amount of money you have to spend to buy all the N different candies. Secondly, you have to find what is the maximum amount of money you have to spend to buy all the N different candies.
    }
    static ArrayList<Integer> candyStore(int candies[],int n,int K){
  //see below solutiion
        ArrayList<Integer> ans=new ArrayList<>();
        Arrays.sort(candies);
        int min=0;
        int max=0;
        int end=n;

        int i=0;
        while(i<end)
        {
            min +=candies[i];
            end=end-K;
            i++;
        }
        Integer[] dummy=new Integer[n];
        for(i=0;i<n;i++)
        {
            dummy[i]=candies[i];
        }
       // comparator works only on non primitive data types or Objects only;
        Arrays.sort(dummy, (a,b)->
        {
            if(a>b)
            {
                return -1;
            }
            else if(a<b)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        });

        end=n;

        i=0;
        while(i<end)
        {
            max +=dummy[i];
            end=end-K;
            i++;
        }
        ans.add(min);
        ans.add(max);
        return ans;

    }










    static ArrayList<Integer> candyStore(int candies[],int N,int K){
        ArrayList<Integer> ans=new ArrayList<>();
        int minamount=0;
        int maxamount=0;

        Arrays.sort(candies);
        ;
        int i=0;
        int end=N-1;
        while(i<=end)
        {
            minamount +=candies[i];
            i++;
            end=end-K;

        }

        i=N-1;
        int start=0;
        while(i>=start)
        {
            maxamount +=candies[i];
            i=i-1;
            start=start+K;
        }
        ans.add(minamount);
        ans.add(maxamount);
        return ans;
    }


}
