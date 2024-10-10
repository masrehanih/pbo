package Praktikum.sesi4.tugas20230801166RaihanFadhliRamadhan;
import java.util.Scanner;
public class PerulanganDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        double totalHarga = 0;

        System.out.println("=== Menu Jual Nasi ===");

        // Menggunakan perulangan do while
        do {
            System.out.println("1. Nasi Goreng - Rp 15.000");
            System.out.println("2. Nasi Campur - Rp 20.000");
            System.out.println("3. Nasi Putih - Rp 10.000");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = scanner.nextInt();

            if (pilihan == 4) {
                break; // Keluar dari loop jika memilih opsi 4
            }

            if (pilihan >= 1 && pilihan <= 3) {
                System.out.print("Jumlah porsi: ");
                int jumlah = scanner.nextInt();
                double harga = 0;

                switch (pilihan) {
                    case 1:
                        harga = 15000;
                        System.out.println("Anda memilih Nasi Goreng.");
                        break;
                    case 2:
                        harga = 20000;
                        System.out.println("Anda memilih Nasi Campur.");
                        break;
                    case 3:
                        harga = 10000;
                        System.out.println("Anda memilih Nasi Putih.");
                        break;
                }

                totalHarga += harga * jumlah;
                System.out.println("Total harga untuk " + jumlah + " porsi: Rp " + (harga * jumlah));
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 4); // Ulangi sampai pengguna memilih untuk keluar

        System.out.println("Total harga keseluruhan: Rp " + totalHarga);
        System.out.println("Terima kasih telah berbelanja!");
        scanner.close();
    }
}
