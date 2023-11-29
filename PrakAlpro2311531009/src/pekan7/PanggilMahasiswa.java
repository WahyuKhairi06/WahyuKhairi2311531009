package pekan7;

public class PanggilMahasiswa {

	public static void main(String[] args) {
		Mahasiswa a = new Mahasiswa ();
		a.setNim(1009);
		a.setNama("wahyu khairi");
		System.out.println(a.getNim());
		System.out.println(a.getNama());
		a.cetak();
	}

}
