import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class BukuMain {
	
	public static void hapusBuku(List<Buku> ListBuku, Buku buku) {
		if(ListBuku.contains(buku)) {
			ListBuku.remove(buku);
			System.out.println("Buku berhasil dihapus.");
		}else {
			System.out.println("Buku tidak ditemukan.");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<Buku> ListBuku = new ArrayList<Buku>();
		ListBuku.add(new Komik("Doraemon"));
		ListBuku.add(new Historical("Origin Story of Nazism"));
		
		System.out.print("Login (User/Admin): ");
		String login = input.nextLine();
		if(login.equalsIgnoreCase("User")) {
			System.out.print("Masukan Nama User: ");
			String nama = input.nextLine();
			User user = new User(nama);
			user.Identifikasi();
			System.out.println();
			user.ScoutBooks(ListBuku);
		} else if(login.equalsIgnoreCase("Admin")){
			System.out.print("Masukan Nama Admin: ");
			String nama = input.nextLine();
			Admin admin = new Admin(nama);
			admin.Identifikasi();
			System.out.println();
			System.out.println("Pilih Menu:");
			System.out.println("1. Tambah Buku");
			System.out.println("2. Lihat Daftar Buku");
			System.out.println("3. Hapus Buku");
			System.out.print("Tentukan Pilihan Menu (1-3): ");
			int pil = input.nextInt();
			input.nextLine();
			switch (pil) {
			case 1: {
				System.out.println();
				System.out.print("Masukan judul Buku Baru: ");
				String JudulBukuBaru = input.nextLine();
				System.out.print("Masukan Genre Buku: ");
				String GBaru = input.nextLine();
				if(GBaru.equalsIgnoreCase("Komik")) {
					ListBuku.add(new Komik(JudulBukuBaru));
					System.out.println("Buku berhasil ditambahkan");
					admin.ScoutBooks(ListBuku);
				}else if(GBaru.equalsIgnoreCase("Non-Komik")) {
					ListBuku.add(new Historical(JudulBukuBaru));
					System.out.println("Buku berhasil ditambahkan");
					admin.ScoutBooks(ListBuku);
				}
				break;
			}
			case 2: {
				System.out.println();
				admin.ScoutBooks(ListBuku);
				break;
			}
			case 3: {
			    System.out.println();
			    System.out.print("Masukan judul Buku yang ingin dihapus: ");
			    String RemovedTitle = input.nextLine();
			    boolean BookFound = false;
			    for (Buku buku : ListBuku) {
			        if (buku.judul.equalsIgnoreCase(RemovedTitle)) {
			            ListBuku.remove(buku);
			            System.out.println("Buku berhasil dihapus.");
			            BookFound = true;
			        }
			    }
			    if (!BookFound) {
			        System.out.println("Buku tidak ditemukan.");
			    }
			    admin.ScoutBooks(ListBuku);
			    break;
			}
			default:
				System.out.println("Menu yang anda pilih tidak tersedia.");
			}
		} else {
			System.out.println("Pengguna tidak terdaftar.");
		}
		
	}
}