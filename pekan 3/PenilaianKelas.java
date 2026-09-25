import java.util.Scanner;
	public class PenilaianKelas {
	public static void main(String[] args ) {
		Scanner inp = new Scanner(System.in);

		System.out.print("Masukkan nama siswa: ");
		String nama = inp.nextLine();
		System.out.print("Masukkan nilai siswa: ");
		int nilai = inp.nextInt();

		if(nilai >= 90 && nilai <= 100){
			System.out.println(nama + " Mendapatkan nilai A");
		}else if(nilai < 90 && nilai >= 80) {
			System.out.println(nama + " Mendapatkan nilai B");
		}else if(nilai < 80 && nilai >= 70) {
			System.out.println(nama + " Mendapatkan nilai C");
		}else if(nilai < 70 && nilai >= 60) {
			System.out.println(nama + " Mendapatkan nilai D");
		}else if(nilai < 60){
			System.out.println(nama + " Mendapatkan nilai F");
		}else{
			System.out.println("Nilai Mahasiswa tidak Valid");
		}
			
	}
	}