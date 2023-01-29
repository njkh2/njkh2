package sortingAlgorithm;
import java.util.Arrays;
public class selectionSort {
    public static void main(String[] args) {
         int[] arr = {1,6,5,153,13,516,4,654,6,4,235};
         selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        for(int i = 0; i< arr.length; i++){
            // find the max item in the remaining array and swap with correct index
            int last = arr.length-i-1;
            int max = MaxValue(arr,0,last);
            swap(arr, max, last);
        }
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a]= arr[b];
        arr[b] = temp;
    }
    static int MaxValue(int[] arr, int start, int last) {
        int max = start;
        for(int i = start; i <=  last;i++){
            if(arr[max]<arr[i])
                max = i;
        }
        return max;
    }
}
