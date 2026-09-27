import java.util.Scanner;

public class konversiBinerKeDesimal {
    public static int konversi(int n, int base) {
        if (n == 0) {
            return 0;
        }
        int digit = n % 10;
        int nilai = digit * base;

        return nilai + konversi(n / 10, base * 2);  
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Masukkan bilangan biner : ");
        int biner = inp.nextInt();
        int hasil = konversi(biner, 1);

        System.out.println("Hasil desimalnya adalah : " + hasil);
    }
}