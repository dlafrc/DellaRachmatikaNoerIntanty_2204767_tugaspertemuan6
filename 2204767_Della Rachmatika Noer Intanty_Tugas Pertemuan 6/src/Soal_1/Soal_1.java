/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal_1;

import java.util.Scanner;

/** *
 * @author DELLA
 */
public class Soal_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = scanner.nextInt();

        penjumlahanDeret(N);
    }

    // Method untuk menghitung dan menampilkan penjumlahan deret
    public static void penjumlahanDeret(int N) {
        int hasil = 0;
        System.out.print("n=" + N + " --> ");

        for (int i = 1; i <= N; i++) {
            hasil += i;

            // Cetak setiap elemen deret
            System.out.print(i);

            // Tambahkan tanda + jika bukan elemen terakhir
            if (i < N) {
                System.out.print("+");
            }
        }
        System.out.println(" = " + hasil);
    }
}
