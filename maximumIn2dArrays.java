package LinearSearchAlgorithm;
import java.util.Arrays;
public class maximumIn2dArrays
{
    public static void main(String[] args){
        int[][] arr = {
                {12,14,15,26},
                {154,78,98,656},
                {56,45,878,44,65}
        };
        int ans = maximum(arr);
        System.out.println(ans);
    }

    static int maximum(int[][] arr) {
        int max = arr[0][0];
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (max < anInt) {
                    max = anInt;
                }
            }
        }
        return max;
    }
}
