package arraylist;

import java.sql.Array;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Arraylist {
    public static void main(String[] args){
        // syntax for arraylist
        ArrayList<Integer> element = new ArrayList<>(5);  // we can't have primitive classes in <>  it should be Wrapper classes
        element.add(142);
        element.add(87);
        element.add(115);
        element.add(854);
        element.add(152);
        element.add(12);
        element.add(78);
        System.out.println(element.contains(14254));// this function of arraylist basically tells us that the element is availble in the arraylist or not
        System.out.println(element);

        // AraytList function to change the value at the particular index is element.set(index,newElement)
        element.set(0,99);
        System.out.println("ARRAYList after updating is ");
        System.out.println(element);

        // to delete or remove an element from the arraylist we can use element.remove(indexNumber)

        element.remove(0);
        System.out.println("ArrayList after removing 0th index is");
        System.out.println(element);


        // what if we try to remove a index number that is out of range of the ArrayList
        element.remove(10);// let us try to remove 10th index element which is out of range of our ArrayList
        // just because out array is of size 6
        System.out.println("After deleting the element that is beyond the limit of our ArrayList");
        System.out.println(element);


        // we can use the below syntax for printing out elements of ArrayLists
        /*
          the below given for loop is enhanced for loop for this
          for(int elem = 0;elem<element.size();elemm++)
          {
              System.out.println(element.get(elem));
           }
        * */
        for (Integer elem : element) {
            System.out.println(elem);
        }

    }
}
