import java.util.Scanner;
public class TarifMobil {

   // public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan jarak tempuh (km): ");
            double distance = scanner.nextDouble();
    
            System.out.print("Masukkan jenis kendaraan (Motor, Mobil): ");
            String vehicleType = scanner.next();
    
            double fee;
    
            if (vehicleType.equalsIgnoreCase("Motor")) {
                fee = 3000 * distance;
            } else if (vehicleType.equalsIgnoreCase("Mobil")) {
                System.out.print("Masukkan lama pemakaian (hari): ");
                int duration = scanner.nextInt();
                if (duration > 7) {
                    fee = 20000 * distance;
                } else {
                    fee = 30000 * distance;
                }
            } else {
                System.out.println("Jenis kendaraan tidak valid. Harap masukkan 'Motor' atau 'Mobil'.");
                return;
            }
    
            System.out.println("Tarif perjalanan adalah: Rp" + fee);
        }
    } 
//}

