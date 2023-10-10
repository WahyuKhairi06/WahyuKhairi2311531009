package Pekan2;

public class tugas2 {

	public static void main(String[] args) {
		// Input harga barang, jumlah barang, dan diskon
		
		int hargabarang,jumlahbarang;
		double diskon;
		hargabarang= 337000;
		jumlahbarang= 5; 
		diskon= 25; // Dalam persen

        // Menghitung total harga sebelum diskon
        double TotalSebelumDiskon = hargabarang * jumlahbarang;

        // Menghitung besaran diskon
        double BesaranDiskon = (diskon / 100) * TotalSebelumDiskon;

        // Menghitung total harga setelah diskon
        double TotalSetelahDiskon = TotalSebelumDiskon - BesaranDiskon;

        // Menampilkan output
        System.out.println("Total harga yang dibayarkan = Rp. " + TotalSetelahDiskon);

	}

}