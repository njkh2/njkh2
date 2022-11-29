/*
  2. Write a program in C to read an existing file. Go to the editor
Test Data :
Input the file name to be opened : test.txt
Expected Output :

 The content of the file test.txt is  :                                                                       
This is the content of the file test.txt.
*/
#include<stdio.h>
#include<stdlib.h>
int main(){
    FILE *fptr;
    char fname[20];
    char str;
    printf("ENTER FILE NAME : ");
    scanf("%s",fname);
    fptr=fopen (fname,"r");
    if(fptr==NULL){
        printf(" FILE DOESNT EXIST ");
        exit(0);
    }
    printf(" %s file has content \n ",fname);
    str=fgetc(fptr);
    while (str!=EOF)
    {
        printf("%c",str);
        str=fgetc(fptr);
    }
    fclose(fptr);
    printf("\n\n");
    
    return 0;
}