package pekan6;

import java.util.Scanner;
public class Ternary1 {

	public static void main(String[] args) {
		double IPK;
		String stat1="Anda Lulus Sangat Memuaskan";
		Scanner input = new Scanner(System.in);
		System.out.println("Input IPK Anda = ");
		IPK=input.nextDouble();
		input.close();
		String hasil = (IPK > 2.75)?stat1 : "Anda Lulus Memuaskan";
		System.out.println(hasil);
		
	}

}
