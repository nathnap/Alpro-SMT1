import java.util.Scanner;

public class prediksitanggallusa_1{
	public static void main(String[] args ){
		Scanner inp = new Scanner(System.in);

		System.out.println("-----INFO SEKARANG TANGGAL-----");
		System.out.print("Tanggal: ");
		int tanggal = inp.nextInt();
		System.out.print("Bulan: ");
		int bulan = inp.nextInt();
		System.out.print("Tahun: ");
		int tahun = inp.nextInt();

		int lusa = tanggal + 2;
		int bulanbaru = bulan;
		int tahunbaru = tahun;

		int haridalambulan =0;
		switch (bulan) {
	case 1:
		haridalambulan = 31;
		break;
	case 2:
		if (tahun % 4 == 0) {
			haridalambulan = 29;
		}else {
			haridalambulan = 28;
		}
		break;
	case 3:
			haridalambulan = 31;
		break;
	case 4:
			haridalambulan = 30;
		break;
	case 5:
			haridalambulan = 31;
		break;
	case 6:
			haridalambulan = 30;
		break;
	case 7:
			haridalambulan = 31;
		break;
	case 8:
			haridalambulan = 31;
		break;
	case 9:
			haridalambulan = 30;
		break;
	case 10:
			haridalambulan = 31;
		break;
	case 11:
			haridalambulan = 30;
		break;
	case 12:
			haridalambulan = 31;
		break;
	}
		if (lusa > haridalambulan);
		lusa = lusa - haridalambulan;
			bulanbaru = bulanbaru + 1;
		if (bulanbaru > 12);
			bulanbaru = 1;
			tahunbaru = tahunbaru + 1;

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

		System.out.println("Lusa tanggal " + lusa + " " + namabulan + " " + tahunbaru);
		}
	}


