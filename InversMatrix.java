import java.util.Scanner;
public class InversMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan ordo (2 atau 3): ");
        int ordo = sc.nextInt();
        
        double det = 0;
        double[][] matrix1 = new double[ordo][ordo]; // matrix input
        double[][] matrix2 = new double[ordo][ordo]; // matrix hasil invers

        for (int i = 0; i < ordo; i++) {
            for (int j = 0; j < ordo; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        int loop = 0, toMinus = 0, i = 0, j = 1, k = 2; 
        
        if (ordo == 3) {
            // DETERMINAN
            while (toMinus < 2) {
                while (loop < ordo) {
                    if (toMinus == 0) {
                        det += (matrix1[0][i] * matrix1[1][j] * matrix1[2][k]);     
                    } else {
                        det -= (matrix1[0][i] * matrix1[1][j] * matrix1[2][k]);
                    }
                    i++;   
                    j++;  
                    k++;
                    loop++;
                    if (i == 3) i = 0;
                    if (j == 3) j = 0;
                    if (k == 3) k = 0;
                }
                toMinus++;
                i = 2; 
                j = 1; 
                k = 0;
                loop = 0;
            }
            // KOFAKTOR & TRANSPOS (ADJ)
            int isMinus = 1, c = 1, d = 2;
            for (i = 0; i < ordo; i++) {
                int a = 1, b = 2;
                for (j = 0; j < ordo; j++) {
                    matrix2[j][i] = matrix1[d][a] * matrix1[c][b] - matrix1[d][b] * matrix1[c][a];
                    if (isMinus % 2 != 0) matrix2[j][i] *= -1;
                    if (a == 0) b--;
                    if (b == 2) a--;
                    isMinus++;
                }
                if (c == 0) d--;
                if (d == 2) c--;
            }
            // INVERS
            for (i = 0; i < ordo; i++) {
                for (j = 0; j < ordo; j++) {
                    matrix2[i][j] *= ((1/det));
                    System.out.print(matrix2[i][j] + " ");
                }
                System.out.println();
            }
              
        } else if (ordo == 2) {
            // DETERMINAN
            det = (matrix1[0][0] * matrix1[1][1]) - (matrix1[0][1] * matrix1[1][0]);
            // ADJ
            matrix2[0][0] = matrix1[1][1];
            matrix2[0][1] = matrix1[0][1] * -1;
            matrix2[1][0] = matrix1[1][0] * -1;
            matrix2[1][1] = matrix1[0][0];
            // INVERS
            for (i = 0; i < ordo; i++) {
                for (j = 0; j < ordo; j++) {
                    matrix2[i][j] *= (1/det);
                    System.out.print(matrix2[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}