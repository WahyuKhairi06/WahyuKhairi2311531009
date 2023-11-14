package prak4;

public class TugasPerulanganFor {
	
	public static void main(String[]args) {
		TutupAtas();
        BadanAtas();
        BadanBawah();
        TutupBawah();
      	     }
	
	public static void TutupAtas() {
		System.out.println("#================#");
	}
	public static void BadanAtas() {
		for ( int baris =1; baris <= 4 ; baris ++) {
			System.out.print("|");
			for ( int spasi =1 ; spasi <= baris *-2 +8;spasi ++) {
				System.out.print(" "); 
			}
			System.out.print("<>");
			for ( int titik =1;titik <= baris *4-4;titik++) {
				System.out.print(".");
			}
			System.out.print("<>");
			for ( int spasi =1 ;spasi <= baris * -2 +8;spasi ++ ) {
				System.out.print(" ");
			}
			System.out.println("|");
		}
	}
	public static void BadanBawah () {
		for ( int baris =1; baris <= 4 ; baris ++) {
			System.out.print("|");
			for ( int spasi =1 ; spasi <= baris *2-2;spasi ++) {
				System.out.print(" "); 
			}
			System.out.print("<>");
			for ( int titik =1;titik <= baris *-4+16;titik++) {
				System.out.print(".");
			}
			System.out.print("<>");
			for ( int spasi =1 ;spasi <= baris *2-2;spasi ++ ) {
				System.out.print(" ");
			}
			System.out.println("|");
		}
	}		
	public static void TutupBawah() {
	System.out.println("#================#");
	}
}