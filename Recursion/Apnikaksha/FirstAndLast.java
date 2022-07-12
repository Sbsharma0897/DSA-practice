package Apnikaksha;

public class FirstAndLast   {
    public static void main(String[] args) {
        String string="bdafdjerjakj";
        finding(string,'a',0);
        System.out.println(first);
        System.out.println(last );
    }
    static int first=-1;
    static int last=-1;
    static void finding(String string,char alpha,int index)
    {
        if(index==string.length())
        {
            return;
        }
        if(string.charAt(index)==alpha)
        {
            if(first==-1)
            {
                first=index;
            }
            else
            {
                last=index;
            }
        }
        finding(string,alpha,index+1);

    }
}
