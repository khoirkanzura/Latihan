import java.util.Scanner;
public class InputDataMahasiswa {
    public static void main(String[] args) {
        
        String nim, nama, matakuliah;
        double Prestasi, Tugas, UAS;

        Scanner dataScanner = new Scanner(System.in);

        System.out.println("====== Input Nilai  Mahasiswa ===== " );

        System.out.print("Masukan Nim Anda \t : ");
        nim = dataScanner.nextLine();

        System.out.print("Masukan Nama Anda \t : ");
        nama = dataScanner.nextLine();

        System.out.print("Masukan Mata Kuliah \t : ");
        matakuliah = dataScanner.nextLine();

        System.out.print("Masukan Nilai Prestasi \t : ");
        Prestasi = dataScanner.nextDouble();

        System.out.print("Masukan Nilai Tugas \t : ");
        Tugas = dataScanner.nextDouble();

        System.out.print("Masukan Nilai UAS \t : ");
        UAS = dataScanner.nextDouble();

        // Bobot Nilai
        double bobotPrestasi = 0.3;
        double bobotTugas = 0.3;
        double bobotUAS = 0.4;

        // Hitung Rata2
        double nilaiPrestasi = bobotPrestasi * Prestasi;
        double nilaiTugas = bobotTugas * Tugas;
        double nilaiUAS = bobotUAS * UAS;

        double Ratarata = (nilaiPrestasi + nilaiTugas + nilaiUAS) /
                          (bobotPrestasi + bobotTugas + bobotUAS);

        System.out.println("Masukan nilai rata-rata: " + Ratarata);
        
        // Menampilkan Hasil Semuanya
        System.out.println("================= Data Mahasiswa ==================");
        System.out.println("Nim : "+ nim + "\t||\n");
        System.out.println("Nama :" + nama + "\t||\n");
        System.out.println("Mata Kuliah :" + matakuliah + "\t||\n");
        System.out.println("Nilai Prestasi :" + nilaiPrestasi + "\t\t||\n");
        System.out.println("Nilai Tugas :" + nilaiTugas + "\t\t||\n");
        System.out.println("Nilai UAS :" + nilaiUAS + "\t\t||\n");
        System.out.println("Rara-Rata :" + Ratarata + "\t\t||\n");
        System.out.println("=====================================================");
        

        dataScanner.close();

    }
}
    

