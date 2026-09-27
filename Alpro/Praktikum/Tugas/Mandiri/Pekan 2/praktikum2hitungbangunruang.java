import java.util.Scanner;

class praktikum2hitungbangunruang  {
	public static void main(String[] args)  {
		int pilihan;
		double panjang, lebar, tinggi;
		double sisi, r, tinggi_tabung;
		double phi = 3.14;
		Scanner inp = new Scanner(System.in);

		System.out.println("KUBUS");
		System.out.println("--------------------------");
		System.out.println("Masukkan Panjang Sisi Kubus: ");

		sisi = inp.nextDouble();
		double keliling = 12 * sisi;
		double luas_permukaan = 6 * sisi;
		double volumekubus = sisi * sisi * sisi;

   		System.out.println("--------------------------");
		System.out.println("Keliling kubus     : " + keliling);
        System.out.println("Luas permukaan     : " + luas_permukaan);
        System.out.println("Volume kubus       : " + volumekubus);
        System.out.println("--------------------------");

		System.out.println("BALOK");
		System.out.println("--------------------------");
        System.out.print("Masukkan panjang balok: ");
        panjang = inp.nextDouble();
        System.out.print("Masukkan lebar balok: ");
        lebar = inp.nextDouble();
        System.out.print("Masukkan tinggi balok: ");
        tinggi = inp.nextDouble();

        double kelilingbalok = 4 * (panjang + lebar + tinggi);
        double luasPermukaan = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
        double volumebalok = panjang * lebar * tinggi;

        System.out.println("--------------------------");
        System.out.println("Keliling balok     : " + kelilingbalok);
        System.out.println("Luas permukaan     : " + luasPermukaan);
        System.out.println("Volume balok       : " + volumebalok);
        System.out.println("--------------------------");

		System.out.println("TABUNG");
		System.out.println("--------------------------");
        System.out.print("Masukkan jari-jari tabung: ");
        r = inp.nextDouble();
        System.out.print("Masukkan tinggi tabung: ");
        tinggi_tabung = inp.nextDouble();

        double kelilingAlas = 2 * phi * r;
        double luasPermukaanTabung = 2 * phi * r * (r + tinggi_tabung);
        double volume = phi * r * r * r;

        System.out.println("--------------------------");
        System.out.println("Keliling alas tabung : " + kelilingAlas);
        System.out.println("Luas permukaan       : " + luasPermukaanTabung);
        System.out.println("Volume tabung        : " + volume);
        System.out.println("--------------------------");

	}
}
