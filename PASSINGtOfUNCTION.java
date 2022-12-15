import java.util.Arrays;
import java.util.Scanner;

public class PASSINGtOfUNCTION
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = new String[6];
        System.out.println("WRITE THE NAMES : ");
        int i;
        for(i=0;i<6;i++){
            names[i]= input.next();
        }
        change(names);
        System.out.println(Arrays.toString(names));

    }
    static void change(String[] names){
        names[0] = "ABHISHEK GUPTA ";
    }
}
