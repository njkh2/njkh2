public class arrays {
    public static void main(String[] args) {
        System.out.println("JAI SHREE RAM");
        // IF WE WANT TO STORE SIMILAR DATATYPES
        // WE CAN USE ARRAYS
        // ARRAYS ARE BASICALLY COLECTION OF SIMILAR DATATYPES
        // SYNTAX FOR ARRAY
        // DATATYPES[] variable_name = new datatype[size];
        // to store 5 roll no's
//        int[] rnos = new int[5];
        // or you can directly write
//        int[] rollno = {12,1,2,3,4,5};

        int[] ros; // declaration of array. ros array of type int is being declared in the stack
        ros = new int[5]; // initialization of array :  actually here object is being created in heap memory
        System.out.println(ros[1]);// for array of integer when not initialized has the value 0
        String[] name = new String[5];
        System.out.println(name[3]);// for array of string when not initiialized has te vaaaue null
        // any reference variable we are going to have it has a default value of null untill we assign it a new value
    }
}
