import java.util.ArrayList;
import java.util.Scanner;

public class KasirMakanan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> pesanan = new ArrayList<>();

        while (true) {
            System.out.println("\n|===============================================|");
            System.out.println("|               WARUNG KHOIR KN                 |");
            System.out.println("|===============================================|");
            System.out.println("|                    MENU                       |");
            System.out.println("|===============================================|");
            System.out.println("| [1] Makanan                                   |");
            System.out.println("| [2] Minuman                                   |");
            System.out.println("| [3] Lihat Daftar Pesanan                      |");
            System.out.println("| [4] Checkout                                  |");
            System.out.println("| [5] Keluar                                    |");
            System.out.println("|===============================================|");
            System.out.print("Pilih menu: ");

            int pilihan = sc.nextInt();
            sc.nextLine(); // Untuk mengonsumsi newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama makanan: ");
                    String namaMakanan = sc.nextLine();

                    System.out.print("Masukkan jumlah porsi: ");
                    int jumlahPorsi = sc.nextInt();

                    int hargaMakanan = jumlahPorsi * 12000;
                    System.out.println("Total harga " + namaMakanan + ": Rp" + hargaMakanan);

                    pesanan.add("Makanan: " + namaMakanan + ", Harga: " + hargaMakanan);
                    break;

                case 2:
                    System.out.print("Masukkan nama minuman: ");
                    String namaMinuman = sc.nextLine();

                    System.out.print("Masukkan jumlah gelas: ");
                    int jumlahGelas = sc.nextInt();

                    int hargaMinuman = jumlahGelas * 8000;
                    System.out.println("Total harga " + namaMinuman + ": Rp" + hargaMinuman);

                    pesanan.add("Minuman: " + namaMinuman + ", Harga: " + hargaMinuman);
                    break;

                case 3:
                    if (pesanan.isEmpty()) {
                        System.out.println("Belum ada pesanan.");
                    } else {
                        System.out.println("Daftar Pesanan:");
                        for (String p : pesanan) {
                            System.out.println("- " + p);
                        }
                    }
                    break;

                case 4:
                    int totalHarga = 0;
                    if (pesanan.isEmpty()) {
                        System.out.println("Belum ada pesanan untuk dihitung.");
                    } else {
                        for (String p : pesanan) {
                            String[] item = p.split(", ");
                            String[] harga = item[1].split(": ");
                            totalHarga += Integer.parseInt(harga[1]);
                        }
                        System.out.println("Total yang harus dibayar: Rp" + totalHarga);
                        pesanan.clear(); // Kosongkan pesanan setelah checkout
                    }
                    break;

                case 5:
                    System.out.println("Terima kasih, selamat datang kembali!");
                    sc.close();
                    return;

                default:
                    System.out.println("Pilihan tidak tersedia, coba lagi.");
            }
        }
    }
}
        