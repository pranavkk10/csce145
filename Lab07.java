//Pranav Kanumuri 
import java.util.Scanner;
public class Lab07 {
    public static void main(String[] args) {
        int rows1, columns1, rows2, columns2;
        Scanner in = new Scanner(System.in);
        
        //validate the users input
        System.out.println("Input the values of the matrices so that they are equal in dimension.");
        while(true){
            System.out.println("Give me the number of rows in the first matrix:");
            rows1 = in.nextInt();
            System.out.println("Give me the number of columns in the first matrix:");
            columns1 = in.nextInt();
            System.out.println("Give me the number of rows in the second matrix:");
            rows2 = in.nextInt();
            System.out.println("Give me the number of columns in the second matrix:");
            columns2 = in.nextInt();
            if((rows1 == rows2) && (columns1 == columns2)){
                break;
            }
            System.out.println("Your values are not the same, please input the values of the matrices so that they are equal in dimension.");
        }

        //initialize matrices
        int[][] matrix1 = new int[rows1][columns1];
        int[][] matrix2 = new int[rows2][columns2];
        
        //ask for user input for matricies based on rows and columns
        for (int x = 0; x < rows1; x++){
            System.out.println("Give me " + columns1 + " number(s) for row " + (x + 1) + " for matrix 1: ");
            for(int y = 0; y < columns1; y++){
                matrix1[x][y] = in.nextInt();
            }
        }
        for (int x = 0; x < rows2; x++){
            System.out.println("Give me " + columns2 + " number(s) for row " + (x + 1) + " for matrix 2:");
            for(int y = 0; y < columns2; y++){
                matrix2[x][y] = in.nextInt();
            }
        }

        //add the matricies together and print them out
        for (int x = 0; x < rows2; x++){
            for(int y = 0; y < columns2; y++){
                matrix2[x][y] = matrix1[x][y] + matrix2[x][y];
                System.out.print(matrix2[x][y] + " ");
            }
            System.out.println("");
        }
    }
}
