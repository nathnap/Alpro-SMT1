import java.util.Scanner;

public class bilanganprima {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Masukkan bilangan: ");
		int bilangan = input.nextInt();

		int pembagi = 0;

		for (int n = 1; n <= bilangan; n++) {
			if(bilangan % n == 0) {
				pembagi++;
			}
		}

		if (pembagi == 2) {
			System.out.print(bilangan + " Merupakan bilangan prima");
		} else {
			System.out.print(bilangan + " Bukan merupakan bilangan prima");
		}
	}
}