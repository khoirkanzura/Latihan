import java.util.Scanner;

public class Kasir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("|===============================================|");
        System.out.println("|               PROGRAM KASIR KHOIR KN          |");
        System.out.println("|===============================================|");
        System.out.println("|               PILIH MENU MAKANAN              |");
        System.out.println("|===============================================|");
        System.out.println("|   1. Nasi Goreng Mawut      Rp  12.000        |");
        System.out.println("|   2. Mie Goreng Udang       Rp  15.000        |");
        System.out.println("|   3. Ayam Geprek            Rp  12.000        |");
        System.out.println("|   4. Bakso Mercon           Rp  15.000        |");
        System.out.println("|   5. Pecel                  Rp   8.000        |");
        System.out.println("|===============================================|");

        System.out.print("Pilihan Makanan 1/2/3/4/5 : ");
        int makanan = sc.nextInt();
        System.out.print("Berapa Porsi : ");
        int jumlahPorsi = sc.nextInt();

        int totalMakanan = 0;
        String namaMakanan = "";

        switch (makanan) {
            case 1:
                namaMakanan = "Nasi Goreng Mawut";
                totalMakanan = jumlahPorsi * 12000;
                break;
            case 2:
                namaMakanan = "Mie Goreng Udang";
                totalMakanan = jumlahPorsi * 15000;
                break;
            case 3:
                namaMakanan = "Ayam Geprek";
                totalMakanan = jumlahPorsi * 12000;
                break;
            case 4:
                namaMakanan = "Bakso Mercon";
                totalMakanan = jumlahPorsi * 15000;
                break;
            case 5:
                namaMakanan = "Pecel";
                totalMakanan = jumlahPorsi * 8000;
                break;
            default:
                System.out.println("Pilihan makanan tidak valid.");
                sc.close();
                return;
        }

        System.out.println("\n|===============================================|");
        System.out.println("|               PILIH MENU MINUMAN              |");
        System.out.println("|===============================================|");
        System.out.println("|   1. Jus Al-Pukat        Rp  10.000           |");
        System.out.println("|   2. Milo                Rp   8.000           |");
        System.out.println("|   3. Lemon Tea           Rp   7.000           |");
        System.out.println("|   4. Green Tea           Rp   8.000           |");
        System.out.println("|   5. Es Coklat           Rp   8.000           |");
        System.out.println("|===============================================|");

        System.out.print("Pilihan Minuman 1/2/3/4/5 : ");
        int minuman = sc.nextInt();
        System.out.print("Berapa Gelas : ");
        int jumlahGelas = sc.nextInt();

        int totalMinuman = 0;
        String namaMinuman = "";

        switch (minuman) {
            case 1:
                namaMinuman = "Jus Al-Pukat";
                totalMinuman = jumlahGelas * 10000;
                break;
            case 2:
                namaMinuman = "Milo";
                totalMinuman = jumlahGelas * 8000;
                break;
            case 3:
                namaMinuman = "Lemon Tea";
                totalMinuman = jumlahGelas * 7000;
                break;
            case 4:
                namaMinuman = "Green Tea";
                totalMinuman = jumlahGelas * 8000;
                break;
            case 5:
                namaMinuman = "Es Coklat";
                totalMinuman = jumlahGelas * 8000;
                break;
            default:
                System.out.println("Pilihan minuman tidak valid.");
                sc.close();
                return;
        }

        int totalBayar = totalMakanan + totalMinuman;

        System.out.println("\n|===============================================|");
        System.out.println("|               DAFTAR PEMBELIAN                |");
        System.out.println("|===============================================|");
        System.out.println("   Makanan        : " + namaMakanan);
        System.out.println("   Jumlah Porsi   : " + jumlahPorsi);
        System.out.println("   Total Makanan  : Rp" + totalMakanan);
        System.out.println("   Minuman        : " + namaMinuman);
        System.out.println("   Jumlah Gelas   : " + jumlahGelas);
        System.out.println("   Total Minuman  : Rp" + totalMinuman);
        System.out.println("|-----------------------------------------------|");
        System.out.println("   TOTAL BAYAR    : Rp" + totalBayar);
        System.out.println("|===============================================|");
        System.out.println("| TERIMA KASIH SUDAH MAMPIR DI WARUNG KHOIR KN  |");
        System.out.println("|===============================================|");

        sc.close();
    }
}
