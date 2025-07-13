import java.util.Scanner;

public class MenghitungTarifMobil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int harga = 0, jamberikutnya = 0;
        int lama, jenis, tambahan = 0;

        System.out.println(" MENGHITUNG TARIF PARKIR ");
        System.out.println(" ------------------------");
        System.out.println(" 1. Mobil ");
        System.out.println(" 2. Motor ");
        System.out.print(" Masukkan Jenis Kendaraan (1/2): ");
        jenis = sc.nextInt();

        switch (jenis) {
            case 1:
                harga = 3000;
                tambahan = 1000;
                break;
            case 2:
                harga = 2000;
                tambahan = 500;
                break;
            default:
                System.out.println("Jenis kendaraan tidak valid!");
                sc.close();
                return;
        }

        System.out.print(" Masukkan Lama Parkir (Jam): ");
        lama = sc.nextInt();

        if (lama > 2) {
            jamberikutnya = (lama - 2) * tambahan;
        } else {
            jamberikutnya = 0;
        }

        int total = harga + jamberikutnya;

        System.out.println("\n TAGIHAN TARIF PARKIR ");
        System.out.println(" ----------------------");
        System.out.println(" 2 JAM PERTAMA   : RP " + harga);
        System.out.println(" JAM BERIKUTNYA  : RP " + jamberikutnya);
        System.out.println(" TOTAL BAYAR     : RP " + total);

        sc.close();
    }
}
