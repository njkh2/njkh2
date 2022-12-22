package LinearSearchAlgorithm;

public class linearSearch
{
    public static void main(String[] args){
        int[] arr = { 11,12,13,14,15,16,17,0,18,19,120};
        int target = 18;
        System.out.println(linear3(arr, target ));
    }


    static int linear(int[] arr, int target) {
        // here for checking the length of the aray we dont need 'arr.length()' we need 'arr.length'
        // because here we have taken 'arr.length' as the variable
        // and the 'arr.length()' is a string function where .length() is a string function
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
            {
                return i;
            }
        }

        if(arr.length==0) {
            return -1;
        }
        // this line will execute if none of the above return statement works
        // hence the target not found
        return -1;
    }




    // now instead of returning the index we can return the element itself
    static int linear2(int[] arr,int n){
        if(arr.length==0){
            return Integer.MAX_VALUE;

        }
        for(int Element : arr){
            if(Element == n )
                return Element;
        }
        // this statement will execute if all the above return statement i false
        return Integer.MAX_VALUE;
    }

    // in this case we are going to return true or false
    static boolean linear3(int[] arr, int target){
        if (arr.length==0)
            return false;
        for(int Element : arr){
            if(Element == target)
                return true;
        }
        // if all the above returns does not work then this return will work
        return false;
    }
}
