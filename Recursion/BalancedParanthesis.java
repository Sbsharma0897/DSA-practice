import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class BalancedParanthesis {
    public static void main(String[] args) {
//        int n=6;
//        ArrayList<String> list=new ArrayList<>();
//        String output="";
//        int open=n;
//        int close=n;
//        balance(open,close,output,list);
//        System.out.println(list);

        ArrayList<String> rr=new ArrayList<>();
        rr.add("5");
        rr.add("2");
//        Collections.sort(rr);
        System.out.println(rr);

    }
    static void balance(int open,int close,String output,ArrayList<String> list)
    {
        if(open==0 && close==0)
        {
            list.add(output);
            return;
        }
        if(open==close)
        {
            balance(open-1,close,output+'(',list);
        }
        else if(open==0)
        {
            balance(open,close-1,output+')',list);
        }
        else
        {
            balance(open-1,close,output+'(',list);
            balance(open,close-1,output+')',list);
        }
    }

}
