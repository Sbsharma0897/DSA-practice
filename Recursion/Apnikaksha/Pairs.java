package Apnikaksha;

public class Pairs {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(countPairs(n));
    }

    static int countPairs(int n) {
        if (n == 0) {
            return 0;
        }
        int count = 0;

        count = count + 1 + (n - 1) + countPairs(n - 1);
        return count;
    }
}
