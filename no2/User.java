import java.util.List;
public class User extends Pengguna {
	public User(String nama) {
		super(nama);
	}
	
	public void Identifikasi() {
		System.out.println("User "+nama);	
	}
	
	public void ScoutBooks(List<Buku> ListBuku) {
		System.out.println("Daftar Buku: ");
		for (Buku buku : ListBuku) {
			System.out.println(buku);
		}
	}
}
