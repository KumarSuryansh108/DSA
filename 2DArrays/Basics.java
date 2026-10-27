package Arrays2D;

import java.util.Scanner;

public class Arrays2D {
    // searching an elements in a matrix 
    public static void search(int arr[][], int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == key){
                    System.out.println("Key found at index : " + "("+i+","+j+")");
                }
                
            }
            System.out.println();

        }
        
    }

    // array ka 2d version usko ham matrix ya phir 2d martrix kehte hai

    public static void main(String[] args) {
        int r = 3, c = 3;
        // creation of 2d arrays
        int matrix[][] = new int[r][c];
        Scanner sc = new Scanner(System.in);
        // taking input in 2d array
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter the element : ");
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();

        }
        // printing the array
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }

        search(matrix, 35);

        sc.close();
    }

}
