import java.util.Scanner;

public class Praktikum4PecahanUang {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        final int ceban = 10000;
        final int goceng = 5000;
        final int noceng = 2000;
        final int seceng = 1000;
        final int gopek = 500;
        final int nopek = 200;
        final int cepek = 100;
	final int gocap = 50;

        System.out.print("Masukkan nominal uang: ");
        int n = userInput.nextInt();
	
	
        int Ceban = n / ceban;
        n = n % ceban;
        int Goceng = n / goceng;
        n = n % goceng; 
        int Noceng = n / noceng;
        n = n % noceng;
        int Seceng = n / seceng;
        n = n % seceng;
        int Gopek = n / gopek;
        n = n % gopek;
        int Nopek = n / nopek;
        n = n % nopek;
	int Cepek = n / cepek;
        n = n % cepek;
	int Gocap = n / gocap;
        n = n % gocap;

        System.out.println("---Output---");
        System.out.println("--------------------------");
        System.out.println("Hasil Rincian Pecahan:");
        System.out.println("jumlah 10000 = " + Ceban);
        System.out.println("jumlah 5000 = " + Goceng);
        System.out.println("jumlah 2000 = " + Noceng);
        System.out.println("jumlah 1000 = " + Seceng);
        System.out.println("jumlah 500 = " + Gopek);
        System.out.println("jumlah 200 = " + Nopek);
        System.out.println("jumlah 100 = " + Cepek);
	    System.out.println("jumlah 50 = " + Gocap);
        System.out.println("--------------------------");
        
        userInput.close();
    }
}