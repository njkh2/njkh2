package StringConcept;

public class Str1 {
    public static void main(String[] args) {
        String name = "Abhisek Gupta";
        // here name is the reference variable in stack memory
        // name is pointing towards the Abhishek Gupta object stored in String pool in heap memory
        // String pool is basically the area or block in heap memory
        // why to use String pool
        // why we cannot put our object directly in our heap
        // all the similar values of strings are not recreated in string pool
        // example if we create an object of type String => "Abhishek"
        // and there are 100 pointing variables in stack so that doesnt means that we have to create 100 objects
        // that 100 pointer variables point to only one variable that is =>"Abhishek"
        // so a question might rise that if we make a change to our object via one variable it might be visible from another variable'
        // so the answer to that is the strings in java are immutable i.e they cannot be changed
        // if you want to make some changes in your string then you have to create the new object
        // suppose we created
        String a = "Abhishek";
        System.out.println(a);
        a  = "Gupta";// here i am not changing the object i am creating a new object
        System.out.println(a);
    }
}
