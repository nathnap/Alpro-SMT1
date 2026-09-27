import java.util.Scanner;
public class soal2 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("jam masuk : ");
	int jam_awal = input.nextInt();
	System.out.println("menit masuk : ");
	int menit_awal = input.nextInt();
	System.out.println("jam keluar : ");
	int jam_akhir = input.nextInt();
	System.out.println("menit keluar : ");
	int menit_akhir = input.nextInt();

	int menit = menit_awal + menit_akhir;
	int jam = jam_akhir - jam_awal;
	int jamtotal = 0;
	int menittotal = 0;
	int parkir = 0;

	if (menit > 59) {
		jamtotal =  jam + 1;
		menittotal = menit - 60;
	} 

	if (jam < 2) {
		parkir = 5000;
	} else if (jam >= 2 && jam <= 5) {
		parkir = 10000;
	} else {
		parkir = 15000;
	}

	System.out.println("Lama kendaraan di parkir: " + jamtotal + " jam " + menittotal + " menit.");
	System.out.println("Harga parkir kendaraan: " + parkir);
		}
	}