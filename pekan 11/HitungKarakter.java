import java.util.Scanner;
public class HitungKarakter {
	public static void main(String[] args){
	HitungKarakter hitungKarakter = new HitungKarakter();
	hitungKarakter.runThis();
	}

	public void runThis(){
		Scanner sc = new Scanner(System.in);

		System.out.println("Masukkan kata: ");
		String kalimat = sc.nextLine();

		int vokal = 0, konsonan = 0, angka = 0, spesial = 0;

		for(int i = 0; i < kalimat.length(); i++){
		char c = kalimat.charAt(i);
		if(isVowel (c)){
			vokal++;
		} else if (isKonsonan (c)){
			konsonan++;
		} else if (isDigit (c)){
			angka++;
		} else {
			spesial++;
		}
	}

	System.out.println("Vokal 		:" +vokal);
	System.out.println("Konsonan 	:" +konsonan);
	System.out.println("Angka 		:" +angka);
	System.out.println("Spesial 	:" +spesial);
	}

	public boolean isVowel(char huruf){
		huruf = Character.toLowerCase(huruf);
		return (huruf == 'a' || huruf == 'i' || huruf == 'u' 
				|| huruf == 'e' || huruf == 'o');
	}

	public boolean isKonsonan(char huruf){
		huruf = Character.toLowerCase(huruf);
		return(huruf >= 'a' && huruf <= 'z' && !isVowel(huruf));
	}
	public boolean isDigit(char huruf){
		return(huruf >= '0' && huruf <= '9');
	}
	public boolean isSpecial(char huruf){
		return !(isVowel(huruf) || isKonsonan(huruf) || isDigit(huruf));
	}
}