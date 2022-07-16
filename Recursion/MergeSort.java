import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array={7 ,6 ,5 ,4, 3 ,2, 1};

        int start=0;
        int end=array.length-1;
        divide(array,start,end);
        System.out.println(Arrays.toString(array));
    }
    static void divide(int[] array,int start,int end)
    {
        if(start>=end)
        {
            return;
        }
        int mid=start+(end-start)/2;

        divide(array,start,mid);
        divide(array,mid+1,end);
        merge(array,start,end,mid);
    }
    static void merge(int[] array,int start,int end,int mid)
    {
        int[] array1= Arrays.copyOfRange(array,start,mid+1);
        int[] array2= Arrays.copyOfRange(array,mid+1,end+1);

        int i=0;
        int n1=array1.length;
        int j=0;
        int n2=array2.length;

        while(i<n1 && j<n2)
        {
            if(array1[i]<=array2[j])
            {
                array[start]=array1[i];
                i++;
                start++;
            }
            else
            {
                array[start]=array2[j];
                start++;
                j++;
            }
        }
        while(i<n1)
        {
            array[start]=array1[i];
            i++;
            start++;
        }
        while(j<n2)
        {
            array[start]=array2[j];
            start++;
            j++;
        }
    }
}
