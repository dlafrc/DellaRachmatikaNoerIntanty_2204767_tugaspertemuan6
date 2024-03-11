/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal_2;

import java.util.Scanner;

/**
 *
 * @author DELLA
 */
public class Soal_2 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan batas awal: ");
        int batasAwal = input.nextInt();

        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = input.nextInt();

        if (batasAwal <= batasAkhir) {
            int jumlahBilanganGanjil = BilanganGanjil(batasAwal, batasAkhir);
            System.out.println("Banyaknya bilangan ganjil dari " + batasAwal + " sampai " + batasAkhir + ": " + jumlahBilanganGanjil);
        } else {
            System.out.println("Masukkan batasAwal yang lebih kecil atau sama dengan batasAkhir.");
        }

        input.close();
    }

    // Method untuk menghitung dan menampilkan banyaknya bilangan ganjil dari batasAwal ke batasAkhir
    public static int BilanganGanjil(int batasAwal, int batasAkhir) {
        int jumlahBilanganGanjil = 0;

        System.out.print("Bilangan ganjil: ");

        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 != 0) {
                jumlahBilanganGanjil++;
                System.out.print(i + " ");
            }
        }

        System.out.println(); // Pindahkan ke baris baru setelah mencetak bilangan ganjil
        return jumlahBilanganGanjil;
    }
}
