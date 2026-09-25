public class JumlahDigitRekursif {
 public static int jumlahDigit(int n) {
 	if (n < 10) {
		return n;
 	}
 		return (n % 10) + jumlahDigit(n / 10);
 	}
 public static void main(String[] args) {
 	int angka = 123;
 	try{

 		int jumlah = jumlahDigit(angka);
 		System.out.println("Total " + angka + " = " + jumlah);
 	}
 	catch(Exception e){
 		System.out.println(e.toString());
 		}
 	}
}