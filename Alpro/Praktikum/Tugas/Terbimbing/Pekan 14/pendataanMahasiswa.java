import java.util.ArrayList;
import java.util.Scanner;


public class pendataanMahasiswa{
	Scanner inp = new Scanner(System.in);
	ArrayList<Mahasiswa> maha = new ArrayList<>();

	public static void main(String[] args) {
		pendataanMahasiswa alm = new pendataanMahasiswa();
		alm.runThis();
	}


	void runThis(){
		inputData();
		inputData();
		inputData();
		viewData();

	}

	void inputData(){
		System.out.println("===================== Masukkan Data Mahasiswa =====================");
		System.out.print("Masukkan NIM: ");
		String nim = inp.nextLine();
		System.out.print("Masukkan nama: ");
		String nama = inp.nextLine();
		System.out.print("Masukkan Asal Sekolah: ");
		String asal_sekolah = inp.nextLine();
		System.out.print("Masukkan Alamat Asal: ");
		String alamat_asal = inp.nextLine();
		System.out.print("Masukkan Alamat Sekarang: ");
		String alamat_sekarang = inp.nextLine();
		maha.add(new Mahasiswa(nim, nama, asal_sekolah, alamat_asal, alamat_sekarang));

	}

	void viewData(){
		for(int i = 0; i<maha.size(); i++){
			System.out.println(maha.get(i).getDataMhs());
		}
	}
	class Mahasiswa{
		private String nim, nama, asal_sekolah, alamat_asal, alamat_sekarang;

public Mahasiswa(String nim, String nama, String asal_sekolah, String alamat_asal, String alamat_sekarang){
	    this.nim = nim;
	    this.nama = nama;
	    this.asal_sekolah = asal_sekolah;
	    this.alamat_asal = alamat_asal;
	    this.alamat_sekarang = alamat_sekarang;
	}
	public void setNim(String nim){
	    this.nim = nim;
	}

	public void setasal_sekolah(String asal_sekolah){
	    this.asal_sekolah = asal_sekolah;
	}

	public void setNama(String nama){
	    this.nama = nama;
	}

	public void setalamat_asal(String alamat_asal){
	    this.alamat_asal = alamat_asal;
	}

	public void setalamat_sekarang(String alamat_sekarang){
	    this.alamat_sekarang = alamat_sekarang;
	}

	public String getnim()	{	
    	return nim;
    }

	public String getnama(){	
  		return nama;
  	}

  	public String getasal_sekolah(){	
  		return asal_sekolah;
  	}

  	public String getalamat_asal(){	
  		return alamat_asal;
  	}

  	public String getalamat_sekarang(){	
  		return alamat_sekarang;
  	}

	public String getDataMhs(){
    	return getnim() + " | " + getnama() + " | " + getasal_sekolah() + " | " + getalamat_asal() + " | " + getalamat_sekarang();  
    	}
    }
}

/*A. ArrayList<Mahasiswa> arrMhs = new ArrayList<>(); fungsinya adalah memasukkan kelas "Mahasiswa" ke dalam ArrayList
 													  dan mengubah nama "ArrayList<Mahasiswa>" menjadi "arrMhs"
  B. arrMhs.get(a).getNama(); fungsinya adalah untuk memanggil arraylist "arrMhs" dengan indeks ke-a untuk mendapat
  							  nama dari arraylist 
  C. arrMhs.get(a).getNim(); fungsinya adalah untuk memanggil arraylist "arrMhs" dengan indeks ke-a untuk mendapat
  							 nim dari arraylist 
*/