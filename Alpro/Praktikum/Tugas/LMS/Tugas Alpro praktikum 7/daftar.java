import java.util.Scanner;

class Pendaftaran{
	private String nomorNota;
	private String namaPelanggan;
	private String alamat;
	private String nomorHP;
	private String tglMasuk;
	private String tglselesai;
	private String jenisLayanan;
	private int jumlahPesanan;
	private double jumlahKG;

	Pendaftaran(String nomorNota, String namaPelanggan, String alamat, 
			String nomorHP, String tglMasuk, String tglselesai,
			 String jenisLayanan, int jumlahPesanan, double jumlahKG){
		this.nomorNota = nomorNota;
		this.namaPelanggan = namaPelanggan;
		this.alamat = alamat;
		this.nomorHP = nomorHP;
		this.tglMasuk = tglMasuk;
		this.tglselesai = tglselesai;
		this.jenisLayanan = jenisLayanan;
		this.jumlahPesanan = jumlahPesanan;
		this.jumlahKG = jumlahKG;
	}

	public void setnomorNota(String nomorNota){
		this.nomorNota = nomorNota;
	}

	public String getnomorNota(){
		return nomorNota;
	}

	public void setnamaPelanggan(String namaPelanggan){
		this.namaPelanggan = namaPelanggan;
	}

	public String getnamaPelanggan(){
		return namaPelanggan;

	}

	public void setalamat(String alamat){
		this.alamat = alamat;
	}

	public String getalamat(){
		return alamat;
	}

	public void setnomorHP(String nomorHP){
		this.nomorHP = nomorHP;
	}

	public String getnomorHP(){
		return nomorHP;
	}

	public void settglMasuk(String tglMasuk){
		this.tglMasuk = tglMasuk;
	}

	public String gettglMasuk(){
		return tglMasuk;
	}

	public void settglselesai(String tglselesai){
		this.tglselesai = tglselesai;
	}
	
	public String gethtglselesai(){
		return tglselesai;
	}

	public void setjenisLayanan(String jenisLayanan){
		this.jenisLayanan = jenisLayanan;
	}
	
	public String getjenisLayanan(){
		return jenisLayanan;
	}

	public void setjumlahPesanan(int jumlahPesanan){
		this.jumlahPesanan = jumlahPesanan;
	}
	
	public int getjumlahPesanan(){
		return jumlahPesanan;
	}

	public void setjumlahKG(double jumlahKG){
		this.jumlahKG = jumlahKG;
	}
	
	public double getjumlahKG(){
		return jumlahKG;
	}

}



public class daftar{
	Scanner input = new Scanner(System.in);

	public static void main(String[] args){
		daftar r = new daftar();
		r.runThis();
	}
	public void runThis(){
		Pendaftaran daftar1 = inputData();
		viewData(daftar1);
	}

	public Pendaftaran inputData(){
		String nomorNota, nama, alamat;
		String nomorHP, tglMasuk, tglselesai, jenisLayanan;
		int jumlahPesanan;
		double jumlahKG;

		System.out.println("===== Inputan Data Barang =====");
		System.out.print("Nomor Nota           		: ");
		nomorNota = input.nextLine();
		System.out.print("Nama Pelanggan          	: ");
		nama = input.nextLine();
		System.out.print("Alamat Pelanggan     		: ");
		alamat = input.nextLine();
		System.out.print("Nomor HP   			: ");
		nomorHP = input.nextLine();
		System.out.print("Tanggal Pesanan Masuk  		: ");
		tglMasuk = input.nextLine();
		System.out.print("Tanggal Pesanan Selesai 	: ");
		tglselesai = input.nextLine();
		System.out.print("Jenis Layanan 			: ");
		jenisLayanan = input.nextLine();
		System.out.print("Jumlah Pesanan      		: ");
		jumlahPesanan = input.nextInt();
		System.out.print("Berat Pesanan (kg)      	: ");
		jumlahKG = input.nextDouble();

		Pendaftaran daftar = new Pendaftaran(nomorNota, nama, alamat, 
			nomorHP, tglMasuk, tglselesai,
			 jenisLayanan, jumlahPesanan, jumlahKG);

		return daftar;
	}

	public void viewData(Pendaftaran daftar){
		System.out.println("\n===== Menampilkan Data Pendaftaran Pelanggan =====");
		System.out.println("Nomor Nota                  : " + daftar.getnomorNota());
		System.out.println("Nama Pelanggan              : " + daftar.getnamaPelanggan());
		System.out.println("Alamat Pelanggan            : " + daftar.getalamat());
		System.out.println("Nomor HP Pelanggan          : " + daftar.getnomorHP());
		System.out.println("Tanggal Pesanan Masuk       : " + daftar.gettglMasuk());
		System.out.println("Tanggal Pesanan Selesai     : " + daftar.gethtglselesai());
		System.out.println("Jenis Layanan               : " + daftar.getjenisLayanan());
		System.out.println("Jumlah Pesanan              : " + daftar.getjumlahPesanan());
		System.out.println("Berat Pesanan               : " + daftar.getjumlahKG() + " kg");
	}
}