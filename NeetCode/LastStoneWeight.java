public class LastStoneWeight {
    //https://leetcode.com/problems/last-stone-weight/

    //48
    //
    //
    //Min heap:
    //
    //PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
    //Max heap:
    //
    //PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(new Comparator<Integer>() {
    //    @Override
    //    public int compare(Integer o1, Integer o2) {
    //        return - Integer.compare(o1, o2);
    //    }
    //});
    class Solution {
        public int lastStoneWeight(int[] stones) {

            PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Comparator.reverseOrder());

            int n=stones.length;
            for(int i=0;i<n;i++)
            {
                maxHeap.add(stones[i]);
            }

            while(maxHeap.size()!=0)
            {
                if(maxHeap.size()==1)
                {
                    return maxHeap.peek();
                }
                int firstMax=maxHeap.poll();
                int secondMax=maxHeap.poll();
                if(firstMax!=secondMax)
                {
                    maxHeap.add(firstMax-secondMax);
                }



            }
            return 0;
        }
    }
}
