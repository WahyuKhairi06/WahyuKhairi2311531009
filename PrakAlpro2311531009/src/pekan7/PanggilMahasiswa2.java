package pekan7;

import java.util.Scanner;

public class PanggilMahasiswa2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Nim : ");
		int NimSaya = input.nextInt();
		
		Scanner input2 = new Scanner (System.in);
		System.out.print("Nama : ");
		String NamaSaya = input2.nextLine();
		
		Mahasiswa a = new Mahasiswa ();
		a.setNim(NimSaya);
		a.setNama(NamaSaya);
		System.out.println(a.getNim());
		System.out.println(a.getNama());
		a.cetak();
		
		input.close();
		input2.close();
	}
	
}
