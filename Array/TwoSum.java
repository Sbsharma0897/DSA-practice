import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        //Check for a pair in array with given target
  ///Here if we use two pointers the time complexiy is nlogn,
        //USing hashmap, time complexity comes down to n and space complexirt as n
    }
    static void printpairs(int arr[], int sum)
    {
        HashSet<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < arr.length; ++i)
        {
            int temp = sum - arr[i];

            // checking for condition
            if (s.contains(temp)) {
                System.out.println(
                        "Pair with given sum "
                                + sum + " is (" + arr[i]
                                + ", " + temp + ")");
            }
            s.add(arr[i]);
        }
    }
}
