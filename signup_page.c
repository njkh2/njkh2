// A c language signup page
#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
#include <string.h>
#include<windows.h>
#include<direct.h>

FILE *fp;
struct information
{
    char fname[30];
    char lname[30];
    char username[40];
    char password[40];
    char mob[13];
    char cnfpass[40];
};
void signup();
void login();

int main(){
    int choice;
    printf("1.SIGNUP\n2.LOGIN\n00.EXIT");
    printf(" pick one choice \n");
    scanf("%d",&choice);
    switch(choice){
        case 0:
            exit(0);
        case 1:
            signup();
            break;
        case 2:
            login();
    }
    return 0;
}

void signup()
{
    
    struct information l;
    fp = fopen("credential.bin", "wb");
    system("CLS");
    printf("WELCOME TO OUR  WEBSITE \n SIGNUP PAGE \nENTER FOLLOWING DETAILS FOR REGISTRATION \n");
    
    printf("FIRST NAME: ");
    scanf("%s",l.fname);
    printf("\nLAST NAME : ");
    scanf("%s",l.lname);
    printf("\nUSERNAME : ");
    scanf("%s",l.username);
    number:
    {
        printf("\nPHONE NUMBER(with + and country code ) : ");
        scanf("%s",l.mob);
    }
    pass: {
        printf("\nPASSWORD : ");
        scanf("%s",l.password);
        printf("\nconfirm your password : ");
        scanf("%s",l.cnfpass);
    }
    printf("\nplease wait your information is verfying .........");
    // verification of the file
    if(strcmp(l.password,l.cnfpass)!=0){
        printf("\nenter the valid password!!");
        goto pass;
    }
    for(int i=0;i<sizeof(l.mob);i++){
        if(l.mob[i]<'0' && l.mob[i]>'9'){
            printf("\nInvalid moble number ");
            goto number;
        }
    }
    system("CLS");
    printf("\nwait while we are storing your information : ");
    fwrite(&l, sizeof(l), 1, fp);
    fclose(fp);
    system("CLS");
    printf("\nYOU ARE NOW REGISTERD ON OUR WEBSITE");
}
void login(){
    char username[30];
    char password[30];
    struct information l;
    int cmppass,cmpusr;
    fp = fopen("credential.bin","rb");
    if(fp == NULL){
        printf("\nerror! occured while opening the file \n");
        exit(0);
    }
    printf("ENTER YOU LOGIN CREDENTIALS HERE : ");
    printf("\nUSERNAME : ");
    scanf("%s",username);
    printf("\nPASSWORD : ");
    scanf("%s",password);
    while(fread(&l,sizeof(l),1,fp)){
        cmpusr = strcmp(l.username,username);
        cmppass = strcmp(l.password,password);
        if(cmpusr!=0 && cmppass!=0){
            printf("\ninvalid username and password! ");
            exit(0);
        }
        if(cmpusr==0 && cmppass!=0)
        {
            printf("\ninvalid password!");
            exit(0);
        }
        if(cmpusr!=0 && cmppass==0){
            printf("\ninvalid username!");
            exit(0);
        }
        printf("\nlogin succesfull\nwelcome to our website ");
    }
}