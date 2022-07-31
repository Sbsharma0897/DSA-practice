import java.util.*;

public class JobScheduling {
    public static void main(String[] args) {
  //https://practice.geeksforgeeks.org/problems/job-sequencing-problem-1587115620/1

    }
    class Job {
        int id, profit, deadline;
        Job(int x, int y, int z){
            this.id = x;
            this.deadline = y;
            this.profit = z;
        }
    }
    int[] JobScheduling(Job arr[], int n)
    {
        Arrays.sort(arr,new Comparator<Job>()
        {
            public int compare(Job a, Job b)
            {

                if(a.profit>b.profit)
                {
                    return -1;
                }
                else  if(a.profit<b.profit)
                {
                    return 1;
                }
                else

                {
                    return 0;
                }
            }
        });

        int max=0;
        for(Job el:arr)
        {
            int temp=el.deadline;
            if(temp>max)
            {
                max=temp;
            }
        }
        boolean visited[] =new boolean[max+1];

        int jobs=0;
        int maxprofit=0;

        for(Job job:arr)
        {
            int index=job.deadline;
            while(index>0)
            {
                if(visited[index]==false)
                {
                    jobs++;
                    maxprofit +=job.profit;
                    visited[index]=true;
                    break;
                }
                else
                {
                    index--;
                }
            }

        }

        int[] ans=new int[2];
        ans[0]=(jobs);
        ans[1]=(maxprofit);
        return ans;
    }
}
