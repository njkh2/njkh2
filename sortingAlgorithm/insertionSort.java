package sortingAlgorithm;
import java.util.Arrays;
public class  insertionSort {
    /*Function to sort array using insertion sort*/
    // Driver method
    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6 };
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void sort(int[] nums){
        int i,j;
        for(i = 0;i<nums.length-1;i++){
            for(j=i+1;j>0;j--){
                if(nums[j]<nums[j-1]){
                    int temp= nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }
                else break;
            }
        }
    }
}
