package sortingAlgorithm;
import java.util.*;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        int n = arr.length;
        quickSort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int l, int h) {
        if(l<h) {
            int piindx = pivot(arr, l, h);
            quickSort(arr, l, piindx - 1);
            quickSort(arr, piindx + 1, h);
        }
    }

    private static int pivot(int[] arr, int l, int h) {
        int pivot = arr[h];
        int i = l-1;

        for(int j = l;j<h;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[h] = temp;
        return i;
    }
}
