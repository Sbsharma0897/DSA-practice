//public class SequenceDigits {
//    public static void main(String[] args) {
//        class Solution {
//            public List<Integer> sequentialDigits(int low, int high) {
//                ArrayList<Integer> list = new ArrayList<>();
//                int output=0;
//
//                for(var i=1;i<9;i++)
//                {
//                    output=0;
//                    solve(low,high,output,list,i);
//                }
//
//                Collections.sort(list);
//                return list;
//            }
//            public void solve(int low,int high,int output,ArrayList<Integer> list,int index)
//            {
//                if(output>=low && output<=high)
//                {
//
//                    list.add(output);
//
//                }
//                if(output>high)
//                {
//                    return;
//                }
//
//
//                if(index==10)
//                {
//                    return;
//                }
//                int newnumber=output*10+index;
//                solve(low,high,newnumber,list,index+1);
//
//
//
//            }
//        }
