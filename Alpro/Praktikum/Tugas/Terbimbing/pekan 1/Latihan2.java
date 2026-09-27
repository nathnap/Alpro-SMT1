import java.util.Scanner;

public class Latihan2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		float idr, usd, sgd, yen, euro;

		System.out.print("Masukkan nilai rupiah : ");
		idr = sc.nextFloat();

		usd = idr / 16000;
		sgd = idr / 14000;
		yen = idr / 100;
		euro = idr / 20000;

		System.out.println(idr + " rupiah adalah " + usd + " dollar amerika");
		System.out.println(idr + " rupiah adalah " + sgd + " dollar singapura");
		System.out.println(idr + " rupiah adalah " + yen + " yen");
		System.out.println(idr + " rupiah adalah " + euro + " euro");
	}
}