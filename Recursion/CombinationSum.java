//public class CombinationSum {
//    public static void main(String[] args) {
////        public List<List<Integer>> combinationSum3(int k, int n) {
//            List<List<Integer>> list =new ArrayList<>();
//            ArrayList<Integer> output=new ArrayList<>();
//            int index=1;
//            helper(k,n,index,output,list);
//            return list;
//
//        }
//        public void helper(int k,int n,int index,ArrayList<Integer> output,List<List<Integer>> list)
//        {
//            if(output.size()==k && n==0)
//            {
//                list.add(new ArrayList<>(output));
//                return;
//            }
//            if(n<0 || output.size()>k)
//            {
//                return;
//            }
//            for(var i=index;i<=9;i++)
//            {
//                output.add(i);
//                helper(k,n-i,i+1,output,list);
//                output.remove(output.size()-1);
//            }
//
//        }
//    }
//}
