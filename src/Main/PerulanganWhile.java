package Main;

import java.util.Scanner;
// cek perubahan
public class PerulanganWhile {
    public static void main(String[] args) {
// membuat variabel dan scanner
        boolean running = true;
        int counter = 0;
        String jawab;
        Scanner scan = new Scanner(System.in);
        while( running ) {
            System.out.println("Apakah anda ingin keluar?");
            System.out.print("Jawab [ya/tidak]> ");
            jawab = scan.nextLine();
// cek jawabnnya, kalau ya maka berhenti mengulang
            if (jawab.equalsIgnoreCase("ya")) {
            }
            counter++;
        }
        System.out.println("Anda sudah melakukan perulangan sebanyak "
                + counter + " kali");
    }
}
