import java.util.Scanner;

public class pencatatanTransaksiMandiri {
		Scanner inp = new Scanner(System.in);

		int i;
		int data = 30;
		int jumlahTerjual[] = new int[data];
		int totalHarga[] = new int[data];
		int jenisMenu[] = new int[data];

		int dataTerpakai = 0;
		int jumlahData = 0;

		int hargaAyam = 6000;
		int hargaBebek = 10000;
		int hargaMinum = 5000;

		int totalSemuaData = 0;

	public static void main (String[] args) {
		pencatatanTransaksiMandiri method = new pencatatanTransaksiMandiri();
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
				System.out.println("Pilih Menu: ");
				System.out.println("1. Ayam Goreng");
				System.out.println("2. Bebek Goreng");
				System.out.println("3. Minuman Air Mata Buaya");
				System.out.print("Pilihan : ");
				int pilih = inp.nextInt();

				jenisMenu[i] = pilih;

				System.out.print("Masukkan jumlah Terjual: ");
				jumlahTerjual[i] = inp.nextInt();

				if(pilih == 1) {
					totalHarga[i] = jumlahTerjual[i] * hargaAyam;
				} else if(pilih == 2) {
					totalHarga[i] = jumlahTerjual[i] * hargaBebek;
				} else if(pilih == 3) {
					totalHarga[i] = jumlahTerjual[i] * hargaMinum;
				} else {
					System.out.println("Produk tidak ada");
					continue;
				}

				i++;
				dataTerpakai++;

			}

		} else {
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

			String namaMenu = "";
			if (jenisMenu[i] == 1) namaMenu = "Ayam Goreng";
			else if (jenisMenu[i] == 2) namaMenu = "Bebek Goreng";
			else if (jenisMenu[i] == 3) namaMenu = "Minuman Air Mata Buaya";

			System.out.println("Menu:			" + namaMenu);
			System.out.println("Jumlah Terjual: 	" + jumlahTerjual[i]);
			System.out.println("Total Harga: 		" + totalHarga[i]);
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
