package pekan6;

import java.util.Scanner;

public class pretest {

	public static void main(String[] args) {
		int angka;
		Scanner input = new Scanner (System.in);
		System.out.println("Masukkan angka = ");
		angka = input.nextInt();
		input.close();
		
		for (int i = angka; i >= 1; i--) {
			if (angka % i == 0) {
				System.out.println(i);
			}
		}
	}
}