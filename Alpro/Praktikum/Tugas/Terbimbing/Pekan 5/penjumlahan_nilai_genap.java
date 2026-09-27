import java.util.Scanner;

public class penjumlahan_nilai_genap {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Masukkan nilai batas: ");
		int batas = input.nextInt();

		int jumlah = 0;
		boolean first = true;

		for (int n = 2; n <= batas; n += 2) {
			jumlah += n;

			if(!first) {
				System.out.print(" + ");

			}
			System.out.print(n);
			first = false;
		}
		System.out.println(" = " + jumlah);
	}
}