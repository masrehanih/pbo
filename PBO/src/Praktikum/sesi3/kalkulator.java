package Praktikum.sesi3; // Menentukan paket untuk kelas ini

import java.util.Scanner; // Mengimpor kelas Scanner dari paket java.util

public class kalkulator {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner input = new Scanner(System.in);
        int pilihan; // Variabel untuk menyimpan pilihan operasi
        boolean lanjut = true; // Variabel untuk mengontrol loop agar program tetap berjalan

        // Loop utama untuk menjalankan kalkulator hingga pengguna memilih untuk keluar
        while (lanjut) {
            // Menampilkan menu operasi yang tersedia
            System.out.println("\nPILIH OPERASI: ");
            System.out.println("1. PENJUMLAHAN");
            System.out.println("2. PENGURANGAN");
            System.out.println("3. PEMBAGIAN");
            System.out.println("4. PERKALIAN");
            System.out.println("5. KELUAR");
            System.out.print("MASUKKAN PILIHAN (1/2/3/4/5): ");
            pilihan = input.nextInt(); // Membaca pilihan pengguna

            // Memeriksa apakah pengguna ingin keluar dari program
            if (pilihan == 5) {
                System.out.println("TERIMA KASIH! PROGRAM DIHENTIKAN.");
                lanjut = false; // Mengubah kondisi loop menjadi false untuk keluar
                continue; // Melanjutkan ke iterasi berikutnya
            }

            // Meminta input bilangan dari pengguna berdasarkan pilihan yang dipilih
            System.out.print("MASUKKAN BILANGAN 1: ");
            double bilangan1 = input.nextDouble(); // Membaca bilangan pertama
            System.out.print("MASUKKAN BILANGAN 2: ");
            double bilangan2 = input.nextDouble(); // Membaca bilangan kedua
            double hasil; // Variabel untuk menyimpan hasil operasi

            // Melakukan operasi matematika berdasarkan pilihan pengguna
            switch (pilihan) {
                case 1: // Penjumlahan
                    hasil = bilangan1 + bilangan2; // Menghitung hasil penjumlahan
                    System.out.println("HASIL PENJUMLAHAN: " + bilangan1 + " + " + bilangan2 + " = " + hasil);
                    break; // Mengakhiri case
                case 2: // Pengurangan
                    hasil = bilangan1 - bilangan2; // Menghitung hasil pengurangan
                    System.out.println("HASIL PENGURANGAN: " + bilangan1 + " - " + bilangan2 + " = " + hasil);
                    break; // Mengakhiri case
                case 3: // Pembagian
                    if (bilangan2 != 0) { // Memeriksa apakah bilangan kedua bukan nol
                        hasil = bilangan1 / bilangan2; // Menghitung hasil pembagian
                        System.out.println("HASIL PEMBAGIAN: " + bilangan1 + " / " + bilangan2 + " = " + hasil);
                    } else {
                        System.out.println("ERROR: PEMBAGIAN DENGAN NOL TIDAK DIPERBOLEHKAN."); // Pesan error jika pembagian dengan nol
                    }
                    break; // Mengakhiri case
                case 4: // Perkalian
                    hasil = bilangan1 * bilangan2; // Menghitung hasil perkalian
                    System.out.println("HASIL PERKALIAN: " + bilangan1 + " * " + bilangan2 + " = " + hasil);
                    break; // Mengakhiri case
                default: // Jika pilihan tidak valid
                    System.out.println("PILIHAN TIDAK VALID. SILAHKAN COBA LAGI."); // Pesan untuk pilihan tidak valid
                    break; // Mengakhiri case
            }
        }
        // Menutup Scanner untuk membebaskan sumber daya
        input.close();
    }
}
