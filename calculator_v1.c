//RADHE RADHE
/*DATE= 6/8/2022
AUTHOR= ABHISHEK GUPTA
*/
//unit converzion
//5). BMI=Body Mass Index is a simple calculation using a person's height and weight. The formula is BMI = kg/m^2 where kg is a person's weight in kilograms and m^2 is their height in metres squared. A BMI of 25.0 or more is overweight, while the healthy range is 18.5 to 24.9.
/*1)length= meter,centimeter,milimeter,inches,foots
2)mass= kg,grams,pound
3)temperatue= celcius,kelvin,ferhenite
4)speed= km/hr,m/sec,miles/hr
*/
#include<stdio.h>
#include<math.h>
void addition();
void substraction();
void multiplication();
void division();
void modulus();
void _sin();
void _cos();
void _tan();
void _sec();
void _cosec();
void _cot();
void percentage();
void average();
void even();
void prime();
float mtr_cm(float);
float mtr_mm(float);
float mtr_inch(float);
float mtr_foot(float);
float cm_mtr(float);
float cm_mm(float);
float cm_inch(float);
float cm_foot(float);
float mm_mtr(float);
float mm_cm(float);
float mm_inch(float);
float mm_foot(float);
float inch_mtr(float);
float inch_cm(float);
float inch_mm(float);
float inch_foot(float);
float foot_mtr(float);
float foot_cm(float);
float foot_mm(float);
float foot_inch(float);
float bmi(float,float);
float kg_gm(float kg);
float kg_lb(float kg);
float gm_kg(float gm);
float gm_lb(float gm);
float lb_kg(float lb);
float lb_gm(float lb);
float c_k(float c);
float c_f(float c);
float k_c(float k);
float k_f(float k);
float f_c(float f);
float f_k(float f);
float km_m(float km);
float km_ml(float km);
float m_km(float m);
float m_ml(float m);
float ml_km(float ml);
float ml_m(float ml);


