import java.util.Scanner;

public class Zakat {
	private long hargaEmas = 2200000;
	private long nisab = 85*hargaEmas;

	public static void main(String[] args){
		Zakat zp = new Zakat();
		zp.runThis();
	}

	public void runThis(){
		Scanner input = new Scanner(System.in);

		System.out.print("Masukkan Jumlah Pendapatan  : ");
		long pendapatan = input.nextLong();

		System.out.print("Masukkan Jumlah Pengeluaran : ");
		long pengeluaran = input.nextLong();

		long pendapatanBersih = pendapatan - pengeluaran;

		tampilkanHasil(pendapatan, pendapatanBersih);

	}

		public void tampilkanHasil(long pendapatan, long bersih){
			System.out.println("\n=======================================================");
			System.out.println("Jumlah Pendapatan 		: Rp." + pendapatan);
			System.out.println("Jumlah Pendapatan Bersih 	: Rp." + bersih);

			if (isMelebihiNisab(bersih)){
				System.out.println("Status Nisab 			: Melebihi Nisab");
				System.out.println("Total Zakat Wajib 		: Rp." + hitungZakat(bersih));
			} else {
				System.out.println("Status Nisab 			: Tidak Melebihi Nisab");
				System.out.println("Total Zakat Wajib 		: Rp.0");
			}
		}

		public long hitungZakat(long pendapatanBersih){
			return pendapatanBersih * 25 / 1000;
		}
		public boolean isMelebihiNisab(long pendapatanBersih){
			return pendapatanBersih >= nisab;
		}
		}
	