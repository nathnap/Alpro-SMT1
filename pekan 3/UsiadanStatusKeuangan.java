import java.util.Scanner;
	public class UsiadanStatusKeuangan {
	public static void main(String[] args ) {
		Scanner inp = new Scanner(System.in);

		System.out.print("Masukkan Usia: ");
		int usia = inp.nextInt();
		System.out.print("Masukkan Gaji Tahunan (juta): ");
		int gaji = inp.nextInt();

		if(usia <18){
			System.out.println("Masih sekolah");
		} else if(usia >= 18 && usia <= 25) {
			if(gaji >= 50){
			System.out.println("Muda sukses.");
		}
		}else if(gaji < 50){
			System.out.println("Masih belajar hidup.");
			
		}else if(usia >= 26 && usia <= 40) {
			if(gaji >= 100){
			System.out.println("Pekerja mapan.");
		}
		}else if(gaji < 100){
			System.out.println("Perlu perbaikan karir.");
	
		}else if(usia > 40) {
			if(gaji >= 150){
			System.out.println("Profesional berpengalaman.");
		}
		} else{
			System.out.println("Perlu evaluasi finansial.");
		}
	}
}