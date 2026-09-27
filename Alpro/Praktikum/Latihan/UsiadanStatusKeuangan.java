import java.util.Scanner;
	public class UsiadanStatusKeuangan {
	public static void main(String[] args ) {
		Scanner inp = new Scanner(System.in);

		System.out.print("Masukkan Usia: ");
		String usia = inp.nextLine();
		System.out.print("Masukkan Gaji Tahunan (juta): ");
		int gaji = inp.nextInt();

		if(usia < 18){
			System.out.println("Masih sekolah");
		}else if(usia => 18 && usia <= 25 && gaji >= 50) {
			System.out.println("Muda sukses.");
			  if(usia => 18 && usia <= 25 && gaji <= 50) {
			System.out.println("Belajar hidup");
		}
	}
	