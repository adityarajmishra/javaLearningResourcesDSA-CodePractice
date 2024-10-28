import java.util.*;
public class Main {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int c = scanner.nextInt();
        int[][] matrix = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]= scanner.nextInt();
            }
        }
        setZeroes(matrix);
        printMatrix(matrix);

    }
     public static void printMatrix(int[][] matrix){
        StringBuilder sb = new StringBuilder();
        for(int[] arr:matrix){
            StringBuilder sb1 = new StringBuilder();
            for(int n :arr){
                sb1.append(n).append(" ");
            }
            sb.append(sb1.substring(0,sb1.length()-1)+"\n");
        }
        System.out.println(sb.toString());
    }

    public static void setZeroes(int[][] matrix) {
         // write your code here
        int r = matrix.length;
        int c = matrix[0].length;
        boolean[] zeroRows = new boolean[r];
        boolean[] zeroCols = new boolean[c];

        // First pass: Identify all rows and columns that need to be zeroed
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }

        // Second pass: Set identified rows and columns to zero
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (zeroRows[i] || zeroCols[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }


   

   
}

