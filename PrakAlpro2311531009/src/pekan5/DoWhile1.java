package pekan5;

import java.util.Scanner;

public class DoWhile1 {

	public static void main(String[] args) {
		// buat variabel
		int counter = 0;
		String jawab;
		boolean running=true;
				
		//deklarasi scanner
		Scanner scan = new Scanner (System.in);
		do {
			counter++;
			System.out.println("Jumlah = "+counter);
			System.out.print("Apakah lanjut (ya / tidak?)");
			jawab = scan.nextLine();
			
		//cek jawab = tidak, perulangan berhenti
		if (jawab.equalsIgnoreCase("tidak")) {
			running = false;
		  }
	   }
	    while (running);
		System.out.println("Apakah sudah melakukan perulangan sebanyak " +counter+" kali");
		scan.close();
		

	}

}
