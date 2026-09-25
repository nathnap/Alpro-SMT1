import java.util.Scanner;

public class arrayInputNilai {
	public static void main(String[] args) {

        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int[] array3 = new int[10];

        Scanner inp = new Scanner(System.in);

        System.out.println("Masukkan Nilai Array 1: ");
        for( int i = 0; i < array1.length; i++ ){
        	System.out.print("Masukkan Nilai ke- " +  i + " : ");
        		array1[i] = inp.nextInt();
        }
        System.out.println("Masukkan Nilai Array 2: ");
        for( int i = 0; i < array2.length; i++ ){
        	System.out.print("Masukkan Nilai ke- " +  i + " : ");
        		array2[i] = inp.nextInt();
        	}

        	for( int i = 0; i < array3.length; i++ ){
        		array3[i] = array1[i] + array2[i];
        }
       		System.out.print("\n Array 1: ");
       			for(int i = 0; i < 10; i++){
       				System.out.print(array1[i] + " ");
       			}

       		System.out.print("\n Array 2: ");
       			for(int i = 0; i < 10; i++){
       				System.out.print(array2[i] + " ");

       			}
       		System.out.print("\n Array 3: ");
       			for(int i = 0; i < 10; i++){
       				System.out.print(array3[i] + " ");
	       			}
	}
}