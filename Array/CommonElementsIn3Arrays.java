import java.util.*;

public class CommonElementsIn3Arrays {
    public static void main(String[] args) {
  //https://practice.geeksforgeeks.org/problems/common-elements1132/1
        //Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.
        //Note: can you take care of the duplicates without using any additional Data Structure?
    }

    ArrayList<Integer> commonElementsMyApproach(int A[], int B[], int C[], int n1, int n2, int n3)
    {
        //time-O(n1+n2+n3)
        //spacce-O(n1+n2+n3)
        ArrayList<Integer> mid=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();

        int i=0;
        int j=0;
        while(i<n1 && j<n2)
        {
            if(A[i]==B[j])
            {
                if(i>0 && A[i-1]==A[i])
                {
                    i++;
                }
                else
                {
                    mid.add(A[i]);
                    i++;
                    j++;
                }

            }
            else if(A[i]<B[j] )
            {
                i++;
            }
            else
            {
                j++;
            }

        }

        i=0;
        j=0;
        while(i<n3 && j<mid.size())
        {
            if(C[i]==mid.get(j))
            {
                if(i>0 && C[i-1]==C[i])
                {
                    i++;
                }
                else
                {
                    ans.add(C[i]);
                    i++;
                    j++;
                }

            }
            else if(C[i]<mid.get(j))
            {
                i++;
            }
            else
            {
                j++;
            }

        }
        return ans;



    }

    void findCommon(int ar1[], int ar2[], int ar3[])
    {
        //time-O(n1+n2+n3)
        //spacce-O(1)

        // Initialize starting indexes for ar1[],
        // ar2[] and ar3[]
        int i = 0, j = 0, k = 0;
        int n1 = ar1.length;
        int n2 = ar2.length;
        int n3 = ar3.length;

        // Declare three variables prev1,
        // prev2, prev3 to track previous
        // element
        int prev1, prev2, prev3;

        // Initialize prev1, prev2,
        // prev3 with INT_MIN
        prev1 = prev2 = prev3 = Integer.MIN_VALUE;

        while (i < n1 && j < n2 && k < n3) {

            // If ar1[i] = prev1 and i < n1,
            // keep incrementing i
            while (i < n1 && ar1[i] == prev1)
                i++;

            // If ar2[j] = prev2 and j < n2,
            // keep incrementing j
            while (j < n2 && ar2[j] == prev2)
                j++;

            // If ar3[k] = prev3 and k < n3,
            // keep incrementing k
            while (k < n3 && ar3[k] == prev3)
                k++;

            if (i < n1 && j < n2 && k < n3) {

                // If x = y and y = z, print any of
                // them, update prev1 prev2, prev3
                // and move ahead in each array
                if (ar1[i] == ar2[j] && ar2[j] == ar3[k]) {
                    System.out.print(ar1[i] + " ");
                    prev1 = ar1[i];
                    prev2 = ar2[j];
                    prev3 = ar3[k];
                    i++;
                    j++;
                    k++;
                }

                // If x < y, update prev1
                // and increment i
                else if (ar1[i] < ar2[j]) {
                    prev1 = ar1[i];
                    i++;
                }

                // If y < z, update prev2
                // and increment j
                else if (ar2[j] < ar3[k]) {
                    prev2 = ar2[j];
                    j++;
                }

                // We reach here when x > y
                // and z < y, i.e., z is
                // smallest update prev3
                // and imcrement k
                else {
                    prev3 = ar3[k];
                    k++;
                }
            }
        }
    }

}
