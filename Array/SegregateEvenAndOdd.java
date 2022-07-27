public class SegregateEvenAndOdd {
    public static void main(String[] args) {
//https://practice.geeksforgeeks.org/problems/segregate-even-and-odd-numbers4629/1
        //Given an array Arr[], write a program that segregates even and odd numbers.
        // The program should put all even numbers first in sorted order, and then odd
        // numbers in sorted order.
    }
    void segregateEvenOdd(int arr[], int n) {

        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        for(int el:arr)
        {
            if(el%2==0)
            {
                even.add(el);
            }
            else
            {
                odd.add(el);
            }
        }
        Collections.sort(even);
        Collections.sort(odd);

        even.addAll(odd);
        for(var i=0;i<n;i++)
        {

            arr[i]=even.get(i);

        }


    }
}
