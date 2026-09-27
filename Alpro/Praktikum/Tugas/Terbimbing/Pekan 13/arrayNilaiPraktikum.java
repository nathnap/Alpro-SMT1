import java.util.Scanner;

public class arrayNilaiPraktikum {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		double[] nilaiMingguan = new double[10];
		double tugasBesar;
		double totalNilaiMingguan = 0;

		for(int i = 0; i < 10; i++){
			System.out.print("Masukkan nilai minggu ke-" + (i+1) + " 	: ");
			nilaiMingguan[i] = inp.nextDouble();
			totalNilaiMingguan += nilaiMingguan[i];		
		}

		System.out.print("Masukkan nilai Tubes : ");
		tugasBesar = inp.nextDouble();

		double nilaiAkhir = (totalNilaiMingguan / 10 * 0.80) + (tugasBesar * 0.20);

		System.out.println("\n=========== Hasil Penilaian ==========");
		System.out.println("Daftar nilai Mingguan :");
		for (int i = 0; i < 10 ; i++ ) {
			System.out.println("Minggu ke-" + (i+1) + " 	: " + nilaiMingguan[i]);
		}

		System.out.println("Nilai Tugas Besar : " + tugasBesar);
		System.out.println("Nilai Tugas Akhir : " + nilaiAkhir);
	}
}