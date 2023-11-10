public class Kucing extends Hewan {
	public Kucing(String Suaranya) {
		super("Meong");
	}

	public void bersuara() {
		System.out.println("Suara Kucing: "+Suaranya);
	}
	
	public void jenis() {
		System.out.println("Hewan ini addalah mamalia");
	}
}