int main(){
    printf("RADHE RADHE SIR :)\n");
    printf("MAIN MENU : \n");
    printf("1.ARITHMETIC OPERATION\n");
    printf("2.TRIGONETRY\n");
    printf("3.AVERAGE AND PERCENTAGE\n");
    printf("4.PRIME NUMBER\n");
    printf("5.EVEN/ODD NUMBER\n");
    printf("6.UNIT CONVERSION\n");
    printf("7.BMI(Body Mass Index)\n");
    printf("\nPICK ONE ITEM FROM MENU: ");
    int menu;
    scanf("%d",&menu);
    switch (menu)
    {
    case 1:
        
        printf("1.ADDITION\n");
        printf("2.SUBSTRACTION\n");
        printf("3.MULTIPLICATION\n");
        printf("4.DIVISION\n");
        printf("5.MODULUS(to check either the number is divisible by another num or not)\n");
        int arithmenu;
        printf("\nSELECT SOMETHING FROM MENU: \n");
        scanf("%d",&arithmenu);
        switch (arithmenu)
        {
        case 1:
            addition();
            break;
        case 2:
            substraction();
        case 3:
            multiplication();
        case 4:
            division();
        case 5:
            modulus();        
        default:
            printf("\nWORNG CHOICE \nTRY AGAIN \nRADHE RADHE :)\nHAVE A NICE DAY");
            break;
        }
        break;
    case 2:
        printf("\nTRIGONOMETRIC FUNCTIONS: \n");
        printf("1.SIN\n");
        printf("2.COS\n");
        printf("3.TAN\n");
        printf("4.COSEC\n");
        printf("5.SEC\n");
        printf("6.COT\n");
        int trigo;
        printf("\nPICK ONE ITEM FROM ABOVE: ");
        scanf("%d",&trigo);
        switch (trigo)
        {
        case 1:
            _sin();
            break;
        case 2: 
            _cos();
            break;
        case 3:
            _tan();
            break;
        case 4:
            _cosec();
            break;
        case 5:
            _sec();
            break;
        case 6:
            _cot();
            break;            
        default:
            printf("\nRADHE RADHE :)\nHAVE A NICE DAY ");
            break;
        }
        break;
    case 3:
        printf("1.PERCENTAGE\n");
        printf("2.AVERAGE\n");
        printf("CHOOSE FROM ABOVE: ");
        int perc;
        scanf("%d",&perc);
        switch (perc)
        {
        case 1:
            percentage();
            break;
        case 2:
            average();
            break;
        default:
            printf("\nRADHE RADHE :)\nHAVE A NICE DAY\n");
            break;
        }   
    case 4:
        prime();
        break;
    
    case 5:
        even();
        break;

    case 6:
        {
            int unit;
            printf("\nWELCOME TO UNIT CONVERTER\n");
            printf("HERE ARE SOME OPERATIONS THAT YOU CAN PERFORM USING MY PROGRAMS\n");
            printf("1.LENGTH\n");
            printf("2.MASS\n");
            printf("3.TEMPERATURE\n");
            printf("4.SPEED\n");
            printf("CHOOSE THE OPERATION FOR NEXT MENU \n");
            scanf("%d",&unit);
            switch (unit){
                case 1:
                {
                    int from,to;
    
                    printf("PICK WHICH UNIT YOU WANT TO CONVERT FROM:  ");
                    printf("\n1.METER(mtr)\n");
                    printf("2.CENTIMETER(cm)\n");
                    printf("3.MILIMETER(mm)\n");
                    printf("4.INCHES(in)\n");
                    printf("5.FOOT(ft)\n");
                    scanf("%d",&from);

                    printf("\nPICK IN WHICH YOU WANT TO CONVERT THE UNIT:  ");
                    printf("\n1.METER(mtr)\n");
                    printf("2.CENTIMETER(cm)\n");
                    printf("3.MILIMETER(mm)\n");
                    printf("4.INCHES(in)\n");
                    printf("5.FOOT(ft)\n");
                    scanf("%d",&to);

                    float mtr,cm,mm,in,ft;
                    
                    if (from == 1)
                    {
                        
                        if (to == 2)
                        {

                            printf("\nMETER - CENTIMETER\n");
                            printf("ENTER VALUE IN METER: ");
                            scanf("%f",&mtr);
                            printf("THE ANSWER IS %fcm\n",mtr_cm(mtr));
                        }
                        else if (to == 3)
                        {
                            printf("\nMETER - MILIMETER\n");
                            printf("ENTER VALUE IN METER: ");
                            scanf("%f",&mtr);
                            printf("THE ANSWER IS %fmm\n",mtr_mm(mtr));
                        }
                        else if (to == 4)
                        {
                            printf("\nMETER - INCHES\n");
                            printf("ENTER VALUE IN METERS:  ");
                            scanf("%f",&mtr);
                            printf("THE ANSWER IS %fin",mtr_inch(mtr) );

                        }
                        else if (to == 5)
                        {
                            printf("\nMETER - FOOT\n");
                            printf("ENTER VALUE IN METERS:  ");
                            scanf("%f",&mtr);
                            printf("THE ANSWER IS %fft",mtr_foot(mtr));
                        }
                        else{
                            printf("WRONG CHOICE:)\n");
                        }

                    }                  
                    if (from == 2)
                    {
                        if (to == 1)
                        {
                            printf("\nCENTIMETER - METER\n");
                            printf("ENTER VALUE IN CENTIMETER:  ");
                            scanf("%f",&cm);
                            printf("THE ANSWER IS %fmtr\n",cm_mtr(cm));
                        }
                        else if (to == 3)
                        {
                            printf("\nCENTIMETER - MILIMETER\n");
                            printf("ENTER VALUE IN CENTIMETER:  ");
                            scanf("%f",&cm);
                            printf("THE ANSWER IS %fmm\n",cm_mm(cm));
                        }
                        else if (to == 4)
                        {
                            printf("\nCENTIMETR - INCHES\n");
                            printf("ENTER VALUE IN CENTIMETER:  ");
                            scanf("%f",&cm);
                            printf("THE ANSWER IS %fin\n",cm_inch(cm));
                        }
                        else if (to == 5)
                        {
                            printf("\nCENTIMETER - FOOTS\n");
                            printf("ENTER VALUE IN CENTIMETER:  ");
                            scanf("%f",&cm);
                            printf("THE ANSWER IS %fft\n",cm_foot(cm));
                        }
                        
                    }
                    if (from == 3)
                    {
                        if (to == 1)
                        {
                            printf("\nMILLIMETER - METER\n");
                            printf("ENTER VALUE IN MILLIMETER:  ");
                            scanf("%f",&mm);
                            printf("THE ANSWER IS %fmtr\n",mm_mtr(mm));
                        }
                        else if (to == 2)
                        {
                            printf("\nMILLIMETER - CENTIMETER\n");
                            printf("ENTER VALUE IN MILLIIMETER:  ");
                            scanf("%f",&mm);
                            printf("THE ANSWER IS %fcm\n",mm_cm(mm));
                        }
                        else if (to == 4)
                        {
                            printf("\nMILLIMETR - INCHES\n");
                            printf("ENTER VALUE IN MILLIIMETER:  ");
                            scanf("%f",&mm);
                            printf("THE ANSWER IS %fin\n",mm_inch(mm));
                        }
                        else if (to == 5)
                        {
                            printf("\nMILLIIMETER - FOOTS\n");
                            printf("ENTER VALUE IN MILLIMETER:  ");
                            scanf("%f",&mm);
                            printf("THE ANSWER IS %fft\n",mm_foot(mm));
                        }
                    }
                    if (from == 4)
                    {
                        if (to == 1)
                        {
                            printf("\nINCHES - METER\n");
                            printf("ENTER VALUE IN INCHES:  ");
                            scanf("%f",&in);
                            printf("THE ANSWER IS %fmtr\n",inch_mtr(in));
                        }
                        else if (to == 2)
                        {
                            printf("\nINCHES - CENTIMETER\n");
                            printf("ENTER VALUE IN INCHES:  ");
                            scanf("%f",&in);
                            printf("THE ANSWER IS %fcm\n",inch_cm(in));
                        }
                        else if (to == 3)
                        {
                            printf("\nINCHES - MILLIMETER\n");
                            printf("ENTER VALUE IN INCHES:  ");
                            scanf("%f",&in);
                            printf("THE ANSWER IS %fmm\n",inch_mm(in));
                        }
                        else if (to == 5)
                        {
                            printf("\nINCHES - FOOTS\n");
                            printf("ENTER VALUE IN INCHES:  ");
                            scanf("%f",&in);
                            printf("THE ANSWER IS %fft\n",inch_foot(in));
                        }
                    }
                    if (from == 5)
                    {
                        if (to == 1)
                        {
                            printf("\nFOOTS - METER\n");
                            printf("ENTER VALUE IN FOOTS:  ");
                            scanf("%f",&ft);
                            printf("THE ANSWER IS %fmtr\n",foot_mtr(ft));
                        }
                        else if (to == 2)
                        {
                            printf("\nFOOTS - CENTIMETER\n");
                            printf("ENTER VALUE IN FOOTS:  ");
                            scanf("%f",&ft);
                            printf("THE ANSWER IS %fcm\n",foot_cm(ft));
                        }
                        else if (to == 3)
                        {
                            printf("\nFOOTS - MILLIMETER\n");
                            printf("ENTER VALUE IN FOOTS:  ");
                            scanf("%f",&ft);
                            printf("THE ANSWER IS %fmm\n",foot_mm(ft));
                        }
                        else if (to == 4)
                        {
                            printf("\nFOOTS - INCHES\n");
                            printf("ENTER VALUE IN FOOTS:  ");
                            scanf("%f",&ft);
                            printf("THE ANSWER IS %fin\n",foot_inch(ft));
                        }
                    }
                break;
                }
                case 2: {
                    int from,to;
                    float kg,gm,lb;
                    printf("\nPICK UNIT YOU WANT TO CONVERT FROM: \n");
                    printf("1.KILOGRAM(kg)\n");
                    printf("2.GRAM(gm)\n");
                    printf("3.POUNDS(lb)\n");
                    scanf("%d",&from);

                    printf("\nPICK UNIT YOU WANT TO CONVERT INTO: \n");
                    printf("1.KILOGRAM(kg)\n");
                    printf("2.GRAM(gm)\n");
                    printf("3.POUNDS(lb)\n");
                    scanf("%d",&to);
                    if (from == 1)
                    {
                        if (to == 2)
                        {
                            printf("KILOGRAM(kg) - GRAM(gm)\n");
                            printf("ENTER VALUE IN KILOGRAM: ");
                            scanf("%f",&kg);
                            printf("\nTHE ANSWER IS %.2fgm\n",kg_gm(kg)); 
                        }
                        else if (to == 3)
                        {
                            printf("KILOGRAM(kg) - POUNDS(lb)\n");
                            printf("ENTER VALUE IN KILOGRAM: ");
                            scanf("%f",&kg);
                            printf("\nTHE ANSWER IS %.2flb\n",kg_lb(kg));
                        }
                        
                        
                    }
                    if (from == 2)
                    {
                        if (to == 1)
                        {
                            printf("GRAM(gm) - KILOGRAM(kg)\n");
                            printf("ENTER VALUE IN GRAM: ");
                            scanf("%f",&gm);
                            printf("\nTHE ANSWER IS %.2fkg\n",gm_kg(gm)); 
                        }
                        else if (to == 3)
                        {
                            printf("GRAM(gm) - POUNDS(lb)\n");
                            printf("ENTER VALUE IN GRAM: ");
                            scanf("%f",&gm);
                            printf("\nTHE ANSWER IS %.2flb\n",gm_lb(gm));
                        }
                        
                        
                    }
                    if (from == 3)
                    {
                        if (to == 1)
                        {
                            printf("POUNDS(lb) - KILOGRAM(kg)\n");
                            printf("ENTER VALUE IN POUNDS: ");
                            scanf("%f",&lb);
                            printf("\nTHE ANSWER IS %.2fkg\n",lb_kg(lb)); 
                        }
                        else if (to == 2)
                        {
                            printf("POUNDS(lb) - GRAMS(gm)\n");
                            printf("ENTER VALUE IN POUNDS: ");
                            scanf("%f",&lb);
                            printf("\nTHE ANSWER IS %.2fgm\n",lb_gm(lb));
                        }
                        
                        
                    }
                    break;
                }
                
                case 3:{
                    int from,to;
                    float c,k,f;
                    printf("\nPICK THE UNIT YOU WANT TO CONVERT FROM: \n");
                    printf("1.CELCIUS/CENTIGRATE(C)\n");
                    printf("2.KELVIN(k)\n");
                    printf("3.FAHRENHEIT(f)\n");
                    scanf("%f",&from);

                    printf("\nPICK THE UNIT YOU WANT TO CONVERT INTO: \n");
                    printf("1.CELCIUS/CENTIGRATE(C)\n");
                    printf("2.KELVIN(k)\n");
                    printf("3.FAHRENHEIT(f)\n");
                    scanf("%f",&to);

                    if (from == 1)
                    {
                        if (to == 2)
                        {
                            printf("\nCELIUS - KELVIN\n");
                            printf("ENTER VALUE IN DEGREE CELCIUS: ");
                            scanf("%f",&c);
                            printf("THE ANSWER IS %.2fk\n",c_k(c));
                        }
                        else if (to == 3)
                        {
                            printf("CELCIUS - FAHRENHEIT\n");
                            printf("ENTER VALUE IN DEGREE CELCIUS: ");
                            scanf("%f",&c);
                            printf("THE ANSWER IS %.2ff\n",c_f(c));
                        }

                        
                        
                    }
                    if (from == 2)
                    {
                        if (to == 1)
                        {
                            printf("\nKELVIN - CELCIUS\n");
                            printf("ENTER VALUE IN KELVIN: ");
                            scanf("%f",&k);
                            printf("THE ANSWER IS %.2fC\n",k_c(k));
                        }
                        else if (to == 3)
                        {
                            printf("KELVIN - FAHRENHEIT\n");
                            printf("ENTER VALUE IN KELVIN: ");
                            scanf("%f",&k);
                            printf("THE ANSWER IS %.2ff\n",k_f(k));
                        }

                        
                        
                    }
                    if (from == 3)
                    {
                        if (to == 1)
                        {
                            printf("\nFAHRENHEIT - CELCIUS\n");
                            printf("ENTER VALUE IN FAHRENHEIT: ");
                            scanf("%f",&f);
                            printf("THE ANSWER IS %.2fC\n",f_c(f));
                        }
                        else if (to == 2)
                        {
                            printf("FAHRENHEIT - KELVIN\n");
                            printf("ENTER VALUE IN FAHRENHEIT: ");
                            scanf("%f",&f);
                            printf("THE ANSWER IS %.2fk\n",f_k(f));
                        }

                        
                        
                    }
                    break;
                }
                case 4:
                {
                    int from,to;
                    float km,m,ml;
                    printf("\nPICK FROM WHICH YOU WANT TO CONVERT: ");
                    printf("\n1.km/h\n");
                    printf("2.m/s\n");
                    printf("3.miles/h\n");
                    scanf("%d",&from);

                    printf("\nPICK FROM WHICH YOU WANT TO CONVERT: ");
                    printf("\n1.km/h\n");
                    printf("2.m/s\n");
                    printf("3.miles/h\n");
                    scanf("%d",&to);

                    if(from == 1){
                        if(to == 2){
                            printf("\nkm/h - m/s\n");
                            printf("ENTER VALUE IN km/h: ");
                            scanf("%f",&km);
                            printf("\nTHE ANSWER IS %.2fm/s\n",km_m(km));

                        }
                        else if (to == 3)
                        {
                            printf("\nkm/h - miles/h\n");
                            printf("ENTER VALUE IN km/h: ");
                            scanf("%f",&km);
                            printf("\nTHE ANSSWER IS %.2fmiles/h\n",km_ml(km));
                        }
                        
                    }
                    if(from == 2){
                        if(to == 1){
                            printf("\nm/s - km/h\n");
                            printf("ENTER VALUE IN m/s: ");
                            scanf("%f",&m);
                            printf("\nTHE ANSWER IS %.2fkm/h\n",m_km(m));

                        }
                        else if (to == 3)
                        {
                            printf("\nm/s - miles/h\n");
                            printf("ENTER VALUE IN m/s: ");
                            scanf("%f",&m);
                            printf("\nTHE ANSSWER IS %.2fmiles/h\n",m_ml(m));
                        }
                        
                    }
                    if(from == 3){
                        if(to == 2){
                            printf("\nmiles/h - m/s\n");
                            printf("ENTER VALUE IN miles/h: ");
                            scanf("%f",&ml);
                            printf("\nTHE ANSWER IS %.2fm/s\n",ml_m(ml));

                        }
                        else if (to == 1)
                        {
                            printf("\nmiles/h - km/h\n");
                            printf("ENTER VALUE IN miles/h: ");
                            scanf("%f",&ml);
                            printf("\nTHE ANSSWER IS %.2fkm/h\n",ml_km(ml));
                        }
                        
                    }

                    break;
                }
            }

        break;
        }
        case 7:{
            float mass,height;
            printf("\nBMI(Body Mass Index)\n");
            printf("ENTER MASS IN KILOGRAM: ");
            scanf("%f",&mass);
            printf("\nENTER HEIGHT IN FOOTS: ");
            scanf("%f",&height);
            height=foot_mtr(height);
            float BMI=bmi(mass,height);
            if(BMI >= 16.0 && BMI <=18.5 ){
                printf("%f IS YOUR BMI\n",BMI);
                printf("UNDERWEIGHT | \n:(");
            }
            else if(BMI >18.5 && BMI <=25.0){
                 printf("%f IS YOUR BMI\n",BMI);
                printf("NORMAL WEIGHT ||\n:)");
            }
            else if (BMI > 25.0 && BMI <=40.0)
            {
                 printf("%f IS YOUR BMI\n",BMI);
                printf("OVERWEIGHT ||||\n:(");
            }
            
        }
    default:
        printf("\nRADHE RADHE\nHAVE A NICE DAY");
        break;
    }
    return 0;
}




