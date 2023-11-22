package pekan6;

import java.util.Scanner;

public class Pemilu2024 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Nama: ");
		String nama=in.nextLine();
		System.out.println("Umur: ");
		int umur=in.nextInt();
		System.out.print("Inputkan Pilihan Anda (1-3): ");
		int n = in.nextInt();
		System.out.println("Nama: " + nama );
		System.out.println("Umur: " + umur);
		System.out.println("pilihan: " + n);
		
		switch(n) {
		case 1:
			System.out.println("Anda memilih Anies");
			break;
		case 2: 
			System.out.println("Anda memilih Prabowo");
			break;
		case 3:
			System.out.println("Anda memilih Ganjar");
			break;
		default:
			System.out.println("Anda memilih Nurhadi Aldo");	
		}
		System.out.println("Terimakasih sudah memilih");
		in.close();	
	}

}