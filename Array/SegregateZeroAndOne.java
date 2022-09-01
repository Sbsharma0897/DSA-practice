public class SegregateZeroAndOne {
    public static void main(String[] args) {
        int left=0;
        int right=n-1;
        while(left<right)
        {
            while(left<right && arr[left]==0)
            {
                left++;
            }
            while(left<right && arr[right]==1)
            {
                right--;
            }
            if(left<right)
            {
                arr[left]=0;
                arr[right]=1;
                left++;
                right--;
            }
        }
    }
}
