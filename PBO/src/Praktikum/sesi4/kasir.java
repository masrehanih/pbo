package Praktikum.sesi4;
import java.util.Scanner;
public class kasir {

    public static void main(String[] args){
        //deklarasi variabel dan scanner
        int belanjaan, diskon, bayar;
        String kartu;
        Scanner scan = new Scanner(System.in);
        //mengambil input
        System.out.println("Apakah ada kartu member : ");
        kartu = scan.nextLine();
        System.out.println("Total balenjaan: ");
        belanjaan = scan.nextInt();
        // prosess
        if (kartu.equalsIgnoreCase("ya")){
            if (belanjaan > 500000){
                diskon = 50000;
            } else if (belanjaan > 100000){
                diskon = 15000;
            } else{
                diskon = 0;
            }
        }else{
            if (belanjaan > 100000){
                diskon = 5000;
            }else {
            diskon = 0;    
            }
        }
        // total yang harus dibayarkan
        bayar = belanjaan - diskon;
        //output
        System.out.println("Total bayar : "+bayar);
    }
    
}
