import java.util.ArrayList;
import java.util.*;

public class CaseChange {
    public static void main(String[] args) {
        String string="ab";
        ArrayList<Character> output=new ArrayList<Character>();
        ArrayList<ArrayList<Character>> list=new ArrayList<>();
        changeCase(string,output,list);
        System.out.println(list);
    }
    static void changeCase(String string,ArrayList<Character> output, ArrayList<ArrayList<Character>> list)
    {
        if(string.length()==0)
        {
            ArrayList<Character> temp=new ArrayList<Character>(output);
            list.add(temp);
            return;
        }
        char lower=string.charAt(0);
        char upper=Character.toUpperCase(string.charAt(0));
        output.add(lower);
        changeCase(string.substring(1),new ArrayList<Character>(output),list);
        output.remove(output.size()-1);
        output.add(upper);
        changeCase(string.substring(1),new ArrayList<Character>(output),list);
        output.remove(output.size()-1);


    }
}
