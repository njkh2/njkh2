package StringConcept;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+ 'b');// this will add the ASCII value of both and print it
        System.out.println("a" + "b");// this will concatinate the string print ab
        System.out.println((char)('a'+3));// this will add 3 to ASCII of 'a' and return 'd'
        System.out.println("a" + 1);// it will convert 1 into string and concatinate with a and print a1
        // this will same as after a few steps : "a" + "1"
        // NOTE: when a integer is concatinated it is converted in its wrapper class
        // integer is converted into Integer that will call toString


        System.out.println("Abhishek" + new ArrayList<>());
        System.out.println("Abhishek" + new Integer(56));
//        System.out.println(new Integer(56) + new ArrayList<>());// error
        // so basically it means that operator + is valid when at least one of the operand should be string
        // + in java you can only use in primitive
        // you can also usse it with all the complex objects as well but the only condition is atleast one of this object should be of type string

        System.out.println(new Integer(56) +""+ new ArrayList<>());
//        System.out.println("a" - "b");// error
        // this is giving me an error that means that '-' operator will only work for primitive only
        // and not for strings



        // here we can add 2 strings using + operator this is known as operator overloading
        // or operator functionality

    }
}
