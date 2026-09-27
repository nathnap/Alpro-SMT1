import java.util.Scanner;

public class prediksilusa{
	public static main void(String[] args ){
		Scanner sc = new Scanner(System.in);
		int day;
		String opsi;

		System.out.print("Opsi :[0. Minggu, 1. Senin, 2.Selasa, 3. Rabu, 4. Kamis, 5. Jumat, 6.Sabtu");
		System.out.print("Sekarang adalah hari: ");
		day = sc.nextInt();

		if (day = 1) {
			System.out.println("Lusa adalah hari" + Rabu);
		} else if (day = 2) {
			System.out.println("Lusa adalah hari" + Kamis);
		} else if (day = 3) {
			System.out.println("Lusa adalah hari" + Jumat);
		} else if (day = 4) {
			System.out.println("Lusa adalah hari" + Sabtu);
		} else if (day = 5) {
			System.out.println("Lusa adalah hari" + Minggu);
		} else
			System.out.println("Lusa adalah hari" + Senin);


	}
}