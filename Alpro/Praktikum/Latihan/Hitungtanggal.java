import java.util.Scanner;

	public class Hitungtanggal {
	public static void main (String[] args) {
	Scanner inp = new Scanner(System.in);

	System.out.print("Masukan jumlah hari:");
	int hari = inp.nextInt();

	int tanggal = 6;
	int bulan = 10;
	int tahun = 2025;

	int total_hari = tanggal + hari;

 	int Bulan, Tahun;

 	if (total_hari <= 28) {
 		tanggal = total_hari;
 		Bulan = 0;
 	} else if (total_hari % 28 == 0) {
 		tanggal = 28;
 		Bulan = (total_hari / 28) - 1;
 	} else {
 		tanggal = total_hari % 28;
 		Bulan = total_hari / 28;
 	}

 		bulan = bulan + Bulan;

 	if (bulan <= 12)  {
 		Tahun = 0;
 	}	else if (bulan % 12 == 0) {
 		Tahun = (bulan / 12) - 1;
 		bulan = 12;
 	} else {
 		Tahun = bulan % 12;
 		bulan = bulan / 12;
 	}

 	tahun = tahun + Tahun;

 	String namabulan = "";
 	switch (bulan) {
 	case 12: if (bulan == 12) namabulan = "Desember";
 	case 11: if (bulan == 11) namabulan = "November";
 	case 10: if (bulan == 10) namabulan = "Oktober";
 	case 9: if (bulan == 9) namabulan = "September";
 	case 8: if (bulan == 8) namabulan = "Agustus";
 	case 7: if (bulan == 7) namabulan = "Juli";
 	case 6: if (bulan == 6) namabulan = "Juni";
 	case 5: if (bulan == 5) namabulan = "Mei";
 	case 4: if (bulan == 4) namabulan = "April";
 	case 3: if (bulan == 3) namabulan = "Maret";
 	case 2: if (bulan == 2) namabulan = "Februari";
 	case 1: if (bulan == 1) namabulan = "Januari";

 		System.out.println("Tanggal ke-" + hari + " dari 6 Oktober Tahun 2025 adalah:");
 		System.out.println(tanggal + " " + namabulan + " Tahun " + tahun);
 	}
 	}
 	}