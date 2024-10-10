package Praktikum.sesi4;

import java.util.Scanner;
//program if dengan dua kondisi
public class CekKelulusan{
    public static void main(String[]args){
        //membuat variable dan scanner
        int nilai;
        String nama;
        Scanner scan = new Scanner(System.in);
        //mengambil input
        System.out.print("nama : "); nama = scan.nextLine();
        System.out.print("nilai : "); nilai = scan.nextInt();
        //cek apkah dia lulus atau tidak
        if (nilai >= 70){
            System.out.println("selamat " +nama + ", anda lulus");
        } else {
            System.out.println("maaf " + nama + ", anda gagal");
        }
    }
}