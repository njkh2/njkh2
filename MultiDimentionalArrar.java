import java.util.Scanner;
import java.util.Arrays;


public class MultiDimentionalArrar
{
    public static void main(String[] args) {
        int[][] matrix = new int[3][3]; // [row][column] here no of column is not mandatory to write while declaration of array
        /* there are three rows in the array
           each row is behaving like a reference variable for an aray
           and that array is basically the elements of the column
           and columns can have any number of elements
           thus this is not mandatory to write no of columns while declaring a array */
        //input the array
        Scanner in = new Scanner(System.in);
        int row,column;
        for(row = 0;row< matrix.length;row++){
            // now for column
            for(column=0; column < matrix[row].length;column++){  // here matrix[row].length means the length of array in a row
                matrix[row][column] = in.nextInt();  // here each row is taken as a array
            }
        }
        System.out.println("MATRIX IS ");
        for(row = 0;row < matrix.length;row++){
            for (column = 0; column< matrix[row].length;column++){
                System.out.print(matrix[row][column]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
