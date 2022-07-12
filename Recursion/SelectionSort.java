import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={5,9,1,6,2,0,2};

        selectionSort(arr,0,0,0);
        System.out.println(Arrays.toString(arr));

    }
    static void selectionSort(int[] arr,int i,int j,int min)
    {
        if(i==arr.length-1)
        {
            return;
        }
        if(j==arr.length)
        {
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;



        }
        if(j<arr.length)
        {
            if(arr[j]<arr[min])
            {
                min=j;
            }
            selectionSort(arr,i,j+1,min);
        }
        else {
            selectionSort(arr,i+1,i+1,i+1);
          }

    }
}
