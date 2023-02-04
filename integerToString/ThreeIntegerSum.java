package leetcodeQuestions;
import java.util.*;
public class ThreeIntegerSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> list= ThreeSum(nums);
        for(int i = 0; i< list.size();i++){

            System.out.println(list.get(i).toString());
        }
    }
    static List<List<Integer>> ThreeSum(int[] nums){
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int i = 0;
        int j ,k;
        for(i = 0; i< nums.length-2;i++){
            j = i+1;
            k=nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum == 0){
                    list.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                }
                else if(sum>0)k--;
                else if(sum<0) j++;
            }

        }
        return list;
    }
}