void addition(){
    printf("\nENTER THE NUMBERS \nIF DONE THEN PRESS 'Y'\n");
            float add,sum = 0;
            char ch;
            int i=1;
            while(1)
            {
                printf("ENTER NUMBER: ");
                scanf("%f",&add);
                sum=sum+add;
                printf("SUM IS %.2f\n",sum);
                scanf("%c",&ch);
                if (ch == 'Y'|| ch=='y')
                {
                    break;
                }
                i++;
            }
            
                
            
}


void substraction(){
    printf("ENTER NUMBERS\nIF DONEEPRRESS 'Y' ");
    float num1,num2,diff;
    int i=1;
    char ch;
    while (1)
    {
        printf("\nENTER NUMBER 1: ");
        scanf("%f",&num1);
        printf("\nENTER NUMBER 2: ");
        scanf("%f",&num2);
        diff=num1-num2;
        printf("%.2f - %.2f = %.2f",num1,num2,diff);
        scanf("%c",&ch);
        if (ch == 'Y' || ch == 'y')
        {
            break;
        }
        i++;
    }
    
    
    
}


void multiplication(){
    float num1,num2,product=1;
    int i=1;
    char ch;
    printf("IF YOU WANT TO EXIT ENTER'Y' / 'y'\n");
    while (1)
    {
        
        printf("\nENTER NUMBER 1: ");
        scanf("%f",&num1);
        printf("\nENTER NUMBER 2: ");
        scanf("%f",&num2);

        product=num1*num2;
        printf("%f * %f = %f\n",num1,num2,product);
        scanf("%c",&ch);
        if (ch == 'y' || ch == 'Y')
        {
            break;
        }
        i++;
    }
    

}


