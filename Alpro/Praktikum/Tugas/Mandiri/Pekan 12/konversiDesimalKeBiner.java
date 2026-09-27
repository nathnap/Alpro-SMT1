import java.util.Scanner;

public class KonversiDesimalKeBiner {
    public static void konversi(int n) {
        if (n > 1) {
            konversi(n / 2);
        }
        System.out.print(n % 2);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Masukkan Bilangan Desimal: ");
        int angka = inp.nextInt();
        System.out.print("Bilangan Binernya adalah: ");
        konversi(angka);
    }
}
