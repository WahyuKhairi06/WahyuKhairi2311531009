package pekan3;

import java.util.Scanner;

public class BilanganGenapGanjil {

	public static void main(String[] args) {
		
		long NoNIM;
		Scanner input=new Scanner(System.in);
		System.out.println("Masukkan No NIM Anda :");
		NoNIM = input.nextLong();
		input.close();
		
		if (NoNIM % 2 == 0) {
			System.out.println("Merupakan Bilangan Genap");
		} else {
			System.out.println("Merupakan Bilangan Ganjil");
		}
	}

}
