package Praktikum.sesi4;
import java.util.Scanner;
import javax.print.DocFlavor.STRING;
//PROGRAM WITCH
public class LampuLaluLintas {

    public static void main(String[] args){
        //membuat variable dan scanner
    String lampu;
    Scanner scan = new Scanner(System.in);
    //mengambil input
    System.out.print(" inputkan nama warna : ");
    lampu = scan.nextLine();

    switch (lampu){
        case "merah":
                System.out.println("Lampu merah, berhenti");
                break;
        case "kuning":
                System.out.println(" Lampu kuning, harap hati hati!!");
                break;
        case "hijau":
                System.out.println("lampu hijau, jalann");
                break;
            default:
            System.out.println("warna lampu salah");
    }

    }
    
}
