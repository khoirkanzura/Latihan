import java.util.Scanner;

import java.util.Scanner;
public class Kalkulator {
    public static void main(String[] args) {
        float a, b, hasil;
        char operator;
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------------------------------------");
        System.out.println("            KALKULATOR SEDERHANA           ");
        System.out.println("--------------------------------------------");
        System.out.print("Nilai a\t\t: ");
        a = sc.nextFloat();
        System.out.print("Operator\t: ");
        operator = sc.next().charAt(0);
        System.out.print("Nilai b\t\t: ");
        b = sc.nextFloat();

        System.out.println("Input user\t: " + a + " " + operator + " " + b);

        if (operator == '+') {
            hasil = a + b;
            System.out.println("Hasil\t\t: " + hasil);
        } else if (operator == '-') {
            hasil = a - b; 
            System.out.println("Hasil\t\t: " + hasil);
        } else if (operator == '*') {
            hasil = a * b;
            System.out.println("Hasil\t\t: " + hasil);
        } else if (operator == '/') {
            if (b == 0) {
                System.out.println("Nilai b adalah 0 sehingga menghasilkan tak hingga");
            } 
        } else {
            System.out.println("Operator tidak tersedia");
        }
        sc.close();
    }
}
