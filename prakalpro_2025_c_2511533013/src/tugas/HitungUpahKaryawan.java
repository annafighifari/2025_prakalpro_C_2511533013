package tugas;

import java.util.Scanner;

public class HitungUpahKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String namaKaryawan;
        char golongan;
        int jamKerja;
        int upahPerJam = 0;
        int bonus = 0;
        int totalUpah;

        System.out.print("Masukkan nama karyawan: ");
        namaKaryawan = input.nextLine();

        System.out.print("Masukkan golongan (A/B/C/D): ");
        golongan = input.next().charAt(0);

        System.out.print("Masukkan jumlah jam kerja: ");
        jamKerja = input.nextInt();

        switch (golongan) {
            case 'A':
                upahPerJam = 1000;
                break;
            case 'B':
                upahPerJam = 2000;
                break;
            case 'C':
                upahPerJam = 3000;
                break;
            case 'D':
                upahPerJam = 4000;
                break;
            default:
                System.out.println("Golongan tidak valid!");
                return;
        }

        if (jamKerja > 60) {
            bonus = (jamKerja - 60) * 5000;
        }

        totalUpah = (jamKerja * upahPerJam) + bonus;

        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Nama Karyawan: " + namaKaryawan);
        System.out.println("Upah Mingguan: Rp" + totalUpah);

        input.close();
    }
}
