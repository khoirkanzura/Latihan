import java.util.Scanner;
public class MenentukanNilaiMahsiswa {
public static void main(String[] args) {
    
    double absensi, tugas, uts, uas, nilaiakhir;

    Scanner sc = new Scanner(System.in);

    System.out.println("\n MENNETUKAN NILAI AKHIR MAHASISWA");
    System.out.println("\n ---------------------------------------");

    System.out.print(" MASUKAN NILAI ABSENSI : ");
    absensi = sc. nextDouble();

    System.out.print(" MASUKAN NILAI TUGAS : ");
    tugas = sc.nextDouble();

    System.out.print(" MASUKAN NILAI UTS : ");
    uts = sc.nextDouble();

    System.out.print(" MASUKAN NILAI UAS : ");
    uas = sc.nextDouble();

   nilaiakhir = (0.1 * absensi)+(0.2 * tugas)+(0.3 * uts)+(0.4 * uas);
   System.out.println(" -------------------------------------------");

   System.out.println(" NILAI AKHIR : ");

   if (nilaiakhir >= 80) {
        System.out.print(" NILAI HURUF = A");
   }
   else if (nilaiakhir >= 70) {
        System.out.print(" NILAI HURUF = B");
   }
   else if (nilaiakhir >= 60) {
        System.out.print(" NILAI HURUF = C");
   }
   else if (nilaiakhir >= 50) {
        System.out.print(" NILAI HURUF = D");
   }
   else {
        System.out.print(" NILAI HURUF = E");
   }
   sc.close();

}
}
    

