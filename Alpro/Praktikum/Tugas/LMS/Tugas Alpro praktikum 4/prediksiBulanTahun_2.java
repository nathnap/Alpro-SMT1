import java.util.Scanner;

public class prediksiBulanTahun_2{
	public static void main(String[] args ){
		Scanner inp = new Scanner(System.in);

		System.out.println("Opsi :[1. Januari, 2. Februari, 3.Maret, 4. April, 5. Mei, 6. Juni, 7. Juli, 8. Agustus, 9. September, 10. Oktober, 11. November, 12. Desember]");
		System.out.print("Sekarang Bulan: ");
		int month = inp.nextInt();

		System.out.print("Sekarang Tahun: ");
		int year = inp.nextInt();

		System.out.print("Jumlah bulan target: ");
		int target = inp.nextInt();

		int totalbulan = month + target;
		int tahunbaru = year + (totalbulan - 1) / 12;
		int bulanbaru = (totalbulan - 1) % 12 + 1;

		String namamonth = "";
		switch (month) {
		case 1 :
			namamonth = "Januari";
			break;
		case 2 :
			namamonth = "Februari";
			break;
		case 3 :
			namamonth = "Maret";
			break;
		case 4 :
			namamonth = "April";
			break;
		case 5 :
			namamonth = "Mei";
			break;
		case 6 :
			namamonth = "Juni";
			break;
		case 7 :
			namamonth = "Juli";
			break;
		case 8 :
			namamonth = "Agustus";
			break;
		case 9 :
			namamonth = "September";
			break;
		case 10 :
			namamonth = "Oktober";
			break;
		case 11 :
			namamonth = "November";
			break;
		case 12 :
			namamonth = "Desember";
			break;

		}

		String namabulan = "";
		switch (bulanbaru) {
		case 1 :
			namabulan = "Januari";
			break;
		case 2 :
			namabulan = "Februari";
			break;
		case 3 :
			namabulan = "Maret";
			break;
		case 4 :
			namabulan = "April";
			break;
		case 5 :
			namabulan = "Mei";
			break;
		case 6 :
			namabulan = "Juni";
			break;
		case 7 :
			namabulan = "Juli";
			break;
		case 8 :
			namabulan = "Agustus";
			break;
		case 9 :
			namabulan = "September";
			break;
		case 10 :
			namabulan = "Oktober";
			break;
		case 11 :
			namabulan = "November";
			break;
		case 12 :
			namabulan = "Desember";
			break;

		}

		System.out.println("Sekarang bulan " + namamonth + " tahun " + year);
		System.out.println(target + " bulan lagi adalah bulan " + namabulan + " tahun " + tahunbaru);
	}
}