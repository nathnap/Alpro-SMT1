import java.util.Scanner;

class Barang{
	private String kodeBarang;
	private String namaBarang;
	private String produsen;
	private int beratBersih;
	private double hargaBeli;
	private double hargaJual;

	Barang(String kodeBarang, String namaBarang, String produsen, int beratBersih, double hargaBeli, double hargaJual){
		this.kodeBarang = kodeBarang;
		this.namaBarang = namaBarang;
		this.produsen = produsen;
		this.beratBersih = beratBersih;
		this.hargaBeli = hargaBeli;
		this.hargaJual = hargaJual;
	}

	public void setkodeBarang(String kodeBarang){
		this.kodeBarang = kodeBarang;
	}

	public String getkodeBarang(){
		return kodeBarang;
	}

	public void setnamaBarang(String namaBarang){
		this.namaBarang = namaBarang;
	}

	public String getnamaBarang(){
		return namaBarang;

	}

	public void setprodusen(String produsen){
		this.produsen = produsen;
	}

	public String getprodusen(){
		return produsen;
	}

	public void setberatBersih(int beratBersih){
		this.beratBersih = beratBersih;
	}

	public int getberatBersih(){
		return beratBersih;
	}

	public void sethargaBeli(double hargaBeli){
		this.hargaBeli = hargaBeli;
	}

	public double gethargaBeli(){
		return hargaBeli;
	}

	public void sethargaJual(double hargaJual){
		this.hargaJual = hargaJual;
	}
	
	public double gethargaJual(){
		return hargaJual;
	}
}



public class ritelmakanan{
	Scanner input = new Scanner(System.in);

	public static void main(String[] args){
		ritelmakanan r = new ritelmakanan();
		r.runThis();
	}
	public void runThis(){
		Barang barang1 = inputData();
		viewData(barang1);
	}

	public Barang inputData(){
		String kode, nama, produsen;
		int beratBersih;
		double hargaBeli, hargaJual;

		System.out.println("===== Inputan Data Barang =====");
		System.out.print("kode             : ");
		kode = input.nextLine();
		System.out.print("Nama Barang      : ");
		nama = input.nextLine();
		System.out.print("produsen         : ");
		produsen = input.nextLine();
		System.out.print("Berat Bersih     : ");
		beratBersih = input.nextInt();
		System.out.print("Harga Beli       : ");
		hargaBeli = input.nextDouble();
		System.out.print("Harga Jual       : ");
		hargaJual = input.nextDouble();

		Barang barang = new Barang(kode, nama, produsen, beratBersih, hargaBeli, hargaJual);

		return barang;
	}

	public void viewData(Barang barang){
		System.out.println("\n===== Menampilkan Data Barang =====");
		System.out.println("Nama             : " + barang.getnamaBarang());
		System.out.println("Kode             : " + barang.getkodeBarang());
		System.out.println("Produsen         : " + barang.getprodusen());
		System.out.println("Berat Bersih     : " + barang.getberatBersih());
		System.out.println("Harga Beli       : " + barang.gethargaBeli());
		System.out.println("Harga Jual       : " + barang.gethargaJual());
	}
}