void division(){
    float divt,divr,quosent;
    int i=1;
    char ch;
    while(1){
        printf("\nENTER DIVIDENT: ");
        scanf("%f",&divt);
        printf("\nENTER DIVISOR: ");
        scanf("%f",&divr);
        quosent= divt/divr;
        printf("%f / %f = %f\n",divt,divr,quosent);
        scanf("%c",&ch);
        if (ch == 'y' || ch == 'Y')
        {
            break;
        }
        i++;
    }
}


void modulus(){
    int num1,num2,remainder;
    int i=1;
    char ch;
    printf("IF YOU WANT TO EXIT ENTER 'Y' / 'y'\n");
    while(1){
        printf("\nENTER NUMBER 1(only integer): ");
        scanf("%d",&num1);
        printf("\nENTER NUMBER 2(only integer): ");
        scanf("%d",&num2);
        remainder=num1 % num2;
        if(remainder==0){
            printf("%d is divisible by %d ",num1,num2); 
        }
        else{
            printf("%d is not divisible by %d",num1,num2);
        }
        scanf("%c",&ch);
        if (ch == 'y' || ch == 'Y')
        {
            break;
        }
        
        i++;
    }
}


void _sin(){
    float num;
    printf("\nENTER NUMBER: ");
    scanf("%f",&num);
    printf("sin of %f is %f\n",num,sinf(num));
}


