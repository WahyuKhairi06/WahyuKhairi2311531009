package prak4;

public class perulanganFor3 {

	public static void main(String[] args) {
		int j, i;
		j = 0;
		for(i = 10; i >= 1 ; i--) {
			j=j+i;
			  if ( i > 1) {
				System.out.print(i + " + ");
			} else {
				System.out.println(i);
			}
		}
		System.out.print("jumlah = " + j);

	}

}
