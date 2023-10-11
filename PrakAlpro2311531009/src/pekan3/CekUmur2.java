package pekan3;

import java.util.Scanner;

public class CekUmur2 {

	public static void main(String[] args) {
		int umur;
		Scanner input=new Scanner(System.in);
		System.out.println("Inputkan Umur Anda:");
		umur=input.nextInt();
		input.close();
		if (umur >= 17) {
		System.out.println("Anda Sudah Dewasa");
		} else {
			System.out.println("Anda Masih Bocah");
		}
	}
}