void _cos(){
    float num;
    printf("\nENTER NUMBER: ");
    scanf("%f",&num);
    printf("cos of %f is %f\n",num, cosf(num));
}


void _tan(){
    float num;
    printf("\nENTER NUMBER: ");
    scanf("%f",&num);
    printf("tan of %f is %f\n",num,tanf(num));
    }


void _sec(){
    float num;
    printf("\nENTER NUMBER: ");
    scanf("%f",&num);
    printf("sec of %f is %f\n",num,1/cosf(num));
}


void _cosec(){
    float num;
    printf("\nENTER NUMBER: ");
    scanf("%f",&num);
    printf("cosec of %f is %f\n",num,1/sinf(num));

}


void _cot(){
    float num;
    printf("\nENTER NUMBER: ");
    scanf("%f",&num);
    printf("cot of %f is %f\n",num,1/tanf(num));
}

 
void percentage(){
    float num,sum=0,percentt;
    int i=1,count=0;
    char ch;
    while (1)
    {
        printf("IF DONE BY ENTERING NUMBERS ENTER 'Y'");
        printf("ENTER NUMBERS: \n");
        scanf("%f",&num);
        sum= sum + num;
        count++;
        scanf("%c",&ch);
        if (ch == 'y' || ch == 'Y')
        {
            break;
        }
        
        
        i++;



    }
    count = count*100;
    percentt=(sum/count)*100;
    printf("PERCENTAGE IS %f\n",percentt);
}


