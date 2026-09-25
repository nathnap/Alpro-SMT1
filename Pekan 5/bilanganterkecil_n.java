import java.util.Scanner;

public class bilanganterkecil_n {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, temp, batas;
        System.out.print("Masukkan angka: ");
        batas = input.nextInt();

        int jumlah = 1;

        while(jumlah <= batas) {
            jumlah++;
            temp = jumlah*jumlah*jumlah;

            if (temp > batas) {
                System.out.println(jumlah + " ___________ while loop");
                break;
            }
        }

        for (int how = 1; how <= batas; how++) {
            temp = how*how*how;

            if (temp > batas) {
                System.out.println(how + " ___________ for loop");
                break; 
            }
        }

        int much = 1;

        do {
            much++;
            temp = much*much*much;

        if (temp > batas) {
                System.out.println(much + " ___________ do while loop");
                break; 
            }
            }
        while (much <= batas);
    }
}
