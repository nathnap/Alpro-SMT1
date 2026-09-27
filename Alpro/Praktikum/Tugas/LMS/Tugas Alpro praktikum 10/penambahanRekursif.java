import java.util.Scanner;

public class penambahanRekursif {
	 public static int hitungTambah(int n) {
		if (n == 0) {
 			return 0;
 		} else{
 			return n + hitungTambah(n - 1);
 		}
 	}

 public static void main(String[] args) {
 	Scanner inp = new Scanner(System.in);
	 	System.out.print("Masukkan Bilangan Bulat: ");
 	int bilangan = inp.nextInt(); 
 	int hasil = hitungTambah(bilangan);
 		System.out.println("Hasil Penjumlahan Seluruh Bilangan = " + hasil);
 		
	}
 }

