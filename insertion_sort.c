#include<stdio.h>
#include<stdlib.h>
int main(){
    int n;
    printf(" ENTER THE SIZE OF THE ARRAY : ");
    scanf("%d",&n);
    int *arr= (int *)malloc(n  * sizeof(int ));
    printf("  ENTER %d ELEMENTS : \n",n);
    for(int i = 0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    int i,j;
    for (i=0;i<=n-2;i++){
        for(j=i+1;j>0;j--){
            if(arr[j]<arr[j-1]){
                int t = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=t;
            }
        }
    }
    printf(" SORTED ARRAY :\n");
    for(i=0;i<n;i++){
        printf("%d\t",arr[i]);
    }
    return 0;
}