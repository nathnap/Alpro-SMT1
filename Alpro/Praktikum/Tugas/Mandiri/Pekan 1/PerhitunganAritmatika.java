import java.util.Scanner;
import java.util.Locale;

public class PerhitunganAritmatika {

    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("--- PERHITUNGAN ARITMATIKA ---");

        float bilangan1, bilangan2;

        System.out.print("Masukkan bilangan pertama: ");
        bilangan1 = input.nextFloat();

        System.out.print("Masukkan bilangan kedua: ");
        bilangan2 = input.nextFloat();

     
        float hasilPenjumlahan = bilangan1 + bilangan2;
        float hasilPerkalian   = bilangan1 * bilangan2;
        float hasilPengurangan = bilangan1 - bilangan2;
        float hasilPembagian   = bilangan1 / bilangan2;
        float hasilModulus     = bilangan1 % bilangan2; 
     
        System.out.println("\n-------------------------------------------");
        System.out.println("HASIL PERHITUNGAN:");

        System.out.printf("a. Hasil penjumlahan %.1f + %.1f = %.1f%n", bilangan1, bilangan2, hasilPenjumlahan);
        System.out.printf("b. Hasil perkalian %.1f * %.1f = %.1f%n", bilangan1, bilangan2, hasilPerkalian);
        System.out.printf("c. Hasil pengurangan %.1f - %.1f = %.1f%n", bilangan1, bilangan2, hasilPengurangan);
        System.out.printf("d. Hasil pembagian %.1f / %.1f = %.1f%n", bilangan1, bilangan2, hasilPembagian);
        System.out.printf("e. Hasil modulus %.1f %% %.1f = %.1f%n", bilangan1, bilangan2, hasilModulus); // Tanda %% digunakan untuk mencetak simbol %
        System.out.println("-------------------------------------------");

        input.close();
    }
}
