import java.util.Scanner;

public class bilanganprimamodif {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Masukkan bilangan: ");
		int bilangan = input.nextInt();
		int pembagi = 0;

		System.out.println("Bilangan prima dari 1 hingga " + bilangan + " adalah:");

		for (int j = 2; j <= bilangan; j++) {
			pembagi = 0;
		for (int n = 1; n <= j; n++) {
			if(j % n == 0) {
			pembagi++;
		}
	}
			if (pembagi == 2) {
			System.out.print(j + " ");
			}
		}
	}
	}
