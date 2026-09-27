import java.util.Scanner;

public class PenghitungPecahanUang {

    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);

System.out.print("Input");

        final int A = 10000;
        final int B = 5000;
        final int C = 2000;
        final int D = 1000;
        final int E = 500;
        final int F = 200;
        final int G = 100;
	final int H = 50;

	int a,b,c,d,e,f,g,h;

        System.out.print("Masukkan nominal uang (n): ");
        int n = userInput.nextInt();

        a = n / A;
        n = n % A;
        b = n / B;
        n = n % B; 
        c = n / C;
        n = n % C;
        d = n / D;
        n = n % D;
        e = n / E;
        n = n % E;
        f = n / F;
        n = n % F;
	g = n / G;
        n = n % G;
	h = n / H;
        n = n % H;

        System.out.println ("---Output---");
        System.out.println("--------------------------");
        System.out.println("Hasil Rincian Pecahan:");
        System.out.println("jumlah 10000 = " + a);
        System.out.println("jumlah 5000 = " + b);
        System.out.println("jumlah 2000 = " + c);
        System.out.println("jumlah 1000 = " + d);
        System.out.println("jumlah 500 = " + e);
        System.out.println("jumlah 200 = " + f);
        System.out.println("jumlah 100 = " + g);
	System.out.println("jumlah 50 = " + h);
        System.out.println("--------------------------");
        
        userInput.close();
    }
}