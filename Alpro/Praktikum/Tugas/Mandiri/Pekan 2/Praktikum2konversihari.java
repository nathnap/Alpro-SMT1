import java.util.Scanner;
public class Praktikum2konversihari {
		public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		final int tahun = 365;
		final int bulan = 30;
		final int minggu = 7;
		final int hari = 1;

int Tahun,Bulan,Minggu,Hari;

	System.out.println("Masukkan Nominal Hari: ");
	int n = userInput.nextInt();
		
		Tahun = n / tahun;
		n = n % tahun;
		Bulan = n / bulan;
		n = n % bulan;
		Minggu = n / minggu;
		n = n % minggu;
		Hari = n / hari;
		n = n % hari;

		System.out.println("---Output---");
        System.out.println("--------------------------");
        System.out.println("Hasil Konversi Hari:");
        System.out.println("Jumlah Tahun: " + Tahun);
        System.out.println("Jumlah Bulan:" + Bulan);
        System.out.println("Jumlah Minggu:" + Minggu);
        System.out.println("Jumlah Hari:" + Hari);
        System.out.println("--------------------------");

userInput.close();
		}
	}	