package prak4;

import java.util.Scanner;

public class perulanganFor4 {

	public static void main(String[] args) {
		int j, i;
		int Batas;
		Scanner input = new Scanner(System.in);
		System.out.print("Batas :");
		Batas = input.nextInt();
		input.close();
		j=0;
		
		for (i = Batas; i >= 1; i--) {
		j= j+i;
		if ( i > 1 ) { 
			System.out.print(i+" + ");
		} else {
			System.out.println(i);
		}
	}
		System.out.println();
		System.out.print("jumlah =" + j);

	}
}
