package Apnikaksha;

import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
        int[] array={1,2,3};
        ArrayList<Integer> list=new ArrayList<>();
        subsequence(array,list,0);

    }
    static void subsequence(int[] array,ArrayList<Integer> list,int index)
    {
        if(!list.isEmpty())
        {
            System.out.println(list );
        }

        if(index==array.length)
        {

            return;
        }
        for (int i = index; i < array.length; i++)
        {
            list.add(array[i]);
           subsequence(array,list,i+1);
            list.remove(list.size()-1);
        }


    }

}
