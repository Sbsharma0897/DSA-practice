import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array={5,3,4,1,2};
        int low=0;
        int high=array.length-1;
//        quickSort(array,low,high);
        sort(array,low,high);
        System.out.println(Arrays.toString(array));

        //The key process in quickSort is a partition(). The target of partitions is, given an array
        // and an element x of an array as the pivot, put x at its correct position in a sorted array
        // and put all smaller elements (smaller than x) before x, and put all greater elements
        // (greater than x) after x. All this should be done in linear time.
    }
    static void quickSort(int[] array,int low,int high)
    {
        //base case
//       if(low>=high)
//       {
//           return;
//       }
     if(low<high)
     {
         //giving correct poosition of the the pivot element(first element of array)
         int p=partition(array,low,high);

         //left part quicksort
         quickSort(array,low,p-1);

         //right part quicksort
         quickSort(array,p+1,high);
     }


    }

    static int partition(int[] array,int low,int high)
    {
       int pivot=array[(low+high)/2];// take pivot as end element of array
       int i=low-1;// this is position where we will be inserting our pivot lower elements gardually.
        for (int j = low; j <high ; j++)
        {
           if(array[j]<pivot)// to check which elements are lower than pivot in the array
           {
               i++;// make space for new lower element to be added/swapped in array
               int temp=array[i];
               array[i]=array[j];
               array[j]=temp;
           }
        }
        i++; //after travering array, we need to put the pivot element just after last lower element , so
        int temp=array[i];  //do i++ to make new position for pivot and that's the correct place of pivot
        array[i]=array[high];
        array[high]=temp;
        return i;//return pivot
    }

    static void sort(int[] nums, int low, int hi) {

        //kunal's approach, it's pretty easy
        if (low >= hi) {
            return;
        }

        int s = low;
        int e = hi;
        int m = s + (e - s) / 2;
        int pivot = nums[m];

        while (s <= e) {

            // also a reason why if its already sorted it will not swap
            while (nums[s] < pivot) {
                s++;
            }
            while (nums[e] > pivot) {
                e--;
            }

            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        // now my pivot is at correct index, please sort two halves now
        sort(nums, low, e);
        sort(nums, s, hi);
    }
}