void average(){
    float num,sum=0;
    int i=1,count=0;
    char ch;
    while (1)
    {
        printf("ENTER NUMBER (If done enter 'y')");
        scanf("%f",&num);
        sum= sum+num;
        count++;
        scanf("%c",&ch);
        if (ch == 'y'|| ch == 'Y')
        {
            break;
        }
        i++;
    }
    float averagee= (sum/count);
    printf("\nAVERAGE IS %f",averagee);
    
    
}


void even(){
    int num;
    char ch;
    for (int i = 0; 1; i++)
    {
        printf("Enter number: ");
        scanf("%d",&num);
        if(num%2==0){
            printf("\nEVEN NUMBER:)");

        }
        else{
            printf("\nODD NUMBER:)");
        }
        printf("\nif done press 'y'");
        scanf("%c",&ch);
        if(ch=='y'|| ch=='Y'){
            break;
        }
    }
    
}

void prime(){
    int num;
    char ch;
    printf("\nEnter num: ");
    scanf("%d",&num);
    for(int i=2;i<=num/2;i++){
        if(num%i==0){
            printf("\nNot prime number");
        }
        else{
            printf("\nPRIME NUMBER:)");
        }
    }
}

float mtr_cm(float mtr){
    float cm=100*mtr;
    return cm;
}


