import java.util.Scanner;
public class soal1 {
	public static void main(String[] args) {
	
	System.out.println("Format Masukkan : ");
	Scanner input = new Scanner(System.in);
	int n = input.nextInt();
	System.out.print("");
	int i = input.nextInt();
	System.out.print("");
	int j = input.nextInt();
	System.out.print("");
	int k = input.nextInt();
	System.out.print("");
	int l = input.nextInt();

	if (n > 1000 && n < 100) {
		System.out.println("nomor tidak valid.");
	}else if (i > 1000 && i < 100) {
		System.out.println("nomor tidak valid.");
	} else if (j > 1000 && j < 100) {
		System.out.println("nomor tidak valid.");
	}else if (k > 1000 && k < 100) {
		System.out.println("nomor tidak valid.");
	}else if (l > 1000 && l < 100){
		System.out.println("nomor tidak valid.");
	}
		System.out.println("Format Keluaran : ");
	if (n % 2 == 0) {
		System.out.println(n + " tidak valid");
	}else {
		System.out.println(n + " valid");
	
	}if (i % 2 == 0) {
		System.out.println(i + " tidak valid");
	}else {
		System.out.println(i + " valid");

	}if (j % 2 == 0) {
		System.out.println(j + " tidak valid");
	}else {
		System.out.println(j + " valid");

	}if (k % 2 == 0) {
		System.out.println(k + " tidak valid");
	}else {
		System.out.println(k + " valid");

	}if (l % 2 == 0) {
		System.out.println(l + " tidak valid");
	}else {
		System.out.println(l + " valid");

		}
	}
}
	