import java.util.Scanner;

class praktikum3suhu  {
	public static void main(String[] args)  {
	double celcius;
	Scanner inp = new Scanner(System.in);
	System.out.println("Masukkan Suhu Dalam Celcius:");
	celcius = inp.nextDouble();

	Double fahrenheit = (9.0 / 5.0) * celcius + 32;
	Double reamur = (4.0 / 5.0) * celcius;
	Double kelvin = celcius + 273.15;

    System.out.println("--------------------------");
	System.out.println ("Suhu Dalam Celcius:" + celcius);
	System.out.println ("Suhu Dalam Fahrenheit:" + fahrenheit);
	System.out.println ("Suhu Dalam Reamur:" + reamur);
	System.out.println ("Suhu Dalam Kelvin:" + kelvin);
	System.out.println("--------------------------");
	}
	}