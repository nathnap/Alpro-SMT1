import java.util.Scanner;
public class soal3 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("input angka : ");
	int angka1 = input.nextInt();
	System.out.print("");
	int angka2 = input.nextInt();

	int n = 1;
	int pembagiawal = 1;
	int pembagiakhir = 1;


	while (n <= angka1) {
		n = n + 1;
	if (angka1 % n == 0) {
		pembagiawal = n;
		break;
	}
}
	while (n <= angka2) {
		n = n + 1;
	if (angka2 % n == 0) {
		pembagiakhir = n;
		break;
	}
}

	System.out.println("Maka FPB " + angka1 + " dan " + angka2 + " adalah " + pembagiawal);
	}
}


