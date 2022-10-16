public class HappyNumber {
    public static void main(String[] args) {
        //https://leetcode.com/problems/happy-number/
    }
    public boolean isHappy(int n) {

        HashSet<Integer> set=new HashSet<>();

        while(!set.contains(n))
        {
            set.add(n);
            int newNumber=0;
            while(n!=0)
            {
                newNumber += (n%10)*(n%10);
                n=n/10;
            }
            n=newNumber;

            if(n==1)
            {
                return true;
            }

        }
        return false;

    }
}
