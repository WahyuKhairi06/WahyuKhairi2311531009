package pekan5;

import java.util.Scanner;

public class TugasPerulanganWhile {

	public static void main(String[] args) {
		
		  int sum=0;
	      int num;
	        
	        // Deklarasi Scanner
	        Scanner input = new Scanner (System.in);
	        System.out.println("Enter a number :");
	        num = input.nextInt();

	        // Deklarasi While
	        while (num >= 0) {
	            sum = sum + num;
	        System.out.println("Enter a number :");
	            
	            num = input.nextInt();
	        }

	        System.out.println("Jumlah bilangan bulat positif: " + sum );
	        System.out.println("Program berhenti karena bilangan negatif diinputkan");
	        
	        input.close();
	    }

	}