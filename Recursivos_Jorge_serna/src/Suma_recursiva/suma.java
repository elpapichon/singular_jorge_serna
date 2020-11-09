package Suma_recursiva;

import java.util.ArrayList;
import java.util.Arrays;

class suma {
       static void sum(ArrayList<Integer> nums, int target, ArrayList<Integer> partial) {
          int s = 0;
          for (int x: partial) s += x;
          if (s == target)
               System.out.println(Arrays.toString(partial.toArray())+" = "+target);
          if (s >= target)
               return;
          for(int i=0;i<nums.size();i++) {
                ArrayList<Integer> remaining = new ArrayList<Integer>();
                int n = nums.get(i);
                for (int j=i+1; j<nums.size();j++) remaining.add(nums.get(j));
                ArrayList<Integer> partial_rec = new ArrayList<Integer>(partial);
                partial_rec.add(n);
                sum(remaining,target,partial_rec);
          }
       }
       static void start_sum(ArrayList<Integer> nums, int target) {
           sum(nums,target,new ArrayList<Integer>());
       }
       public static void main(String args[]) {
           Integer[] numbers = {1,2,3,4,5,6,7,8,9,10};
           int target = 10;
           start_sum(new ArrayList<Integer>(Arrays.asList(numbers)),target);
       }
}