import java.util.Scanner;
import java.util.Random;

public class tebak_angka {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Random gen = new Random();

		System.out.print("Tebak angka antara 0-100: ");

		int nilai = gen.nextInt(100);
		int jumlahTebakan = 0;
		int batas_bawah = 0;
		int batas_atas = 100; 

		boolean istrue = false;

		while (!istrue) {
			jumlahTebakan++;

			int tebakan = -1;
			tebakan = input.nextInt();

			if(tebakan == nilai){
				istrue = true;
				System.out.println("Tebakan yang bagus, anda berhasil menebaknya dalam " + jumlahTebakan + " tebakan.");
			}else if(tebakan<nilai && tebakan>batas_bawah){
				batas_bawah = tebakan;
				System.out.print("Nilai yang anda masukkan lebih kecil.\nTebak angka antara " + batas_bawah + "-" + batas_atas + " : ");
			}else if(tebakan>nilai && tebakan<batas_atas) {
				batas_atas = tebakan;
				System.out.print("Nilai yang anda masukkan lebih besar.\nTebak angka antara " + batas_bawah + "-" + batas_atas + " : ");
			}else {
				System.out.print("Tebakan diluar rentang.\nTebaklah angka antara " + batas_bawah + " dan " + batas_atas + " : ");
			}
		}
	}
}