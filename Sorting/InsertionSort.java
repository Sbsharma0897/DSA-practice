import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array={7,8,3,1,2};
        int n=array.length;
        for (int i = 1; i < n; i++)
        {
            if(array[i-1]<= array[i])
            {
                continue;
            }
            else
            {
                int temp=array[i];
               int j=i-1;
                while(j>=0 && array[j]>temp)
                {
                    array[j+1]=array[j];
                    j--;

                }
                array[j+1]=temp;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
