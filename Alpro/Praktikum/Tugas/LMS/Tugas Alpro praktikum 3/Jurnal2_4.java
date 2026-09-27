import java.util.Scanner;

public class Jurnal2_4{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int gaji;
	double total_pajak;

	System.out.print("Masukkan gaji dalam juta: ");
	gaji = sc.nextInt();

	if(gaji <= 50){
		total_pajak = gaji * 5.00/100;
	} else if(gaji > 50 && gaji <= 100){
		total_pajak = (50.00 * 5.00/100) + (gaji - 50) * 10.00/100;
	} else if(gaji > 100 && gaji <= 200){
		total_pajak = (50.00 * 5.00/100) + (50.00 * 10.00/100) + ((gaji - 100) * 15.00/100);
	} else if(gaji > 200){
		total_pajak = (50.00 * 5.00/100) + (50.00 * 10.00/100) + (100.00 * 15.00/100) + ((gaji - 200) * 20.00/100);
	} else{
		total_pajak = 0;
	}

		System.out.println("Total pajak yang harus di bayar: " + total_pajak + " juta");
	}
	}