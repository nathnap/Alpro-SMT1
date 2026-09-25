public class FaktorialRekursif {
	 public static int hitungFaktorial(int n) {
		if (n == 0 || n == 1) {
 			return 1;
 }
 		return n * hitungFaktorial(n - 1);
 }
 public static void main(String[] args) {
 int angka = 5; 
 int hasil = hitungFaktorial(angka);
 System.out.println(angka + "! = " + hasil);
 }
}