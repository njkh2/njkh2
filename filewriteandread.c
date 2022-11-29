/*
   file write and read operation in c 
*/
#include<stdio.h>
#include<stdlib.h>
int main(){
    char str[1000];
    char ch;
    char fname[20] = "test.txt";
    FILE *fptr;
    fptr = fopen(fname,"a");
    if(fptr==NULL){
        printf("error opening file ");
        exit(1);
    }
    printf(" ENTER THE CONTENT YOU WANT TO ENTR IN FILE %s\n",fname);
    fprintf(fptr,"%s",fgets(str, sizeof str,stdin));
    fclose(fptr);
    fptr= fopen(fname,"r");
    if(fptr==NULL){
        exit(1);
    }
    printf("\n\nFILE %s HAVE CONTENT :\n",fname);
    ch = fgetc(fptr);
    while(ch!=EOF){
        printf("%c",ch);
        ch=fgetc(fptr);
    }
    fclose(fptr);
    printf("\n\n");
    return 0;
}