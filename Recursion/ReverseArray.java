import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6};
        int n=array.length;
        int left=0;
        int right=n-1;
        reverse(array,left,right,n);
        System.out.println(Arrays.toString(array));
    }
    public static void reverse(int[] array, int left, int right, int n)
    {
        if(left>=right)
        {
            return;
        }
        int temp=array[left];
        array[left]=array[right];
        array[right]=temp;

        reverse(array,left+1,right-1,n);

    }
}
