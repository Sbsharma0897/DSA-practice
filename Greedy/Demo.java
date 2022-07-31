import java.util.*;

public class Demo {
    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//        int number=input.nextInt();
//        int n=input.nextInt();
//        int[] array=input;
//        String name=input.nextLine();
//        System.out.println(name);
//        System.out.println(number+" "+n);
        int[] array={10,5,6};
        int[][] matrix=new int[3][2] ;

        for(int i=0;i<3;i++) {
            matrix[i][0] = array[i];
            matrix[i][1] = i;

        }
        Arrays.sort(matrix,(a,b)->
        {
            System.out.println(a[1]+" "+b[1]);
            if(a[0]>b[0])
            {
                return 1;
            }
            else if(a[0]<b[0])
            {
                return -1;
            }
            else
            {
                return 0;
            }
        });
        for(int i=0;i<3;i++) {

            System.out.println(Arrays.toString((matrix[i])));

        }

    }
}
