import java.util.*;
public class menghitungRumusFungsi {
	static int hitung(int x, int y){
	int hasil = (x*y) + (2*x) + (2*y) + 6;
	return hasil;
	}

	public static void main(String[] args){
	Scanner inp = new Scanner(System.in);
	int a, b;
	for(int n = 0; n < 5; n++){
		System.out.print("Masukkan nilai X : ");
		a = inp.nextInt();
		System.out.print("Masukkan nilai Y : ");
		b = inp.nextInt();
		int hasil = hitung(a,b);
		System.out.println("Untuk Nilai X : " + a + " dan y : " + b);
		System.out.println("Hasilnya : " + hasil);
	}
	}
}