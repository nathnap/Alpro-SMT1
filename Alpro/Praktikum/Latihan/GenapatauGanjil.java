import java.util.Scanner;

	public class GenapatauGanjil {
	public static void main(String[] args) { 
	Scanner inp = new Scanner(System.in);

	System.out.print("Masukkan Angka: ");
	int angka = inp.nextInt();

	if (angka % 2 == 0) {
	System.out.println(angka + " Adalah bilangan Genap."); 
	} else {
	System.out.println(angka + " Adalah bilangan Ganjil.");
 }      

	}
}