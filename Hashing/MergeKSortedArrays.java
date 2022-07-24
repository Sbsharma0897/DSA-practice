package Hashing;


import java.util.Arrays;
import java.util.*;

public class MergeKSortedArrays {

    public static class Pair implements Comparable<Pair>
    { // This class is made for making pair which is used during heap process;
        int val;
        int index;
        int pos;

        public Pair(int val, int index, int pos) {
            this.val = val;
            this.index = index;
            this.pos = pos;
        }

        public int compareTo(Pair other)
        {
            return this.val-other.val;
        }
    }
    public static void main(String[] args) {
        int arr[][] =  {{2, 6, 12, 34},
                {1, 9, 20, 1000},
                {23, 34, 90, 2000}};
        int n=arr[0].length;
        int k=arr.length;
//        int[] ans=mergeKArrays(arr,0,k-1,n);
//        System.out.println(Arrays.toString(ans));
        System.out.println(mergeKArraysHEAP(arr,k));
    }

    public static ArrayList<Integer> mergeKArraysHEAP(int[][] arr,int K)
    {
        //THIS METHOD USES MIN HEAP
        //Time Complexity
        //:O( n * k * log k), Insertion and deletion in a
       // Min Heap requires log k time. So the Overall time complexity is O( n * k * log k)
        //Space Complexity :O(k), If Output is not stored then the
        // space required is the Min-Heap of k elements. So space Complexity is O(k).
        int n=arr[0].length;
       ArrayList<Integer> ans=new ArrayList<>();
      PriorityQueue<Pair> heap=new PriorityQueue<>();

        for (int i = 0; i < K; i++)
        {
            int val=arr[i][0];
            int index=0;
            int pos=i;
            Pair p1=new Pair(val,index,pos);
            heap.add(p1);
        }

        while(heap.size()>0)
        {
            Pair p=heap.remove();
            ans.add(p.val);
            int index=p.index;
            index++;

            if(index<arr[p.pos].length)
            {
                p.val=arr[p.pos][index];
                p.index=index;
                heap.add(p);
            }
        }
        return ans;

    }
    static int[] mergeKArrays(int[][] arr,int i,int j,int n)
    {
        //THIS METHOD USES RECURSION
        //Time Complexity
        //Time Complexity: O( n * k * log k).
       // There are log k levels as in each level the k arrays
        // are divided in half and at each level the k arrays are traversed.
        // So time Complexity is O( n * k ).
           // Space Complexity: O( n * k * log k).
           // In each level O( n*k ) space is required So Space Complexity is O( n * k * log k).
        if(i>j)
        {
            return null;
        }
        if(i==j)
        {
            int[] output=new int[n];
            for (int p = 0; p < n; p++)
            {
              output[p]=arr[i][p];

            }
            return output;

        }

        int mid=(i+j)/2;
        int[] out1=mergeKArrays(arr,i,mid,n);
        int[] out2=mergeKArrays(arr,mid+1,j,n);

        int[] ans=merge(out1,out2);

        return ans;
    }
    static int[] merge(int[] out1,int[] out2)
    {
        int i=0;
        int j=0;
        int n1=out1.length;
        int n2=out2.length;

        int[] ans=new int[n1+n2];
        int k=0;

        while(i<n1 && j<n2){
            if(out1[i]<=out2[j]){
                ans[k] = out1[i];
                i++;
                k++;
            }
            else{
                ans[k] = out2[j];
                j++;
                k++;
            }

        }
        while(i<n1){
            ans[k++] = out1[i++];
        }
        while(j<n2){
            ans[k++] = out2[j++];
        }
        return ans;
    }
}
