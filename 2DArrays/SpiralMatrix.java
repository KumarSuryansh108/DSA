package Arrays2D;

import java.util.Scanner;

public class spiralmatrix {

    public static void main(String[] args) {
        int n = 4 , m = 4;
        int arr[][] = new int[n][m];
        int startrow = 0;
        int endrow = n - 1;
        int startcol = 0;
        int endcol = m - 1;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter the element : ");
                arr[i][j] = sc.nextInt();
            }
            System.out.println();

        }

        // spiral matrix;
        while(startrow <= endrow && startcol <= endcol){
            // top : row traverse : throught column : j 
            for(int j = startcol ; j <= endcol ; j++){
                
                System.out.print(arr[startrow][j]+" ");
                
            }
            
            // Right : column traverse : through row : i
            for(int i = startrow + 1; i <= endrow ; i++){
                System.out.print(arr[i][endcol]+" ");
                
            }

            // Bottom : row traverse : through column : j
            for(int j = endcol - 1 ; j >= startcol ; j--){
                if(startrow == endrow)
                    break;
                System.out.print(arr[endrow][j]+" ");
            }

            // left : column traverse : through row : i
            for(int i = endrow - 1 ; i>= startrow + 1 ; i--){
                if(startcol == endcol)
                    break;
                System.out.print(arr[i][startcol]+" ");
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }
        System.out.println();
        System.out.println("Matrix : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
        sc.close();
    }
    
}
