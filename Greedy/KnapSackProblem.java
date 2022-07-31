import java.util.*;

public class KnapSackProblem {
    public static void main(String[] args) {
   //https://www.geeksforgeeks.org/fractional-knapsack-problem/
      //Given weights and values of N items, we need to put these items in a knapsack of capacity W to get the maximum total value in the knapsack.
        //Note: Unlike 0/1 knapsack, you are allowed to break the item.


    }

    class Item {
        int value, weight;
        Item(int x, int y){
            this.value = x;
            this.weight = y;
        }
    }
    double fractionalKnapsack(int W, Item arr[], int n)
    {
        //Here we have been given a class with value and weight, if this is not given we can create our own
        //class and put value,weright, and ratio in it and sort it based on comparator
        Arrays.sort(arr,new Comparator<Item>()
        {
            public int compare(Item a, Item b)
            {
                double a1= ((double)a.value/a.weight);
                double b1= ((double)b.value/b.weight);

                if(a1>b1)
                {
                    return -1;
                }
                else if(a1<b1)
                {
                    return 1;
                }
                else

                {
                    return 0;
                }
            }
        });

        double ans=0;
        for(Item item:arr)
        {
            if(W>=item.weight)
            {
                ans=ans+(item.value);
                W=W-item.weight;
            }
            else

            {
                ans=ans+(((double)item.value/item.weight)*W);
                W=0;
                break;
            }
        }
        return ans;
    }
}
