package arraylist;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;



public class inputArrayList
{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<> (5);
        Scanner in = new Scanner(System.in);
        System.out.println(" ENTER THE SIZE OF ARRAY ");
        int size = in.nextInt();
        // to take elmments of ArrayList from user we hvave to make a loop till the size of the array and then we have put in.nextDataType() in the list.add()
        for(int i=0 ;i< size;i++){
            list.add(in.nextInt());
        }
        System.out.println("ENTERED ARRAYLIST IS ");
        // to get item at given index we have to list.get(index);
        // we cannot do something like this [index]
        for(int i= 0;i<size;i++){
            System.out.print(list.get(i)+"  ");
        }
    }
}
