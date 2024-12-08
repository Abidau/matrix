import java.util.Scanner;
public class MainMatrix {

    static double[][] hasil = null;
    static Scanner sc = new Scanner(System.in);
    static int baris1, kolom1, baris2, kolom2;

    public static void main(String[] args) {
            
        while (true) {
            System.out.println("===== Opsi =====");
            System.out.println("1. Pertambahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Invers");
            System.out.println("5. Transpose");
            System.out.println("6. Keluar");
    
            System.out.print("Masukkan pilihan : ");
            int opsi = sc.nextInt();
            System.out.println();
            
            if (opsi == 6) {
                System.out.println("Program selesai.");
                return;
            }
            
            System.out.println("Masukkan matrix 1");
            System.out.print("Masukkan baris : ");
            baris1 = sc.nextInt();
            System.out.print("Masukkan kolom : ");
            kolom1 = sc.nextInt();
            System.out.println();
            
            if (opsi == 1 || opsi == 2 || opsi == 3) {
                System.out.println("Masukkan matrix 2");
                System.out.print("Masukkan baris : ");
                baris2 = sc.nextInt();
                System.out.print("Masukkan kolom : ");
                kolom2 = sc.nextInt();
                System.out.println();
            }
            
            double[][] matrix1 = new double[baris1][kolom1];
            double[][] matrix2 = new double[baris2][kolom2];

            if (opsi == 1) {
                Pertambahan(matrix1, matrix2);
            } else if (opsi == 2) {
                Pengurangan(matrix1, matrix2);
            } else if (opsi == 3) {
                Perkalian(matrix1, matrix2);
            } else if (opsi == 4) {
                Invers(matrix1);
            } else if (opsi == 5) {
                Transpose(matrix1);
            } 
        }
    }

    static void Pertambahan(double matrix1[][], double matrix2[][]) {
        System.out.println("tambah");
    }
    
    static void Pengurangan(double matrix1[][], double matrix2[][]){
        System.out.println("kurang");
    }
    
    static void Perkalian(double matrix1[][], double matrix2[][]){
       
        System.out.println("Masukkan angka matrix 1");
        for (int i = 0; i < baris1; i++) {
            for (int j = 0; j < kolom1; j++) {
                System.out.print("matrix 1 ["+ i +"]["+ j +"] : ");
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println();
    
        System.out.println("Masukkan angka matrix 2");
        for (int i = 0; i < baris2; i++) {
            for (int j = 0; j < kolom2; j++) {
                System.out.print("matrix 2 [" + i + "][" + j + "] : ");
                matrix2[i][j] = sc.nextInt();
            }
        } 
        System.out.println();

        if (kolom1 == baris2) {
            hasil = new double[baris1][kolom2];
            for (int i = 0; i < baris1; i++) {
                for (int j = 0; j < kolom2; j++) {
                    hasil[i][j] = 0;
                    for (int k = 0; k < kolom1; k++) {
                        hasil[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
        } else {
            System.out.println("Operasi tidak valid untuk ukuran matrix yang diberikan.");
        }

        System.out.println("Matrix 1 : ");
        for (int i = 0; i < baris1; i++) {
            for (int j = 0; j < kolom1; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matrix 2 : ");
        for (int i = 0; i < baris2; i++) {
            for (int j = 0; j < kolom2; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Hasil Perkalian : ");
        for (int i = 0; i < baris1; i++) {
            for (int j = 0; j < kolom2; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    static void Invers(double matrix1[][]){
        if (!((baris1 == 2 && kolom1 == 2) || (baris1 == 3 && kolom1 == 3))) {
            System.out.println("Input tidak valid.");
            return;
        }

        double[][] matrix2 = new double[baris1][baris1];
        double det = 0;

        for (int i = 0; i < baris1; i++) {
            for (int j = 0; j < baris1; j++) {
                System.out.printf("Matrix [%d][%d]: ", i, j);
                matrix1[i][j] = sc.nextDouble();
            }
        }
        if (baris1 == 3) {
            int loop = 0, toMinus = 0, i = 0, j = 1, k = 2; 
            // DETERMINAN
            while (toMinus < 2) {
                while (loop < baris1) {
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
            if (det == 0) {
                System.out.println("Determinannya 0, matriks tidak mempunyai invers");
                System.out.println();
                return;
            }

            // KOFAKTOR & TRANSPOS (ADJ)
            int isMinus = 1, c = 1, d = 2;
            for (i = 0; i < baris1; i++) {
                int a = 1, b = 2;
                for (j = 0; j < baris1; j++) {
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
            System.out.println("Hasil invers: ");
            for (i = 0; i < baris1; i++) {
                for (j = 0; j < baris1; j++) {
                    matrix2[i][j] *= ((1/det));
                    System.out.print(matrix2[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        } else if (baris1 == 2) {
            // DETERMINAN
            det = (matrix1[0][0] * matrix1[1][1]) - (matrix1[0][1] * matrix1[1][0]);
            if (det == 0) {
                System.out.println("Determinannya 0, matrix tidak mempunyai invers");
                System.out.println();
                return;
            }
            // ADJ
            matrix2[0][0] = matrix1[1][1];
            matrix2[0][1] = matrix1[0][1] * -1;
            matrix2[1][0] = matrix1[1][0] * -1;
            matrix2[1][1] = matrix1[0][0];
            // INVERS
            System.out.println("Hasil invers: ");
            for (int i = 0; i < baris1; i++) {
                for (int j = 0; j < baris1; j++) {
                    matrix2[i][j] *= (1/det);
                    System.out.print(matrix2[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    
    static void Transpose(double matrix1[][]){
        
        for (int i = 0; i < baris1; i++) {
            for (int j = 0; j < kolom1; j++) {
                System.out.print("matrix 1 ["+ i +"]["+ j +"] : ");
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        double[][] transpose = new double[kolom1][baris1];
        for (int i = 0; i < baris1; i++) {
            for (int j = 0; j < kolom1; j++) {
                transpose[j][i] = matrix1[i][j];
            }
        }

        System.out.println("Matrix ");
        for (int i = 0; i < baris1; i++) {
            System.out.print("| ");
            for (int j = 0; j < kolom1; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.print("| ");
            System.out.println();
        }
        System.out.println();

        System.out.println("Hasil Transpose : ");
        for (int i = 0; i < kolom1; i++) {
            System.out.print("| ");
            for (int j = 0; j < baris1; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.print("| ");
            System.out.println();
        }
    }
}