import java.util.Scanner;

public class Tarif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Silakan masukkan jenis kendaraan: ");
        System.out.println("1. Mobil");
        System.out.println("2. Truk Motor");
        System.out.println("3. Bedakan");
        System.out.print("Pilih (1/2/3): ");
        int pilihan = scanner.nextInt();
        System.out.print("Masukkan jumlah roda: ");
        int roda = scanner.nextInt();
        System.out.print("Masukkan jarak (km): ");
        int jarak = scanner.nextInt();

        int tarif;
        if (pilihan == 1) {
            tarif = 10000;
        } else if (pilihan == 2) {
            tarif = 20000;
        } else {
            tarif = 30000;
        }

        tarif += jarak * roda;

        System.out.printf("Tarif berdasarkan pilihan anda: Rp. %d\n", tarif);
    }
}