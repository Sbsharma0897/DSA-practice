//public class CombinatiomSum {
////gfg
//    //Given an array of integers and a sum B, find all unique combinations in the array where the sum is equal to B. The same number may be chosen from the array any number of times to make B.
//    //
//    //Note:
//    //        1. All numbers will be positive integers.
//    //        2. Elements in a combination (a1, a2, …, ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
//    //        3. The combinations themselves must be sorted in ascending order.
////User function template for JAVA
//
//    class Solution
//    {
//        //Function to return a list of indexes denoting the required
//        //combinations whose sum is equal to given number.
//        static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B)
//        {
//            ArrayList<ArrayList<Integer>> list= new ArrayList<>();
//            ArrayList<Integer> output=new ArrayList<>();
//            int index=0;
//
//            int sum=0;
//
//
//
//            Set<Integer> set = new HashSet<>(A);
//            A.clear();
//            A.addAll(set);
//            Collections.sort(A);
//            solve(A,B,index,output,0,list);
//
//            Collections.sort(list, (o1, o2) -> {
//                int n = Math.min(o1.size(), o2.size());
//                for (int i = 0; i < n; i++) {
//                    if (o1.get(i) == o2.get(i)){
//                        continue;
//                    }else{
//                        return o1.get(i) - o2.get(i);
//                    }
//                }
//                return 1;
//            });
//            return list;
//
//        }
//        static void solve(ArrayList<Integer> array,int B,int index,ArrayList<Integer> output,int sum,ArrayList<ArrayList<Integer>> list)
//        {
//            if(sum==B)
//            {
//
//                list.add(new ArrayList<>(output));
//
//
//                return;
//            }
//            if(index==array.size() || sum>B)
//            {
//                return;
//            }
//
//            solve(array,B,index+1,output,sum,list);
//            output.add(array.get(index));
//            solve(array,B,index,output,sum+array.get(index),list);
//            output.remove(output.size()-1);
//
//        }
//    }
//}
