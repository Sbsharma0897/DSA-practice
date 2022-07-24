import java.util.*;

public class SumOf3Elements {
    public static void main(String[] args) {
        //https://leetcode.com/problems/3sum/submissions/
        //Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
        // such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        HashSet<ArrayList<Integer>> set = new HashSet<>();

        List<List<Integer>> list = new ArrayList<>();


        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int rem = 0 - nums[i];
            int l = i + 1;
            int h = n - 1;
            while (l < h) {
                if (nums[l] + nums[h] == rem) {
                    ArrayList<Integer> ans = new ArrayList<>(Arrays.asList(nums[i], nums[l], nums[h]));
                    set.add(new ArrayList<>(ans));
                    l++;
                    h--;

                } else if (nums[l] + nums[h] > rem) {
                    h--;
                } else {
                    l++;
                }
            }
        }
        list.addAll(set);
        return list;
    }


    static boolean find3Numbers(int A[],
                                int arr_size, int sum) {
        // Fix the first element as A[i]
        for (int i = 0; i < arr_size - 2; i++) {

            // Find pair in subarray A[i+1..n-1]
            // with sum equal to sum - A[i]
            HashSet<Integer> s = new HashSet<Integer>();
            int curr_sum = sum - A[i];
            for (int j = i + 1; j < arr_size; j++) {
                if (s.contains(curr_sum - A[j])) {
                    //System.out.printf("//Triplet is %d,
                    //%d, %d", A[i],
                    //A[j], curr_sum - A[j]);
                    return true;
                }
                s.add(A[j]);
            }
        }

        // If we reach here, then no triplet was found
        return false;
    }
}
