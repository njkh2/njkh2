package StringConcept;

public class StrComparision {
    public static void main(String[] args){
        System.out.println("Jai Shree Ram");
        String a = "Abhishek";
        String b = "Abhishek";
        System.out.println(a == b);
        // here we are comparing the two strings having the same object Abhishek
        // Now the question is that how to find that the object for both the pointing variable is same object or different
        // to do so if  str1 == str2 returns true
        // this means that there is only ne object in string pool to which the variable is pointing
        // and if str1 == str2 returns false
        // means both str1 ans str2 are pointing to different variables


        // to make different objects having same value
        // we use new keyboard
        String str1 = new String("Abhishek");
        String str2 = new String("Abhishek");
        System.out.println(str1==str2);// this will give us false
        // As we are creating two different String object though they have same value
        // they are stored outside the stringpool in heap memory


        // if we want to check the value of the string use .equals  method
        System.out.println(str1.equals(str2));


        // to obtain a character from sring we use .charAt(index) method
        System.out.println(str1.charAt(0));
    }
}
