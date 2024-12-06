import java.util.Scanner;
public class MainMatrix {
    
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

    static void Pertambahan(int matrix1[][], int matrix2[][]) {

    }

    static void Pengurangan(int matrix1[][], int matrix2[][]){

    }

    static void Perkalian(int matrix1[][], int matrix2[][]){

    }

    static void Invers(){

    }

    static void Transpose(int matrix1[][]){
        
    }
}
