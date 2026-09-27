import java.util.Scanner;

public class konversiangka_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        if (angka < 1 && angka > 999) {
            System.out.println("Input tidak valid! Harus antara 1 - 999.");
        } else {
            String hasil = "";

            int ratus = angka / 100;
            int sisa = angka % 100;

            if (ratus > 0) {
                switch (ratus) {
                    case 1: hasil += "seratus"; break;
                    case 2: hasil += "dua ratus"; break;
                    case 3: hasil += "tiga ratus"; break;
                    case 4: hasil += "empat ratus"; break;
                    case 5: hasil += "lima ratus"; break;
                    case 6: hasil += "enam ratus"; break;
                    case 7: hasil += "tujuh ratus"; break;
                    case 8: hasil += "delapan ratus"; break;
                    case 9: hasil += "sembilan ratus"; break;
                }
                if (sisa > 0) hasil += " ";
            }

            if (sisa > 0 && sisa < 10) {
                    switch (sisa) {
                        case 1: hasil += "satu"; break;
                        case 2: hasil += "dua"; break;
                        case 3: hasil += "tiga"; break;
                        case 4: hasil += "empat"; break;
                        case 5: hasil += "lima"; break;
                        case 6: hasil += "enam"; break;
                        case 7: hasil += "tujuh"; break;
                        case 8: hasil += "delapan"; break;
                        case 9: hasil += "sembilan"; break;
                    
                } 
                else if (sisa < 20) {
                    switch (sisa) {
                        case 10: hasil += "sepuluh"; break;
                        case 11: hasil += "sebelas"; break;
                        case 12: hasil += "dua belas"; break;
                        case 13: hasil += "tiga belas"; break;
                        case 14: hasil += "empat belas"; break;
                        case 15: hasil += "lima belas"; break;
                        case 16: hasil += "enam belas"; break;
                        case 17: hasil += "tujuh belas"; break;
                        case 18: hasil += "delapan belas"; break;
                        case 19: hasil += "sembilan belas"; break;
                    }
                } 
                else {
                    int puluh = sisa / 10;
                    int satuan = sisa % 10;

                    switch (puluh) {
                        case 2: hasil += "dua puluh"; break;
                        case 3: hasil += "tiga puluh"; break;
                        case 4: hasil += "empat puluh"; break;
                        case 5: hasil += "lima puluh"; break;
                        case 6: hasil += "enam puluh"; break;
                        case 7: hasil += "tujuh puluh"; break;
                        case 8: hasil += "delapan puluh"; break;
                        case 9: hasil += "sembilan puluh"; break;
                    }

                    if (satuan > 0) {
                        hasil += " ";
                        switch (satuan) {
                            case 1: hasil += "satu"; break;
                            case 2: hasil += "dua"; break;
                            case 3: hasil += "tiga"; break;
                            case 4: hasil += "empat"; break;
                            case 5: hasil += "lima"; break;
                            case 6: hasil += "enam"; break;
                            case 7: hasil += "tujuh"; break;
                            case 8: hasil += "delapan"; break;
                            case 9: hasil += "sembilan"; break;
                        }
                }
            }
            }

            System.out.println("Output: " + hasil);
        }
    }
}