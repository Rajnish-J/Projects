package matrix;
import java.util.*;

class matrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // size of the array:
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // declaring two integer matrix:
        int[][] A = new int[size][size];
        int[][] B = new int[size][size];
        // declaring for the result:
        int[][] C = new int[size][size];

        // userinput or initializing
        System.out.print("Enter the first matrix: ");
        for(int i = 0;i<size; i++){
            for(int j = 0; j<size; j++){
                A[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the second matrix: ");
        for(int i = 0;i<size; i++){
            for(int j = 0; j<size; j++){
                B[i][j] = sc.nextInt();
            }
        }

        // adding two matrix:
        for(int i = 0;i<size; i++){
            for(int j = 0; j<size; j++){
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        //showing output:
        for(int i = 0; i<size; i++){
            for(int j = 0; j<size; j++){
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}