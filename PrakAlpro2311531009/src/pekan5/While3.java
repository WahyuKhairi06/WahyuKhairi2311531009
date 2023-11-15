package pekan5;

import java.util.Scanner;

public class While3 {

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
					if((umur >= 17) &&(sim == 'Y')) {
						System.out.println("Anda Sudah Dewasa Dan Boleh membawa motor");
					}
					if((umur >= 17) &&(sim != 'Y')) {
						System.out.println("Anda Sudah Dewasa namun Boleh membawa motor");
					}
					if((umur < 17) &&(sim == 'Y')) {
						System.out.println("Anda Belum Dewasa namun Boleh membawa motor");
					}
					if((umur < 17) &&(sim != 'Y')) {
						System.out.println("Anda Belum Dewasa dan belum boleh membawa motor");
					}
					System.out.println("Apakah lanjut (ya / tidak?)");
					jawab= scan.next();
					}
					System.out.println("Terimakasih sudah menggunakan program kami");
					scan.close();
			}
		}