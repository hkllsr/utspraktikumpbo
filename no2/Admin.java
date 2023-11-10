import java.util.List;
public class Admin extends Pengguna {
	public Admin(String nama) {
		super(nama);
	}

	public void Identifikasi() {
		System.out.println("Admin "+nama);	
	}
	
	public void ScoutBooks(List<Buku> ListBuku) {
		System.out.println("Daftar Buku: ");
		for (Buku buku : ListBuku) {
			System.out.println(buku);
		}
	}

}
