import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class Test {
    public static void main(String[] args) {
//        int n=100;
//        System.out.println(String.valueOf(n).length());
//        int[] s={1,4,5};
//        String ans= Arrays.toString(s);
        String s="sandee";
        List<String> list = Arrays.asList(s.split(""));
//       Arrays.asList("hello");
        System.out.println(list);
//        System.out.println(ans);
//        String S="sandee";
//        ArrayList<String> array=
//        System.out.println(String.valueOf(neww));
//        ArrayList<String> list= new ArrayList<>(Arrays.asList(S.split("")));
//        ArrayList<String> myList = new ArrayList<String>(Arrays.asList(S.split("")));
//        System.out.println(myList);
//        String string="ABCDD";
//        Set<String> set= new HashSet<>(Arrays.asList(string.split("")));
//        System.out.println(set);
//        StringBuilder sb=new StringBuilder("Tony");
//        System.out.println(sb);
//        sb.setCharAt(2,'p');
//        sb.insert(1,'T');
//        System.out.println(sb);
//        sb.delete(0,5);
//        System.out.println(sb.length() );
        int n=100;
       String string= String.valueOf(n);
        System.out.println(string.charAt(0));
        System.out.println(1+Integer.parseInt(String.valueOf(string.charAt(0))));


    }
}
