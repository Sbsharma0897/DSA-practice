
public class conevertstringtonumber {

    public class Characters {
        public static void main(String[] args) {
            String string="123456";
            System.out.println(getInteger(string));
        }
        static int getInteger(String string)
        {
            if(string.length()==0)
            {
                return 0;
            }
            char ch=string.charAt(string.length()-1);
            int number=ch-'0';

            return getInteger(string.substring(0,string.length()-1))*10 +number;
        }
}
