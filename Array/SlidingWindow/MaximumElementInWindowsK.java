package SlidingWindow;

public class MaximumElementInWindowsK {
    public static void main(String[] args) {
    //https://practice.geeksforgeeks.org/problems/deee0e8cf9910e7219f663c18d6d640ea0b87f87/1
    }

    ArrayList<Integer> ans=new ArrayList<>();
    ArrayList<Integer> res=new ArrayList<>();

    int i=0;
       for(int j=0;j<n;j++)
    {
        while(ans.size()>0 && ans.get(ans.size()-1)<arr[j])
        {
            ans.remove(ans.size()-1);
        }
        ans.add(arr[j]);

        if(j-i+1>=k)
        {
            res.add(ans.get(0));
            if(ans.get(0)==arr[i])
            {
                ans.remove(0);
            }
            i++;
        }
    }
       return res;
}










    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {

       //Time Complexity: O(N * Log K), Insertion, deletion and search takes log k time in a AVL tree. So the overall time Complexity is O(N * log K)
        //Auxiliary Space: O(K), The space required to store k elements in a BST is O(k).
        PriorityQueue<Integer> ans=new PriorityQueue<>(Collections.reverseOrder());

        ArrayList<Integer> res=new ArrayList<>();

        int i=0;
        for(int j=0;j<n;j++)
        {
            ans.add(arr[j]);

            if(j-i+1>=k)
            {
                res.add(ans.peek());
                ans.remove(arr[i]);
                i++;
            }
        }
        return res;
    }
}
