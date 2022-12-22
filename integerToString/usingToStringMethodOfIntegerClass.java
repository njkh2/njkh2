package integerToString;

public class usingToStringMethodOfIntegerClass {
    public static void main(String[] args){
        /*The Integer class has a static method that returns a String
        object representing the specified int parameter.
        The argument is converted and returned as a string instance.
        If the number is negative, the sign will be preserved.
         */
        int num1 =1234;
        int num2 = -1234;
        String str1 = Integer.toString(num1);
        String str2 = Integer.toString(num2);
        System.out.println("string 1 = "+str1);
        System.out.println("string 2 = "+str2);

    }
}
