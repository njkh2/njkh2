/*
  c program to dynamically allocaate memory to array

*/
#include<stdio.h>
#include<stdlib.h>

int main(){
    int n,item;
    printf(" ENTER THE SIZE OF ARRAY :");
    scanf("%d",&n);
    int *arr = (int*)malloc(n * sizeof(int ));
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    printf(" ENTER THE ELEMENT YOU WANT TO DELETE FROM ARRAY : ");
    scanf("%d",&item);
    int i;
    for(i=0;i<n;i++){
        if(arr[i]==item){
            break;
        }
    }
    for(int j= i;j<n;j++){
        arr[i]=arr[i+1];
        
    }
    
    printf(" ARRAY AFTER DELETION OF ELEMENT : ");
    for(i=0;i<n-1;i++){
        printf("%d\t",arr[i]);
    }    
    free(arr);
    return 0;
}