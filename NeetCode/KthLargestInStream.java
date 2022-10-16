public class KthLargestInStream {
    public static void main(String[] args) {
        //https://leetcode.com/problems/kth-largest-element-in-a-stream/submissions/
        class KthLargest {

            int k;
            PriorityQueue<Integer> heap=new PriorityQueue<>();
            public KthLargest(int k, int[] nums) {
                this.k=k;
                for(int i=0;i<nums.length;i++)
                {
                    heap.add(nums[i]);
                }
                while(heap.size()>k)
                {
                    heap.remove();
                }
            }

            public int add(int val) {

                heap.add(val);
                if(heap.size()>k)
                {
                    heap.remove();
                }

                return heap.peek();

            }
        }

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
    }
}





    PriorityQueue<Integer> pq
            = new PriorityQueue<>((a, b) -> a - b);

// Iterating through each element
        for (int i = 0; i < n; i++) {

        // If size of priority
        // queue is less than k
        if (pq.size() < k)
        pq.add(arr[i]);
        else {
        if (arr[i] > pq.peek()) {
        pq.remove();
        pq.add(arr[i]);
        }
        }

        // If size is less than k
        if (pq.size() < k)
        ans[i] = -1;
        else
        ans[i] = pq.peek();
        }

        return ans;
