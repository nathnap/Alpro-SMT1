import java.util.Scanner;

public class prediksilusa_1{
	public static void main(String[] args ){
		Scanner sc = new Scanner(System.in);
		int day;

		System.out.println("Opsi :[0. Minggu, 1. Senin, 2.Selasa, 3. Rabu, 4. Kamis, 5. Jumat, 6.Sabtu");
		System.out.print("Sekarang adalah hari: ");
		day = sc.nextInt();

		switch(day) { 
	case 0:
		System.out.println("Lusa adalah hari Selasa");
		break;
	case 1:
		System.out.println("Lusa adalah hari Rabu");
		break;
	case 2:
		System.out.println("Lusa adalah hari Kamis");
		break;
	case 3:
		System.out.println("Lusa adalah hari Jumat");
		break;
	case 4:
		System.out.println("Lusa adalah hari Sabtu");
		break;
	case 5:
		System.out.println("Lusa adalah hari Minggu");
		break;
	case 6:
		System.out.println("Lusa adalah hari Senin");
		break;
	default :
		System.out.println("Hari tidak valid.");

		}
		}
	}