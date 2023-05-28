package sortingAlgorithm;
// when given numbers from 0 to n || 1 to n use cyclic sortr
import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        int[] nums = {4,3,2,1,5};
        System.out.println(Arrays.toString(nums));
        cyclic(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void cyclic(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i) {
                int temp = nums[i];
                nums[i] = nums[nums[i]];
                nums[nums[i]] = temp;
            }
            else i++;
        }
    }
}