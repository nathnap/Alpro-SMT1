import java.util.Scanner;

class Menu {
    private String makananDipilih;
    private int hargaMakanan;
    private int jumlahMakanan;

    private String minumanDipilih;
    private int hargaMinuman;
    private int jumlahMinuman;

    private int totalHarga;
    private int uangPembayaran;
    private int kembalian;

    public void setMakanan(String nama, int harga, int jumlah) {
        this.makananDipilih = nama;
        this.hargaMakanan = harga;
        this.jumlahMakanan = jumlah;
    }

    public void setMinuman(String nama, int harga, int jumlah) {
        this.minumanDipilih = nama;
        this.hargaMinuman = harga;
        this.jumlahMinuman = jumlah;
    }

    public void hitungTotal() {
        totalHarga = (hargaMakanan * jumlahMakanan) + (hargaMinuman * jumlahMinuman);
    }

    public void setPembayaran(int uang) {
        this.uangPembayaran = uang;
        this.kembalian = uangPembayaran - totalHarga;
    }

    public String getMakanan() { return makananDipilih; }
    public int getJumlahMakanan() { return jumlahMakanan; }
    public int getHargaMakanan() { return hargaMakanan; }

    public String getMinuman() { return minumanDipilih; }
    public int getJumlahMinuman() { return jumlahMinuman; }
    public int getHargaMinuman() { return hargaMinuman; }

    public int getTotalHarga() { return totalHarga; }
    public int getUangPembayaran() { return uangPembayaran; }
    public int getKembalian() { return kembalian; }
}

class Kasir {
    Scanner input = new Scanner(System.in);

    public void tampilkanMenu() {
        System.out.println("=== TelU Coffee ===");
        System.out.println("Makanan  :");
        System.out.println("1. Mie Kuah        12000");
        System.out.println("2. Mie Goreng      8000");
        System.out.println("3. Ayam Geprek     15000");
        System.out.println("4. Mie Ayam Geprek 15000");
        System.out.println();
        System.out.println("Minuman :");
        System.out.println("1. Es Teh         4000");
        System.out.println("2. Es Jeruk       5000");
        System.out.println("3. Thai Tea       10000");
        System.out.println("4. Matcha         50000");
        System.out.println("=======================");
    }

    public void pilihMakanan(Menu menu) {
        int pilihanMakanan;
        int jumlah;

        System.out.print("Pilih makanan : ");
        pilihanMakanan = input.nextInt();

        System.out.print("Masukkan jumlah : ");
        jumlah = input.nextInt();
        System.out.println();

        if (pilihanMakanan == 1) {
            menu.setMakanan("Mie Kuah", 12000, jumlah);
        } else if (pilihanMakanan == 2) {
            menu.setMakanan("Mie Goreng", 8000, jumlah);
        } else if (pilihanMakanan == 3) {
            menu.setMakanan("Ayam Geprek", 15000, jumlah);
        } else if (pilihanMakanan == 4) {
            menu.setMakanan("Mie Ayam Geprek", 15000, jumlah);
        }
    }

    public void pilihMinuman(Menu menu) {
        int pilihanMinuman;
        int jumlah;

        System.out.print("Pilih minuman : ");
        pilihanMinuman = input.nextInt();

        System.out.print("Masukkan jumlah : ");
        jumlah = input.nextInt();
        System.out.println();

        if (pilihanMinuman == 1) {
            menu.setMinuman("Es Teh", 4000, jumlah);
        } else if (pilihanMinuman == 2) {
            menu.setMinuman("Es Jeruk", 5000, jumlah);
        } else if (pilihanMinuman == 3) {
            menu.setMinuman("Thai Tea", 10000, jumlah);
        } else if (pilihanMinuman == 4) {
            menu.setMinuman("Matcha", 50000, jumlah);
        }
    }

    public void pembayaran(Menu menu) {
        menu.hitungTotal();
        System.out.println("Total Harga : " + menu.getTotalHarga());

        System.out.print("Berikan uang : ");
        int uang = input.nextInt();

        menu.setPembayaran(uang);
        System.out.println();
    }

    public void cetakStruk(Menu menu) {
        System.out.println("=== Struk Pembelian ===");
        System.out.println(menu.getMakanan() + " x " + menu.getJumlahMakanan() + "   : " + (menu.getHargaMakanan() * menu.getJumlahMakanan()));
        System.out.println(menu.getMinuman() + " x " + menu.getJumlahMinuman() + "     : " + (menu.getHargaMinuman() * menu.getJumlahMinuman()));
        System.out.println("Total Harga    : " + menu.getTotalHarga());
        System.out.println("Uang diberikan : " + menu.getUangPembayaran());
        System.out.println("Kembalian      : " + menu.getKembalian());
        System.out.println("========================");
        System.out.println("Terima kasih, datang kembali!");
    }
}

public class TelUCoffee {
    public static void main(String[] args) {
        Kasir MenuToko = new Kasir();
        Menu menu = new Menu();

        MenuToko.tampilkanMenu();
        MenuToko.pilihMakanan(menu);
        MenuToko.pilihMinuman(menu);
        MenuToko.pembayaran(menu);
        MenuToko.cetakStruk(menu);
    }
}
