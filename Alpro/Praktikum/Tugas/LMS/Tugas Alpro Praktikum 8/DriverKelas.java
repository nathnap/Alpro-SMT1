import java.util.Scanner;

class NilaiMK{
	private String nim;
    private int a1;
    private int a2;
    private int a3;
    private int tugas;
    private int prakt;
    private double nilai;

    public NilaiMK(String nim, int a1, int a2, int a3,
    			int tugas, int prakt) {
    	this.nim = nim;
    	this.a1 = a1;
    	this.a2 = a2;
    	this.a3 = a3;
    	this.tugas = tugas;
    	this.prakt = prakt;
    } 

    public void setNim(String nim){
    	this.nim = nim;
    }
    public String getNim() { return nim;}

    public void seta1(int a1){
    	this.a1 = a1;
    }
    public int geta1() { return a1;}

    public void seta2(int a2){
    	this.a2 = a2;
    }
    public int geta2() { return a2;}

    public void seta3(int a3){
    	this.a3 = a3;
    }
    public int geta3() { return a3;}

    public void settugas(int tugas){
    	this.tugas = tugas;
    }
    public int gettugas() { return tugas;}

    public void setprakt(int prakt){
    	this.prakt = prakt;
    }
    public int getprakt() { return prakt;}

    public void setnilai(double nilai){
    	this.nilai = nilai;
    }
    public Double getnilai() { return nilai;}
}

class NilaiService{
	Scanner inp = new Scanner(System.in);

	public NilaiMK masukkanNilai(){
		String nim;
		int a1, a2, a3, tugas, prakt;
		System.out.print("Masukkan Nim : " );
		nim = inp.nextLine();
		System.out.print("Masukkan Asesmen 1: " );
		a1 = inp.nextInt();
		System.out.print("Masukkan Asesmen 2: " );
		a2 = inp.nextInt();
		System.out.print("Masukkan Asesmen 3: " );
		a3 = inp.nextInt();
		System.out.print("Masukkan tugas: " );
		tugas = inp.nextInt();
		System.out.print("Masukkan Praktikum: " );
		prakt = inp.nextInt();
		NilaiMK nilai = new NilaiMK(nim, a1, a2, a3, tugas, prakt);
        nilai.setnilai(HitungNilai(nilai));
		return nilai;
	}

    public double HitungNilai(NilaiMK nm){
        return (nm.geta1() * 0.15) + (nm.geta2() * 0.15) + (nm.geta3() * 0.10) + (nm.gettugas() * 0.20) + (nm.getprakt() * 0.40);
    }

    public void printNilai(NilaiMK nm){
        System.out.println("===== Nilai Asesmen =====");
        System.out.println("NIM             : " + nm.getNim());
        System.out.println("Asesmen 1       : " + nm.geta1());
        System.out.println("Asesmen 2       : " + nm.geta2());
        System.out.println("Asesmen 3       : " + nm.geta3());
        System.out.println("Tugas           : " + nm.gettugas());
        System.out.println("Praktikum       : " + nm.getprakt());
        System.out.println("Nilai Akhir     : " + nm.getnilai());
    }
}

public class DriverKelas{
    NilaiService n = new NilaiService();

    public static void main(String[] args){
        DriverKelas d = new DriverKelas();
        d.runThis();
    }

    public void runThis(){
        NilaiMK mahasiswa1 = n.masukkanNilai();
        n.printNilai(mahasiswa1);
    }
}

/*
Jawaban 
a. Keyword "this" di Java menunjuk pada objek saat ini dalam suatu metode atau konstruktor.
b. Keyword "this" pada line 14-19, 23, 28, 33, 38, 43, 48, 53 merujuk pada variabel anggota kelas NilaiMK
*/
