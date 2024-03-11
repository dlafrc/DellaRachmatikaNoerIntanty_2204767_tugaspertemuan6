/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal_3;

import java.util.Scanner;

/**
 *
 * @author DELLA
 */
public class Soal_3 {
public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        // Meminta pengguna untuk memasukkan nilai n
        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();
        // Menampilkan rumus faktorial
        System.out.print(n + "! = ");
        // Memanggil fungsi untuk menghitung faktorial dan menampilkan langkah-langkahnya
        int hasilFaktorial = faktorial(n);
        System.out.println(" = " + hasilFaktorial);
        // Menutup Scanner
        scanner.close();
    }
    // Fungsi untuk menghitung nilai faktorial
    private static int faktorial(int n) {
        // Kasus dasar: 0! = 1
        if (n == 0) {
            System.out.print("1");
            return 1;
        }
        int hasil = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            // Tambahkan tanda perkalian (*) jika belum mencapai nilai terakhir
            if (i < n) {
                System.out.print("*");
            }
            // Hitung faktorial
            hasil *= i;
        }
        return hasil;
    }
}
