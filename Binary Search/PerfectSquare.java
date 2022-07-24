public class PerfectSquare {
    public static void main(String[] args) {

    }
    public boolean isPerfectSquare(int num) {
        int i=2;
        if(num==1)
        {
            return true;
        }
        int j=num/2;
        while(i<=j)
        {
            int mid=i+((j-i)/2);
            long cal=(long)mid*mid;

            if(cal==num)
            {
                return true;
            }
            else if(cal>num)
            {
                j=mid-1;
            }
            else
            {
                i=mid+1;
            }
        }
        return false;

    }
}
