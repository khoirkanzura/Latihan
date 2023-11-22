import java.util.Scanner;
public class MengitungTarifMobil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int harga, jamberikutnya;
        int lama, jenis, tambahan;

        System.out.println(" MENGITUNG TARIF PARKIR ");
        System.out.println(" -----------------------");
        System.out.print(" 1. Mobil ");
        System.out.print(" 2. Motor ");
        System.out.print(" Masukkan Jenis Kendaraan : ");

        switch (jenis) {
            case 1 :
                harga = 3000;
                tambahan = 1000;
                break;
        
            case 2 :
                harga = 2000;
                tambahan = 500;
                break;

            default : 
                harga = 0;
        }
        System.out.print(" Masukkan Lama Parkir (Per Jam) : ");
            if (lama>2) {
                jamberikutnya=((lama-2)*tambahan);
            }
            else {
                jamberikutnya=0;
            }
            System.out.println(" TAGIHAN TARIF PARKIR ");
            System.out.println(" ----------------------");
            System.out.print(" 2 JAM PERTAMA RP:" );
            System.out.print(" JAM BERIKUTNYA RP: ");
            System.out.print(" TOTAL BAYAR RP: ");

            sc.close();
    }

    
}
