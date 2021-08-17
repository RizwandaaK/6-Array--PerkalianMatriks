/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.array.perkalianmatriks;
import java.util.Scanner;
/**
 *
 * @author rizwa
 */
public class CodinganGua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, j, k, m, n, p, q, jumlah = 0;
        int matriks1[][] = new int[10][10];
        int matriks2[][] = new int[10][10];
        int hasil[][] = new int[10][10];
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Jumlah Baris Matriks A : ");
        m = scan.nextInt();
        System.out.print("Jumlah Kolom Matriks A : ");
        n = scan.nextInt();
        System.out.print("Jumlah Baris Matriks B : ");
        p = scan.nextInt();
        System.out.print("Jumlah Kolom Matriks B : ");
        q = scan.nextInt();
        
        if (n != p) {
            System.out.println("Matriks tidak bisa dikalikan satu sama lain.\n");
        } else {
            System.out.println("Elemen matriks A: ");
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                matriks1[i][j] = scan.nextInt();
            }
        }
            System.out.println("Elemen Matriks B: ");
            for (i = 0; i < p; i++) {
                for (j = 0; j < q; j++) {
                matriks2[i][j] = scan.nextInt();
            }
        }
            for (i = 0; i < m; i++) {
                for (j = 0; j < q; j++) {
                    for (k = 0; k < p; k++) {
                    jumlah = jumlah + matriks1[i][k] * matriks2[k][j];
                }
            hasil[i][j] = jumlah;
            jumlah = 0;
            }
        }
        System.out.println("Hasil perkalian matriks: ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
            System.out.print(hasil[i][j] + "\t");
            }
            System.out.println();
            }
        }
    }
}
