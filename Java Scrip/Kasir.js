import java.util.Scanner;

public class Kasir {
    public static void main(String[] args) {
        String[][] menu = {
            {"Makanan", "Harga", "Jumlah"},
            {"Nasi Goreng", "25000", "0"},
            {"Bakso", "15000", "0"},
            {"Ayam Goreng", "20000", "0"},
            {"Minuman", "Harga", "Jumlah"},
            {"Es Teh", "5000", "0"},
            {"Es Jeruk", "7000", "0"},
            {"Kopi", "8000", "0"}
        };

        Scanner scanner = new Scanner(System.in);
        int totalHarga = 0;

        System.out.println("Selamat Datang di Warung Makan Kami!");
        System.out.println("==================================");

        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%s %s %s\n", menu[i][0], menu[i][1], menu[i][2]);
            System.out.print("Masukkan jumlah pesanan: ");
            menu[i][2] = scanner.nextLine();
            totalHarga += Integer.parseInt(menu[i][2]) * Integer.parseInt(menu[i][1].replace(".", ""));
        }

        System.out.println("==================================");
        System.out.printf("Total harga: Rp. %d\n", totalHarga);
        System.out.println("==================================");
        System.out.println("Terima kasih sudah menggunakan layanan kami!");
    }
}