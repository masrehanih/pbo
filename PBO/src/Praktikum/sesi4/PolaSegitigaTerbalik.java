package Praktikum.sesi4;

public class PolaSegitigaTerbalik {
    public static void main(String[] args){
        int tinggi = 5;
        //looping untuk tiap baris
        for (int i = tinggi; i >= 1; i--){
        //looping untuk spasi
        for (int j = 1; j <= tinggi - i; j++){
            System.out.println(" ");
        }
        //looping untuk bintang
        for(int k = 1; k <= (2 * i - 1); k++){
            System.out.println("*");
        }
        //pindah kebaris baru
        System.out.println(); 
    }
}
}