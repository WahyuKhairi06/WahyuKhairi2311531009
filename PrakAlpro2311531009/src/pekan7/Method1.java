package pekan7;

import java.util.Scanner;

public class Method1 {

	public static void main(String[] args) {
		
		// deklarasi variabel
		int umur;
		char sim;
		String jawab="ya";
		// deklarasi scanner
		Scanner scan = new Scanner(System.in);
		while (!jawab.equalsIgnoreCase("tidak")) {
			System.out.println("Input Umur Anda : ");
			umur = scan.nextInt();
			System.out.println("Apakah Anda Sudah Punya Sim? (Y/N) : ");
			sim = scan.next().charAt(0);
			
			Razia (umur,sim);
			
			System.out.println("Apakah lanjut (ya / tidak?)");
			jawab= scan.next();
			}
			System.out.println("Terimakasih sudah menggunakan program kami");
			scan.close();
	}
	static void Razia (int a, char b)	{
		if((a >= 17) &&(b == 'Y')) {
			System.out.println("Anda Sudah Dewasa Dan Boleh membawa motor");
		}
		if((a >= 17) &&(b != 'Y')) {
			System.out.println("Anda Sudah Dewasa namun Boleh membawa motor");
		}
		if((a < 17) &&(b == 'Y')) {
			System.out.println("Anda Belum Dewasa namun Boleh membawa motor");
		}
		if((a < 17) &&(b != 'Y')) {
			System.out.println("Anda Belum Dewasa dan belum boleh membawa motor");
		}
	}
}
