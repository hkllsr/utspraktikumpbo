import java.util.Scanner;

class Hewan {
    String jenisHewan;

    Hewan(String jenisHewan) {
        this.jenisHewan = jenisHewan;
    }

    void bersuara() {
        System.out.println("Suara hewan");
    }

    void jenis() {
        System.out.println("Jenis hewan: " + jenisHewan);
    }
}

class Kucing extends Hewan implements Mamalia {
    Kucing(String jenisHewan) {
        super(jenisHewan);
    }

    @Override
    void bersuara() {
        System.out.println("Meong");
    }
}

class Anjing extends Hewan implements Mamalia {
    Anjing(String jenisHewan) {
        super(jenisHewan);
    }

    @Override
    void bersuara() {
        System.out.println("Guk Guk");
    }
}

public class DemoHewan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Hewan hewan = null;

        System.out.print("Masukan jenis hewan: ");
        String jenisHewan = input.nextLine();

        if (jenisHewan.equalsIgnoreCase("Kucing")) {
            hewan = new Kucing(jenisHewan);
        } else if (jenisHewan.equalsIgnoreCase("Anjing")) {
            hewan = new Anjing(jenisHewan);
        } else {
            System.out.println("Jenis hewan ini tidak dikenal.");
            System.exit(0);
        }

        hewan.bersuara();

        System.out.print("\nApakah anda Ingin melihat hewan ini jenis apa? (Y/N): ");
        String pil = input.nextLine();

        if (pil.equalsIgnoreCase("Y")) {
            hewan.jenis();
            if (hewan instanceof Mamalia) {
                System.out.println("Hewan ini adalah mamalia.");
            } else {
                System.out.println("Hewan ini bukan mamalia.");
            }
        } else if (pil.equalsIgnoreCase("N")) {
            System.out.println(".");
        } else {
            System.out.println("Pilihan yang anda masukan salah.");
        }
    }
}

interface Mamalia {
}
