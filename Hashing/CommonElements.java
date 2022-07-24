package Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class CommonElements {
    public static void main(String[] args) {
        int[] array1={1,1,2,2,2,3,4,5,6,6};
        int[] array2={5,6,7,5,5,5,6,1,2,3,1,3,4,};
        ArrayList<Integer> ans=new ArrayList<>();

        HashSet<Integer> set1=new HashSet<>();
        for (int i = 0; i < array1.length; i++) {
            set1.add(array1[i]);
        }
        for (int i = 0; i < array2.length; i++) {
           if(set1.contains(array2[i]))
           {
               ans.add(array2[i]);
               set1.remove(array2[i]);
           }
        }
        System.out.println(ans);

    }
}
