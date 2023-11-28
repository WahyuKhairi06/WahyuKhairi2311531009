package pekan6;
import java.util.Scanner;

public class TugasPerulanganPekan6 {

		 public static void main(String[] args) {
			 Scanner in = new Scanner(System.in);
			 System.out.print("Input = ");
			 int i;
			 int j;
			 int k;
			 int n = in.nextInt();
			 int uji = n/2;
			 
		        for ( i = 1; i <= n; i++) {
		        	if (i % 2 != 0 ) {
		        		for (j = 1; j <= uji + 1 ; j++) {
		        			System.out.print("_");
		        		}
		       }else {
		    	       System.out.print(" ");
		    	       for (k = 1; k <= uji; k++ ) {
		    	       System.out.print("_");
		 }
	   }
	 System.out.println();
	 }
	
	 in.close();
  }
		 
}
		
