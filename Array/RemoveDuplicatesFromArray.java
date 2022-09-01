public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
      int[] array={1,1,1,2,2,3,3,4,4,4,5,5,6};
      int n=array.length;
      int i=0;
      int j=0;
      for(i=0;i<n-1;i++)
      {
          if(array[i]!=array[i+1])
          {
              array[j]=array[i];
              j++;
          }
      }
      array[j]=array[n-1];
      for(int k=0;k<=j;k++)
      {
          System.out.println(array[j]);
      }
    }
}
