/*
  1. Write a program in C to create and store information in a text file. Go to the editor
Test Data :
Input a sentence for the file : This is the content of the file test.txt.
Expected Output :

 The file test.txt created successfully...!!
*/
#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

int main(){
    FILE *fp;
    fp = fopen("test.txt","a");
    if(fp == NULL){
        printf("ERROR OPENING FILE");
        exit(1);
    }
    char str[1000];
    
    puts("ENTER THE DATA YOU WANT TO WRITE IN FILE test.txt");
    // fgets(str, sizeof str, stdin);
    fprintf(fp,"%s",fgets(str,sizeof str,stdin));
    fclose(fp);
    printf(" information stored ");
    return 0;
}