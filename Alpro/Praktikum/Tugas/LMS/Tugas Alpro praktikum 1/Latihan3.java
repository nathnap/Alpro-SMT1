import java.util.Scanner;

public class Latihan3 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		float keliling, luas, jari;
		float pi = 3.14f;

		System.out.print("Masukkan panjang jari2 lingkaran : ");
		jari = sc.nextFloat();

		keliling =pi * (jari * 2);
		luas = pi * jari * jari;

		System.out.println("Luas lingkaran adalah : " + luas);
		System.out.println("Keliling lingkaran adalah : " + keliling);
	}
}