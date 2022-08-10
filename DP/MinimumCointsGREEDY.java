public class MinimumCointsGREEDY {
  //https://oj.masaischool.com/contest/4861/problem/202
  static int maxprofit=0;

    public static int Party(int[] suits,int n)
    {
        int[] money={2000,500,200,100,50,20,10,5,2,1};
        Arrays.sort(suits);

        int notes[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int note=0;
            int amount=suits[i];
            int j=0;
            while(amount>0 && j<10)
            {
                if(money[j]<=amount)
                {
                    amount =amount-money[j];
                    note++;
                }
                else
                {
                    j++;
                }
            }
            notes[i]=note;
        }

        int lownote=Integer.MAX_VALUE;
        int lowcash=0;

        for(int i=0;i<n;i++)
        {
            if(notes[i]<lownote)
            {
                lownote=notes[i];
                lowcash=suits[i];
            }
        }
        return lowcash;

    }

    public static void main(String[] args) throws IOException{

        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(reader.readLine().trim());
        while(t!=0)
        {

            int n=Integer.parseInt(reader.readLine().trim());


            String dummy[]=reader.readLine().trim().split(" ");
            int suits[]=new int[n];


            for(int i=0;i<n;i++)
            {
                suits[i]=Integer.parseInt(dummy[i]);
            }

            System.out.println(Party(suits,n));
            t--;
        }

    }
}
