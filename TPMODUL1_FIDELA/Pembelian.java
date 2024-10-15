package TPMODUL1_FIDELA;

import java.util.ArrayList;
import java.util.Scanner;

public class Pembelian {
    public static void main(String[] args) {
        ArrayList<Penerbangan> daftarPenerbangan = new ArrayList<>();
        daftarPenerbangan.add(new Penerbangan("001", "Jakarta", "Bali", "08:00", "10:00", 1500000));
        daftarPenerbangan.add(new Penerbangan("002", "Jakarta", "Surabaya", "09:00", "11:00", 1200000));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Daftar Penerbangan:");
        for (int i = 0; i < daftarPenerbangan.size(); i++) {
            System.out.print((i + 1) + ". ");
            daftarPenerbangan.get(i).tampilDaftarPenerbangan();
        }

        System.out.println("Masukkan NIM, Nama Depan, dan Kelas:");
        String NIM = scanner.next();
        String namaDepan = scanner.next();
        String kelas = scanner.next();
        Penumpang penumpang = new Penumpang(NIM, namaDepan, kelas);

        System.out.println("Pilih nomor penerbangan:");
        int pilihan = scanner.nextInt();

        System.out.println("Tiket berhasil dipesan:");
        penumpang.tampilDaftarPenumpang();
        daftarPenerbangan.get(pilihan - 1).tampilDaftarPenerbangan();

        scanner.close();
    }
}