float mtr_mm(float mtr){
    float mm=1000*mtr;
    return mm;
}


float mtr_inch(float mtr){
    float in=39.3701*mtr;
    return in;
}


float mtr_foot(float mtr){
    float ft=3.28084*mtr;
    return ft;
}


float cm_mtr(float cm){
    float mtr=cm/100;
    return mtr;
}


float cm_mm(float cm){
    float mm=cm/10;
    return mm;
}


float cm_inch(float cm){
    float in=cm/2.54;
    return in;
}


float cm_foot(float cm){
    float ft=cm/30.48;
    return ft;
}


float mm_mtr(float mm){
    float mtr=mm/1000;
    return mtr;
}


float mm_cm(float mm){
    float cm=mm/10;
    return cm;
}


float mm_inch(float mm){
    float in=mm/25.4;
    return in;
}


float mm_foot(float mm){
    float ft=mm/305;
    return ft;
}


float inch_mtr(float in){
    float mtr=in/0.0254;
    return mtr;
}


float inch_cm(float in){
    float cm=in/2.54;
    return cm;
}


float inch_mm(float in){
    float mm=in/25.4;
    return mm;
}


float inch_foot(float in){
    float ft=in/12;
    return ft;
}


float foot_mtr(float ft){
    float mtr=ft*0.30;
    return mtr;
}


float foot_cm(float ft){
    float cm=ft*30.48;
    return cm;
}


float foot_mm(float ft){
    float mm=ft*304.8;
    return mm;
}


float foot_inch(float ft){
    float in=ft/12;
    return in;
}


float bmi(float mass,float mtr){
    float bmi=mass/(mtr*mtr);
    return bmi;
}

float kg_gm(float kg){
    float gm=kg*1000;
    return gm;
}
float kg_lb(float kg){
    float lb=kg*2.2;
    return lb;
}
float gm_kg(float gm){
    float kg=gm/1000;
    return kg;
}
float gm_lb(float gm){
    float lb=gm*0.0022;
    return lb;
}
float lb_kg(float lb){
    float kg=lb/2.2;
    return kg;
}
float lb_gm(float lb){
    float gm=lb/0.0022;
    return gm;
}

float c_k(float c){
    float k=c+273.15;
    return k;
}
float c_f(float c){
    float f=(c*1.8)+32;
    return f;
}
float k_c(float k){
    float c=k-273.15;
    return c;
}
float k_f(float k){
    float f=1.8*(k-273)+32;
    return f;
}
float f_c(float f){
    float c=((f-32)*(5/9));
    return c;
}
float f_k(float f){
    float k=(((f-32)*5)/9)+273;
    return k;
}

float km_m(float km){
    float m=km*(5/18);
    return m;
}


float km_ml(float km){
    float ml=km*0.62137119223733;
    return ml;
}


float m_km(float m){
    float km=(m*3600)/1000;
    return km;
}


float m_ml(float m){
    float ml=m*2.236936;
    return ml;
}
float ml_km(float ml){
    float km=ml*1.6093440006147;
    return km;
}
float ml_m(float ml){
    float m=ml*0.44704;
    return m;
}
