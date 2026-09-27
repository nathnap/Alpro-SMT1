import java.util.Scanner;
	public class KlasifikasiSiswa {
	public static void main(String[] args ) {
		Scanner inp = new Scanner(System.in);

		System.out.print("Masukkan Nilai Ujian: ");
		int nilai = inp.nextInt();
		System.out.print("Masukkan Persentase Kehadiran: ");
		int persentase = inp.nextInt();

		if(nilai >= 85){
			if(persentase >= 90){
			System.out.println("Lulus dengan baik.");
		}
		}else if(nilai >= 70 && nilai <= 85) {
			if(persentase >= 75) {
			System.out.println("Lulus.");
			} else if(persentase < 75) {
			System.out.print("Tidak lulus karena absensi rendah.");
		}
		}else if(nilai >= 50 && nilai <=70) {
			if(persentase <= 75){
			System.out.println("Remedial karena kehadiran rendah.");
		}
		}else{
			System.out.println("Tidak lulus karena nilai rendah.");
		}
	}
}