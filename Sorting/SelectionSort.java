import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array={4,2,6,7,8};

        for (int i = 0; i < array.length-1; i++)
        {
            int small=i;
            for (int j = i+1; j < array.length; j++)
            {
                if (array[small]>array[j])
                {
                    small=j;
                }

            }
            int temp=array[small];
            array[small]=array[i];
            array[i]=temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
