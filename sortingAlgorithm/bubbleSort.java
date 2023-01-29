package sortingAlgorithm;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {10,20,15,1588,5,615,1,5,12,1,62,6,5,1,51};
        Bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Bubble(int[] arr){
        boolean swapped ;
        for(int i = 0; i< arr.length;i++){
            swapped = false;
            for(int j = 1;j< arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]= temp ;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }

    }
}
