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
        System.out.println("|   3. Ayam Geprek            Rp 12.000         |");
        System.out.println("|   4. Bakso Mercon           Rp 15.000         |");
        System.out.println("|   5. Pecel                  Rp 8.000          |");
        System.out.println("|===============================================|");

        System.out.print("Pilihan Makanan 1/2/3/4/5 : ");
            int makanan = sc.nextInt();
        System.out.print("Berapa Porsi : ");
            int Jumlah_Porsi = sc.nextInt();
            
        int TotalMakan = 0;
        String nama_makanan = null;

        switch(makanan) { 
            case 1:
           // System.out.println("Masukkan jumlah porsi: ");
            int jumlahPorsi = sc.nextInt();
            System.out.println("Masukkan nama makanan: ");
            String namaMakanan = sc.next();
            int hargaMakanan = jumlahPorsi * 12000;
            System.out.println("Total harga " + namaMakanan + ": " + hargaMakanan);
            break;
                    //TotalMakan = Jumlah_Porsi * 12.000;
                    //nama_makanan = "Nasi Goreng";
                    //System.out.println("Nasi Goreng " + Jumlah_Porsi+ " Porsi : Rp" +TotalMakan);
                    //break;
            case 2:
                    TotalMakan = Jumlah_Porsi * 15.000;
                    nama_makanan = " Mie Goreng Udang";
                    System.out.println("Mie Goreng " + Jumlah_Porsi+ "Porsi : Rp" +TotalMakan);
                    break;
            case 3: 
                    TotalMakan = Jumlah_Porsi * 12.000;
                    nama_makanan = "Ayam Geprek";
                    System.out.println("Ayam Geprek " + Jumlah_Porsi+ "Porsi : Rp" +TotalMakan);
                    break;
            case 4:
                    TotalMakan = jum_porsi * 15.000;
                    nama_makanan = "Bakso Mercon";
                    System.out.println("Bakso Mercon " + Jumlah_Porsi+ "Porsi : Rp" +TotalMakan);
                    break;
            case 5:
                    TotalMakan = jum_porsi * 8.000;
                    nama_makanan = "Pecel";
                    System.out.println("Pecel " + Jumlah_Porsi+ "Porsi : Rp" +TotalMakan);
                    break;
            default:
                    System.out.println("Pilihan Tidak Tersedia");
        }

        System.out.println("|===============================================|");
        System.out.println("|               PROGRAM KASIR KHOIR KN          |");
        System.out.println("|===============================================|");
        System.out.println("|               PILIH MENU MINUMAN              |");
        System.out.println("|===============================================|");
        System.out.println("|   1. Jus Al-Pukat      Rp  10.000             |");
        System.out.println("|   2. Milo              Rp  8.000              |");
        System.out.println("|   3. Lemon Thea        Rp 7.000               |");
        System.out.println("|   4. Grean Thea        Rp 8.000               |");
        System.out.println("|   5. Es Coklat         Rp 8.000               |");
        System.out.println("|===============================================|");

        System.out.print("Pilihan Minuman 1/2/3/4/5 : ");
            int minuman = sc.nextInt();
        System.out.print("Berapa gelas : ");
            int JumlahGelas = sc.nextInt();
            
        int TotalMinuman = 0;
        String nama_minuman = null;

        switch(minuman) { 
            case 1:
            System.out.println("Masukkan jumlah gelas: ");
            int jumlahGelas = sc.nextInt();
            System.out.println("Masukkan nama minuman: ");
            String namaMinuman = sc.next();
            int hargaMinuman = jumlahGelas * 8000;
            System.out.println("Total harga " + namaMinuman + ": " + hargaMinuman);
            break;
                //  TotalMinuman = JumlahGelas * 10.000;
                    //nama_minuman = "Jus Al-Pukat";
                    //System.out.println("Jus Al-Pukat " + JumlahGelas+ " Porsi : Rp" +TotalMinuman);
                    //break;
            case 2:
                    TotalMinuman = jum_porsi * 8.000;
                    nama_minuman = "Milo";
                    System.out.println("Milo " + JumlahGelas+ "Porsi : Rp" +TotalMinuman);
                    break;
            case 3: 
                    TotalMinuman = jum_porsi * 7.000;
                    nama_makanan = "Lemon Thea";
                    System.out.println("Lemon Thea " + JumlahGelas+ "Porsi : Rp" +TotalMinuman);
                    break;
            case 4:
                    TotalMinuman = jum_porsi * 8.000;
                    nama_minuman = "Grean Thea";
                    System.out.println("Grean Thea " + JumlahGelas+ "Porsi : Rp" +TotalMinuman);
                    break;
            case 5:
                    TotalMinuman = jum_porsi * 8.000;
                    nama_minuman = "Es Coklat";
                    System.out.println("Es Coklat " + JumlahGelas+ "Porsi : Rp" +TotalMinuman);
                    break;
            default:
                    System.out.println("Pilihan Tidak Tersedia");
        }

            int jumlahSemua;
            jumlahSemua = TotalMakan + TotalMinuman;

        System.out.println("|===============================================|");
        System.out.println("|               DAFTAR PEMBELIAN                |");
        System.out.println("|===============================================|");
        System.out.println("   Makanan : " +nama_makanan);
        System.out.println("   Jumlah Porsi : " +Jumlah_Porsi);
        System.out.println("   Minuman :  " +nama_minuman);
        System.out.println("   Jumlah Gelas : " +JumlahGelas);
        System.out.println("|===============================================|");
        System.out.println("   Total harga  : " +jumlahSemua);
        System.out.println("|===============================================|");
        System.out.println("| TERIMAKASIH SUDAH MAMPIR DI WARUNG KHOIR KN   |");
        System.out.println("|===============================================|");

        sc.close();

    }
}
