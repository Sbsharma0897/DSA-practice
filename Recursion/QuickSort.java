import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array={6,3,9,5,2,8};
        int low=0;
        int high=array.length-1;
        quickSort(array,low,high);
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
       int pivot=array[high];// take pivot as end element of array
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
        i++;// after travering array, we need to put the pivot element just after last lower element , so
        int temp=array[i];  //do i+++ tomake new position for pivot and thats the correct place of pivot
        array[i]=array[high];
        array[high]=temp;
        return i;//return pivot

    }

//    static int partition(int[] array,int low,int high)
//    {
//        int pivot=array[low]; //take first element only as pivot element
//
//        int count=0; // count the number of elements in array which are less than pivot
//        for (int i = low+1; i <=high; i++)
//        {
//            if(array[i]<=pivot)
//            {
//                count++;
//            }
//        }
//        int pivotIndex=low+count; // now this is the correct position of pivot element and place our pivot element
//        // at this position;
//
//        int temp=array[low];
//        array[low]=array[ pivotIndex];
//        array[pivotIndex]=temp;
//
//        //Now since our pivot element is at its right place, we need to make all the pivot left elements lower than pivot value
//        // and all the pivot right elment greater than pivot, bcz we are doing a recursive call on left and right individually
//
//        int i=low;
//        int j=high;
//        while(i<pivotIndex && j>pivotIndex)
//        {
//            while(array[i]<pivot)
//            {
//                i++;
//            }
//            while(array[j]>pivot)
//            {
//                j--;
//            }
//            if(i<pivotIndex && j>pivotIndex)
//            {
//                temp=array[i];
//                array[i]=array[j];
//                array[j]=temp;
//                i++;
//                j--;
//            }
//        }
//        return pivotIndex;
//    }
}
