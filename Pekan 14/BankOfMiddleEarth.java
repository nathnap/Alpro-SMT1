import java.util.*;

class Rekening{
	private int no;
	private String nama;
	private double saldo;

	public Rekening(int no, String nama, double saldo){
		this.no=no;
		this.nama=nama;
		this.saldo=saldo;
}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
}	
	
	public double getSaldo() {
		return saldo;
}

	public int getNo()	 {
		return no;
}
	public String getNama() {
		return nama;
	}
}

public class BankOfMiddleEarth {
	ArrayList<Rekening> aRek = new ArrayList<>();
	double saldoMinimal = 500000;
	Scanner inp = new Scanner(System.in);

	public static void main(String[] abcd){
		BankOfMiddleEarth b = new BankOfMiddleEarth ();
		b.menu();	
	}
		
	private void menu()	{
	/*pada bagian ini, diasumsikan adalah sebuah struktur menu, 
	.yang kemudian menjalankan proses pengolahan data 
	.(buatRekening, tabung, tarik dan transfer)
	.untuk melengkapi, buatlah sebuah struktur menu dari program ini
	*/
		System.out.println("======================= Buat Rekening Baru =======================");
		buatRekening();
		System.out.println("\n ======================= Tabung Rekening 1 =======================");
		tabung();
		System.out.println("\n ======================= Tarik Rekening 1 =======================");
		tarik();

		System.out.println("======================= Buat Rekening Baru =======================");
		buatRekening();
		System.out.println("======================= Tabung Rekening 2 =======================");
		tabung();
		System.out.println("======================= Tarik Rekening 2 =======================");
		tarik();

		System.out.println("======================= Transfer Rekening =======================");
		transfer();

	}
			
	private void buatRekening(){
	System.out.print(" Masukkan Nama : ");
	String nama = inp.nextLine();
	System.out.print(" Masukkan Saldo : ");
	double saldo = inp.nextDouble();


	/* 
	.	Input data nama dan saldo
	*/

	if (saldo < saldoMinimal){						//No 12
			System.out.println(" Saldo awal tidak mencukupi");
		}
		else{
			int no;
			if (!aRek.isEmpty()){
				no = aRek.get(aRek.size()-1).getNo()+1;
				
		}
		else{ no = 1;
		//jika array sudah terisi, maka no rekening diambilkan dari 
			//rekening terakhir yang ditambahkan, kemudian ditambahkan 1
				//jika array masih kosong, maka no rekening adalah 1
			}
			Rekening rek = new Rekening(no, nama, saldo);
			aRek.add(rek);					//No 13
			System.out.println(" Rekening telah ditambahkan");			
		}
	}

	/*
	.	Method cekRekening merupakan sebuah method yang digunakan 
	.	untuk mencari indeks dalam arrayList dari no rekening yang dicari. 
	.	Jika ditemukan, maka akan mengembalikan indeks dari rekening tersebut. 
	.	Jika tidak ditemukan, maka akan mengembalikan nilai -1
	*/

	private int cekRekening(int no)	{
		int ketemu = -1;
		for (int a=0; a<aRek.size(); a++)	{
			if (aRek.get(a).getNo() == no)	{			//No 14
				ketemu = a;
				break;
			}
		}	
		return ketemu;
	}

	private void tabung(){
	/* 
	.	Input data no rekening dan saldo tambahan
	*/
		System.out.print("\n Masukkan Nomor Rekening : ");
		int noRek = inp.nextInt();

		int pos = cekRekening(noRek);
		
		if (pos>=0)	{

			System.out.print(" Masukkan Jumlah Uang : ");
			double jumlah = inp.nextDouble();

			double saldoAkhir = aRek.get(pos).getSaldo() + jumlah;
		aRek.get(pos).setSaldo(saldoAkhir);				//No 15
			System.out.println(" Saldo telah ditambahkan");
		}
		else{
			System.out.println(" No Rekening tidak ditemukan, Transaksi dibatalkan");
		}
	}
		
	private void tarik()	{
	/* 
	.	Input no rekening dan saldo penarikan
	*/

		System.out.print("\n Masukkan no Rekening : ");
		int noRek = inp.nextInt();

	int pos = cekRekening(noRek);

		

		if (pos>=0){
			//cek apakah saldo akhir masih cukup atau tidak
			System.out.print(" Masukkan Jumlah Uang yang Akan Ditarik : ");
			double tarikTunai = inp.nextDouble();

			double saldoAkhir = aRek.get(pos).getSaldo() - tarikTunai;
			if (saldoAkhir >= saldoMinimal)	{				//No 16
				aRek.get(pos).setSaldo(saldoAkhir);			//No 17
				System.out.println(" Transaksi Selesai \n Silahkan ambil uang " + tarikTunai + " anda");
			}
			else	{
				System.out.println(" Saldo tidak cukup, Transaksi dibatalkan");	
			}
		}
		else{
			System.out.println(" No Rekening tidak ditemukan, Transaksi dibatalkan");
		}
	}
		

	private void transfer()	{
	/* 
	.	Input no rekening asal, no rekening tujuan dan saldo penarikan
	*/

		System.out.print("\n Masukkan no Rekening awal : ");
		int noRekAwal = inp.nextInt();
		System.out.print("\n Masukkan no Rekening Tujuan : ");
		int noRekTujuan = inp.nextInt();
		
	int posAsal 	= cekRekening(noRekAwal);				//No 18
	int posTujuan = cekRekening(noRekTujuan);
					//No 19
	if ((posAsal>=0) && (posTujuan>=0)){
		System.out.print("\n Masukkan Saldo yang Akan Ditransfer : ");
		double uangTransfer = inp.nextDouble();

		double saldoAkhirAsal = aRek.get(posAsal).getSaldo() - uangTransfer;
		if (saldoAkhirAsal >= saldoMinimal){
			aRek.get(posAsal).setSaldo	(saldoAkhirAsal);			//No 20
			double SaldoAkhirTujuan = aRek.get(posTujuan).getSaldo() + uangTransfer;	//No 21
			aRek.get(posTujuan).setSaldo(SaldoAkhirTujuan);			//No 22
			System.out.println(" Transfer telah dilaksanakan");
		}
		else	{
			System.out.println(" Saldo tidak cukup, Transaksi dibatalkan");	
		}
	}else{
		System.out.println(" No Rekening tidak ditemukan");		
		}		
	}

	private void infoRekening(int no)	{
		int pos = cekRekening(no);
		if (pos>=0)	{
			System.out.println("Informasi Rekening");	
			System.out.println("No Rek 	: "+ aRek.get(pos).getNo());			//No 23
			System.out.println("Nama   	: "+ aRek.get(pos).getNama());			//No 24
			System.out.println("Saldo  	: "+ aRek.get(pos).getSaldo());			//No 25
		}
	}
}