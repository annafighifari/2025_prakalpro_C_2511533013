package pekan2;

public class DeklarasiVariabel {
	/* program java 
	 * latihan
	 * tentang pendeklarasian variabel
	 * */
	static int umur =25; /* Variabel dapat langsung diinisasi */
	public static void main(String[] args) {
		int kode;
		boolean isDibawahUmur; /* perhatikan penulisan nama variabel */
		kode = 1234; /* Pengisian variabel (assignment) */
		double gaji; /* Deklarasi variabel dapat dimana saja */
		gaji = 5500000.23;
		isDibawahUmur = true;
		System.out.println("Status: "+isDibawahUmur);
		System.out.println("Kode: "+kode);
		System.out.println("Umur: "+umur);
		System.out.println("Gaji: "+gaji);
	
	}

}