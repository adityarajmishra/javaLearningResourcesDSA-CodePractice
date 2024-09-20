import java.util.*;

public class Main
{
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat= new int[n][m];
        for(int i =0 ;i<n ;i++){
           for(int j=0;j<m;j++){
              mat[i][j] = sc.nextInt();
            }
        }
       
        solve(mat,n,m);
           
    }
    
    public static void solve(int[][] mat, int n, int m){           
    // write the missing code here  
        // Traverse the first row
        for (int j = 0; j < m; j++) {
            System.out.print(mat[0][j] + " ");
        }

        // Traverse the last column, except the first element
        for (int i = 1; i < n; i++) {
            System.out.print(mat[i][m - 1] + " ");
        }

        // Traverse the last row, except the last element (if there's more than one row)
        if (n > 1) {
            for (int j = m - 2; j >= 0; j--) {
                System.out.print(mat[n - 1][j] + " ");
            }
        }

        // Traverse the first column, except the first and last elements (if there's more than one column)
        if (m > 1) {
            for (int i = n - 2; i > 0; i--) {
                System.out.print(mat[i][0] + " ");
            }
        }
    }
}
