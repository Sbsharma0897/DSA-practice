import java.util.*;

public class FindAllPairdof4Sum {
    public static void main(String[] args) {
//https://practice.geeksforgeeks.org/problems/find-all-four-sum-numbers1732/1
        //Given an array of integers and another number. Find all the unique
        // quadruple from the given array that sums up to the given number.
    }
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        Arrays.sort(arr);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1]) {
                    continue;
                }

                int halfsum = arr[i] + arr[j];
                int rem = k - halfsum;

                int l = j + 1;
                int h = n - 1;
                while (l < h) {
                    if (arr[l] + arr[h] == rem) {
                        ArrayList<Integer> ans = new ArrayList<>(Arrays.asList(arr[i], arr[j], arr[l], arr[h]));

                        list.add(new ArrayList<>(ans));
                        while (l < h && arr[l] == arr[l + 1]) {
                            l++;
                        }
                        while (l < h && arr[h] == arr[h - 1]) {
                            h--;
                        }
                        l++;
                        h--;


                    } else if (arr[l] + arr[h] < rem) {
                        l++;
                    } else {
                        h--;
                    }
                }
            }

        }
        return list;
    }

        public ArrayList<ArrayList<Integer>> fourSumUsingSet(int[] arr, int k) {

            Arrays.sort(arr);

            ArrayList<ArrayList<Integer>> list=new ArrayList<>();
            HashSet<ArrayList<Integer>> set= new HashSet<>();

            int n=arr.length;

            for(int i=0;i<n;i++)
            {

                for(int j=i+1;j<n;j++)
                {


                    int halfsum=arr[i]+arr[j];
                    int rem=k-halfsum;

                    int l=j+1;
                    int h=n-1;
                    while(l<h)
                    {
                        if(arr[l]+arr[h]==rem)
                        {
                            ArrayList<Integer> ans=new ArrayList<>(Arrays.asList(arr[i],arr[j],arr[l],arr[h]));

                            set.add(new ArrayList<>(ans));

                            l++;
                            h--;


                        }
                        else if(arr[l]+arr[h]<rem)
                        {
                            l++;
                        }
                        else
                        {
                            h--;
                        }
                    }
                }

            }
            list.addAll(set);

            return list;
        }
}
