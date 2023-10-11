package pekan3;

import java.util.Scanner;

public class CekUmur3 {

	public static void main(String[] args) {
		int umur;
		char sim;
		Scanner input=new Scanner(System.in);
		System.out.println("Inputkan Umur Anda: ");
		umur=input.nextInt();
		System.out.println("Apakah Anda Sudah punya SIM C?");
		sim = input.next().charAt (0);
		input.close();
		if ((umur >= 17)&&(sim=='y')) {
		System.out.println("Anda Sudah Dewasa dan Boleh bawa motor");
		}
		if ((umur >= 17)&&(sim!='y')) {
			System.out.println("Anda Sudah Dewasa tetapi tidak boleh bawa motor");
		}
		if ((umur < 17)&&(sim!='y')) {
			System.out.println("Anda masih bocah dan belum boleh bawa motor");
			
		}
			
	}
	
}