public class DecodingSequence {
    public static void main(String[] args) {
        String string ="1123";
        String output="";
        solve(string,output);
//        int ch=Integer.parseInt("3");
//        char ans1= (char) (ch+'a');
//        char ans=(char)ch;
//        int one=3;
//        String forone="abc";
////        forone=forone+((char)one+'a');
//        char ans1=(char)(one+'a');
//        forone=forone+ans1;



    }
    static void solve(String string,String output)
    {
       if(string.length()==0)
       {
           System.out.println(output);
           return;
       }
       int one=Integer.parseInt(String.valueOf(string.charAt(0)));

       String forone=output;
       forone=forone+((char)(one+'a'-1));
        //System.out.println(forone+"  "+"one");
        solve(string.substring(1),forone);
       if(string.length()>=2)
       {
           int two=Integer.parseInt(string.substring(0,2));
           String fortwo=output;
           fortwo=fortwo+((char)(two+'a'-1));
           //System.out.println(fortwo+"  "+"two");
           solve(string.substring(2),fortwo);
       }


    }








    public class Permu {
        public static void main(String[] args) {
            String string="1123";
            int n=string.length();
            solve(0,n,string,"");
        }
        public static void solve(int index,int n,String string,String output)
        {
            if(string.isEmpty())
            {
                System.out.println(output);
                return;
            }
            int single=Integer.parseInt(String.valueOf(string.charAt(0)));
            char one= (char) ('a'+single-1);

            solve(index+1,n,string.substring(1),output+one);

            if(string.length()>=2)
            {
                int second=Integer.parseInt(string.substring(0,2));
                char two= (char) ('a'+second-1);
                solve(index+1,n,string.substring(2),output+two);

            }

        }
    }

}
