import java.util.Scanner;
public class Nopal {

    static int [][] hasil = null;
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
            
            System.out.println("Masukkan matrix 2");
            System.out.print("Masukkan baris : ");
            baris2 = sc.nextInt();
            System.out.print("Masukkan kolom : ");
            kolom2 = sc.nextInt();
            System.out.println();

            int[][] matrix1 = new int[baris1][kolom1];
            int[][] matrix2 = new int[baris2][kolom2];
            

            if (opsi == 1) {
                Pertambahan(matrix1, matrix2);
            } else if (opsi == 2) {
                Pengurangan(matrix1, matrix2);
            } else if (opsi == 3) {
                Perkalian(matrix1, matrix2);
            } else if (opsi == 4) {
                Invers();
            } else if (opsi == 5) {
                Transpose(matrix1);
            } 
        }
    }

    public static void Pertambahan(int matrix1[][], int matrix2[][]) {

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

        if ((baris1 == baris2) && (kolom1 == kolom2)) {
            hasil = new int[baris1][kolom1];
            for (int i = 0; i < baris1; i++) {
                for (int j = 0; j < kolom1; j++) {
                    hasil [i][j] = 0;
                    hasil[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
        } else {
            System.out.println("Operasi tidak valid untuk ukuran matrix yang diberikan.");
        }

        System.out.println("Hasil pertambahan : ");
        for (int i = 0; i < baris1; i++) {
            System.out.print("| ");
            for (int j = 0; j < kolom1; j++) {
                System.out.print(matrix1[i][j] + " ");
            } if (baris1 == baris2 && kolom1 == kolom2) {
                if (i ==  1) {
                    System.out.print("| + ");
                } else {
                    System.out.print("|   ");
                }
                System.out.print("| ");
                for (int j = 0; j < kolom2; j++) {
                    System.out.print(matrix2[i][j] + " ");
                } if (baris1 == baris2 && kolom1 == kolom2) {
                    if (i ==  1) {
                        System.out.print("| = ");
                    } else {
                        System.out.print("|   ");
                    }
                    System.out.print("| ");
                    for (int j = 0; j < kolom1; j++) {
                        System.out.print(hasil[i][j] + " ");
                } if (baris1 == baris2 && kolom1 == kolom2) {
                    if (i ==  1) {
                        System.out.print("| ");
                } else {
                    System.out.print("| ");
                }
                  System.out.println();  
                }      
                }
            }
        }
        System.out.println();
    }
    
    static void Pengurangan(int matrix1[][], int matrix2[][]) {

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

        if ((baris1 == baris2) && (kolom1 == kolom2)) {
            hasil = new int[baris1][kolom1];
            for (int i = 0; i < baris1; i++) {
                for (int j = 0; j < kolom1; j++) {
                    hasil [i][j] = 0;
                    hasil[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
        } else {
            System.out.println("Operasi tidak valid untuk ukuran matrix yang diberikan.");
        }

        System.out.println("Hasil Pengurangan : ");
        for (int i = 0; i < baris1; i++) {
            System.out.print("| ");
            for (int j = 0; j < kolom1; j++) {
                System.out.print(matrix1[i][j] + " ");
            } if (baris1 == baris2 && kolom1 == kolom2) {
                if (i ==  1) {
                    System.out.print("| - ");
                } else {
                    System.out.print("|   ");
                }
                System.out.print("| ");
                for (int j = 0; j < kolom2; j++) {
                    System.out.print(matrix2[i][j] + " ");
                } if (baris1 == baris2 && kolom1 == kolom2) {
                    if (i ==  1) {
                        System.out.print("| = ");
                    } else {
                        System.out.print("|   ");
                    }
                    System.out.print("| ");
                    for (int j = 0; j < kolom1; j++) {
                        System.out.print(hasil[i][j] + " ");
                } if (baris1 == baris2 && kolom1 == kolom2) {
                    if (i ==  1) {
                        System.out.print("| ");
                } else {
                    System.out.print("| ");
                }
                  System.out.println();  
                }      
                }
            }
        }
        System.out.println();
    }
    
    static void Perkalian(int matrix1[][], int matrix2[][]) {

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
            hasil = new int[baris1][kolom2];
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
    
    static void Invers() {
        
        System.out.println("Masukkan matrix 1");
        System.out.print("Masukkan baris : ");
        int baris1 = sc.nextInt();
        System.out.print("Masukkan kolom : ");
        int kolom1 = sc.nextInt();
        System.out.println();
    
        System.out.println("Masukkan matrix 2");
        System.out.print("Masukkan baris : ");
        int baris2 = sc.nextInt();
        System.out.print("Masukkan kolom : ");
        int kolom2 = sc.nextInt();
        System.out.println();

        int[][] matrix1 = new int[baris1][kolom1];
        System.out.println("Masukkan angka matrix 1");
        for (int i = 0; i < baris1; i++) {
            for (int j = 0; j < kolom1; j++) {
                System.out.print("matrix 1 ["+ i +"]["+ j +"] : ");
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println();
    
        int[][] matrix2 = new int[baris2][kolom2];
        System.out.println("Masukkan angka matrix 2");
        for (int i = 0; i < baris2; i++) {
            for (int j = 0; j < kolom2; j++) {
                System.out.print("matrix 2 [" + i + "][" + j + "] : ");
                matrix2[i][j] = sc.nextInt();
            }
        } 
        System.out.println();

       //cara

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

        System.out.println("Hasil Invers : ");
        
    }
    
    static void Transpose(int matrix1[][]) {
        
        System.out.println("Masukkan matrix");
        System.out.print("Masukkan baris : ");
        int baris1 = sc.nextInt();
        System.out.print("Masukkan kolom : ");
        int kolom1 = sc.nextInt();
        System.out.println();

        System.out.println("Masukkan angka matrix 1");
        for (int i = 0; i < baris1; i++) {
            for (int j = 0; j < kolom1; j++) {
                System.out.print("matrix 1 ["+ i +"]["+ j +"] : ");
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        int[][] transpose = new int[kolom1][baris1];
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
