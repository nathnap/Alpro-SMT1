public class BilanganPrimaRekursif {
 	public static boolean cekPrima(int n, int pembagi) {
 	if (pembagi == 1) {
 		return true;
 }
 	if (n % pembagi == 0) {
 		System.out.println(n + " Habis dibagi " + pembagi);
 		return false;
 }
 		System.out.println(n + " Tidak habis dibagi " + pembagi);
 		return cekPrima(n, pembagi - 1);

 }
 public static void main(String[] args) {
 		int angka = 10; 
 		boolean isPrima = cekPrima(angka, angka / 2);
 	if (isPrima) {
 			System.out.println(angka + " adalah bilangan prima.");
 	} else {
 			System.out.println(angka + " bukan bilangan prima.");
 			}
 		}
}