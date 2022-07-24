import java.util.Arrays;

public class ReversingSubArrayMakeSorted {
    public static void main(String[] args) {
        int[] array = {1, 2, 3,4,5};
        System.out.println(findReverse(array));


    }
    static boolean findReverse(int[] array)
    {
        int[] temp= Arrays.copyOf(array,array.length);
       Arrays.sort(temp);
        //System.out.println(Arrays.toString(temp));
       int i=0;
       int j=0;
       for(int k=0;k<array.length;k++)
       {
           if(array[k]!=temp[k])
           {
              if(i==0)
              {
                  i=k;
              }
           }
           if(array[k]!=temp[k] && i!=0)
           {
               j=k;
           }

       }

       while(i<j)
       {
           int dummy=array[i];
           array[i]=array[j];
           array[j]=dummy;
           i++;
           j--;
       }
        for(int k=0;k<array.length;k++)
        {
            if(array[k]!=temp[k])
            {
                return false;
            }

        }
        return true;
    }
    static boolean checkReverseGFGETHOD(int arr[], int n) {
        // Copying the array.
        int temp[] = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }

        // Sort the copied array.
        Arrays.sort(temp);

        // Finding the first mismatch.
        int front;
        for (front = 0; front < n; front++) {
            if (temp[front] != arr[front]) {
                break;
            }
        }

        // Finding the last mismatch.
        int back;
        for (back = n - 1; back >= 0; back--) {
            if (temp[back] != arr[back]) {
                break;
            }
        }

        // If whole array is sorted
        if (front >= back) {
            return true;
        }

        // Checking subarray is decreasing or not.
        do {
            front++;
            if (arr[front - 1] < arr[front]) {
                return false;
            }
        } while (front != back);

        return true;
    }


}
