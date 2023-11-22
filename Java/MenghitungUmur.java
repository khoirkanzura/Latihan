import java.util.Scanner;

import javax.sound.midi.Soundbank;
public class MenghitungUmur {
    public static void main(String[] args) {
        
        int tanggal, bulan, tahun, thn, bln, hari, a, b, c;
        int jawab;

        Scanner sc = new Scanner (System.in);

        System.out.println(" MENGHITUNG UMUR ");
        System.out.println(" -----------------------");

        do {
            System.out.print(" TANGGAL LAHIR ANDA : ");
            tanggal = sc.nextInt();

            System.out.print(" BULAN LAHIR ANDA : ");
            bulan = sc.nextInt();

            System.out.print(" TAHUN LAHIR ANDA : ");
            tahun = sc.nextInt();

            System.out.print(" TANGGAL HARI INI : ");
            hari = sc.nextInt();

            System.out.print(" BULAN SEKARANG : ");
            bln = sc.nextInt();

            System.out.print(" TAHUN SEKARANG : ");
            thn = sc.nextInt();

            a=(hari-tanggal);
            b=(bln-bulan);
            c=(thn-tahun);

            System.out.print( " UMUR ANDA ADALAH %d TAHUN %d BULAN %d HARI\n, c, b, a");
            System.out.print(" ANDA INGIN COBA LAGI ? [Y/T] :  ");
            jawab = sc.nextInt();
        }

        while (jawab=='y'||jawab=='Y');

        sc.close();
    } 
}
