import java.util.Scanner;

public class pencatatanTransaksi {
		Scanner inp = new Scanner(System.in);

		int i;
		int data = 30;
		int jumlahTerjual[] = new int[data];
		int totalHarga[] = new int[data];
		int dataTerpakai = 0;

		int jumlahData = 0;
		int harga = 6000;

		int totalSemuaData = 0;

	public static void main (String[] args) {
		pencatatanTransaksi method = new pencatatanTransaksi();
		method.pilihMenu();
	}

	public void pilihMenu(){
		int menu;
		System.out.println("===================================================");
		System.out.println("Pilih menu dengan mengetik angka menu (0-2)");
		System.out.println("0. End Program");
		System.out.println("1. Input Data");
		System.out.println("2. Lihat Riwayat Transaksi");
		System.out.println("===================================================");
		System.out.print("Input: ");
		menu = inp.nextInt();

		switch(menu){
		case 0:
			endProgram();
			break;
		case 1:
			inputData();
			break;
		case 2: 
			riwayatTransaksi();
			break;
		default:
			System.out.println("Input Error");
			break;
		}
	}
	public void inputData(){
		if (i < data){
			System.out.print("Masukkan jumlah data yang ingin di input : ");
			jumlahData = inp.nextInt();

			System.out.println();

			for (int n = 0; n < jumlahData ; n ++) {
				System.out.print("Masukkan jumlah ayam goreng yang terjual : ");
				jumlahTerjual[i] = inp.nextInt();
				totalHarga[i] = harga * jumlahTerjual[i];
				i++;
				dataTerpakai++;

			}
		}else{
			System.out.println("Data Full");
		}

	pilihMenu();
	}
				
	public void riwayatTransaksi(){
		System.out.println();
		System.out.println("===================================================");
		System.out.println("Arsip Data: ");

		for (i = 0; i < dataTerpakai; i++) {
			System.out.println(" ");
			System.out.println("Penjualan " + (i+1));
			System.out.println("Jumlah Terjual: " + jumlahTerjual[i]);
			System.out.println("Total Harga: " + totalHarga[i]);
			System.out.println();

			totalSemuaData += totalHarga[i];
	
		}
		System.out.println();
		System.out.println("Total semua Penjualan: " + totalSemuaData);
		System.out.println();
		System.out.println("===================================================");
		System.out.println();

		pilihMenu();
	}

	public void endProgram(){
		System.out.println("Program Ended");
	}
}
