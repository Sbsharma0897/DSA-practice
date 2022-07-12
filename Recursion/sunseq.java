import java.util.ArrayList;
import java.util.LinkedList;

public class sunseq {

    public static void main(String[] args) {
        String string="abc";
        subsequence("",string);
//        System.out.println(subsequencewitharray("",string,array));

////        System.out.println(subsequencewitharray("",string,array));
//        System.out.println(subSeqRet("",string));

    }
    static void subsequence(String ans,String string)
    {
        if(string.isEmpty())
        {
            System.out.println(ans);
            return;
        }
        char ch=string.charAt(0);
        subsequence(ans+ch,string.substring(1));
        subsequence(ans,string.substring(1));
    }
    static ArrayList<String> array=new ArrayList<>();

    static ArrayList<String> subsequencewitharray(String ans, String string,ArrayList<String> array)
    {

        if(string.isEmpty())
        {

            array.add(ans);

            return array;
        }
        char ch=string.charAt(0);
        subsequencewitharray(ans+ch,string.substring(1),array);
         subsequencewitharray(ans,string.substring(1),array);
         return array;

    }
    static ArrayList<String> subSeqRet(String ans, String string)
    {

        if(string.isEmpty())
        {
            ArrayList<String> array=new ArrayList<>();
            array.add(ans);
            return array;
        }
        char ch=string.charAt(0);
        ArrayList<String> left = subSeqRet(ans+ch,string.substring(1));
        ArrayList<String> right=subSeqRet(ans,string.substring(1));
        left.addAll(right);
        return left;

    }
}
