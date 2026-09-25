import java.util.Scanner;

public class Latihan1{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		String variableA, variableB;

		System.out.print("Beri Nilai Variable A: ");
		variableA = sc.nextLine();

		System.out.print("Beri Nilai Variable B: ");
		variableB = sc.nextLine();

		System.out.println("Nilai Variable A: " + variableA);
		System.out.println("Nilai Variable B: " + variableB);

		String temp;

		temp = variableA;
		variableA = variableB;
		variableB = temp;

		System.out.println("Nilai Baru Variable A: " + variableA);
		System.out.println("Nilai Baru Variable B: " + variableB);
	}
	}