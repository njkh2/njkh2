package LinearSearchAlgorithm;

import java.util.Arrays;

public class SearchInStrings
{
    public static void main(String[] args){
        String name = "Abhishek";
        char target = 'h';
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(search2(name, target));
    }
    static boolean search(String str,char target){
        // here for checking the length of the aray we dont need 'arr.length()' we need 'arr.length'
        // because here we have taken 'arr.length' as the variable
        // and the 'arr.length()' is a string function where .length() is a string function
        if(str.length()==0)
            return false;
        for(int i=0;i<str.length();i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }


    // search string using for each loop
    static boolean search2(String str, char target){
        if(str.length()==0){
            return false;
        }
        for(char ch : str.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false;
    }
}
