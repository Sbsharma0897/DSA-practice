public class MoveZeroes {
    //https://www.youtube.com/watch?v=aayNRwUN3Do&list=PLot-Xpze53lfQmTEztbgdp8ALEoydvnRQ&index=44


    int count = 0;  // Count of non-zero elements

    // Traverse the array. If element encountered is
    // non-zero, then replace the element at index 'count'
    // with this element
        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
    arr[count++] = arr[i]; // here count is
    // incremented

    // Now all non-zero elements have been shifted to
    // front and 'count' is set as index of first 0.
    // Make all elements 0 from count to end.
        while (count < n)
    arr[count++] = 0;




    public static void main(String[] args)
    {
        int[] A = { 5, 6, 0, 4, 6, 0, 9, 0, 8 };
        int n = A.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] != 0) {
                //   Swap - A[j] , A[i]
                swap(A, j, i); // Partitioning the array
                j++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " "); // Print the array
        }
    }
}
