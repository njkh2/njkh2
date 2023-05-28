package sortingAlgorithm;
import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1,0};
        mergeSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr, int l,int r){
        if(l<r){
            int mid = (l + r) / 2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }
    private static void merge(int[] arr, int l, int m, int r){
        int n1 = m-l+1;
        int n2 = r-m;
        int[] pre = new int[n1];
        int[] post = new int[n2];
        for(int i = 0;i<pre.length;i++)
            pre[i] = arr[l+i];
        for(int j = 0;j<post.length;j++){
            post[j] = arr[m+1+j];
        }
        int i = 0,j=0,c=l;
        while(i<n1&& j<n2){
            if(pre[i]<post[j]){
                arr[c] = pre[i];
                i++;
            }
            else{
                arr[c] = post[j];
                j++;
            }
            c++;
        }
        while(i<n1){
            arr[c] = pre[i];
            c++;
            i++;
        }
        while(j<n2){
            arr[c] = post[j];
            j++;
            c++;
        }
    }
}
