package pekan2;

public class tugasAlpropekan2 {
    public static void main(String[] args) {
        // Deklarasi variabel dengan tipe data dasar
        int saldoAwal = 5000000;      // saldo awal nasabah (dalam satuan rupiah)
        float bungaPerBulan = 1.5f;   // bunga per bulan dalam persen (misal 1.5%)
        char kategoriNasabah = 'P';   // kategori nasabah: 'P' = Premium, 'R' = Reguler, 'S' = Silver
        boolean aktif = true;         // status keanggotaan nasabah

        // Menghitung saldo setelah 5 bulan
        // Rumus: saldo akhir = saldo awal * (1 + (bungaPerBulan / 100) * 5)
        float saldoAkhir = saldoAwal * (1 + (bungaPerBulan / 100) * 5);

        // Menampilkan data ke layar dengan format rapi
        System.out.println("=== Data Uang Nasabah Per 5 Bulan ===");
        System.out.println("Saldo Awal     : Rp " + saldoAwal);
        System.out.println("Bunga/Bulan    : " + bungaPerBulan + "%");
        System.out.println("Kategori       : " + kategoriNasabah);
        System.out.println("Status Aktif   : " + aktif);
        System.out.println("Saldo Akhir (5 bln): Rp " + String.format("%.2f", saldoAkhir));
    }
}