public class NumberofZereos {

    public static void main(String[] args) {
        int[] array={1,0,7,6,0,0};
        System.out.println(call(array,0,0));
    }
    static int call(int[] array,int i,int count)
    {
        if(i==array.length)
        {
            return count;
        }
        if(array[i]==0)
        {
            count++;
        }
        return  call(array,i+1,count);
    }
}
