package LinearSearchAlgorithm;

public class searchInRange
{
    public static void main(String[] args){
        String str = "Abhishek";
        int start=2,end=6;
        char target = 'i';
        System.out.println(search(str,target,start,end));
    }

    static boolean search(String str, char target, int start, int end) {
        if(str.length()==0)
            return false;
        for(int i = start;i<=end;i++){
            if(str.charAt(i)==target){
                return true;
            }
        }
        return false;
    }
}
