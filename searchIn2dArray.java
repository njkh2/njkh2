package LinearSearchAlgorithm;
import java.util.Arrays;
public class searchIn2dArray
{
    public static void main(String[] args){
        int[][] arr = {
                {12,14,15,26},
                {154,78,98,656},
                {56,45,878,44,65}
        };
        int target = 15;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target) {
        for(int row = 0; row < arr.length;row++){
            for(int column = 0; column < arr[row].length;column++){
                if(arr[row][column]==target){
                    return new int[]{row,column};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
