package TPMODUL1_FIDELA;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int pilihan;

            do {
                System.out.println("====== EAD Ticket Booking System ======");
                System.out.println("1. Tampilkan Daftar Penerbangan");
                System.out.println("2. Beli Tiket");
                System.out.println("3. Tampilkan Pesanan Tiket");
                System.out.println("4. Exit");
                System.out.print("Silahkan pilih menu: ");
                pilihan = scanner.nextInt();

                switch (pilihan) {
                    case 1:
                        tampilkanDaftarPenerbangan();
                        break;
                    case 2:
                        beliTiket();
                        break;
                    case 3:
                        tampilkanPesananTiket();
                        break;
                    case 4:
                        System.out.println("Terima kasih!");
                        break;
                    default:
                        System.out.println("Menu tidak tersedia");
                }
            } while (pilihan != 4);
        }
    }

    public static void tampilkanDaftarPenerbangan() {
        System.out.println("Nomor Penerbangan: GA001");
        System.out.println("Bandara Keberangkatan: CGK, Jakarta ---> Bandara Tujuan: DPS, Bali");
        System.out.println("Waktu Keberangkatan: 08:30 ---> Waktu Kedatangan: 08:15");
        System.out.println("Harga Tiket: Rp. 1.200.000,00\n");
        
        System.out.println("Nomor Penerbangan: GA002");
        System.out.println("Bandara Keberangkatan: SUB, Surabaya ---> Bandara Tujuan: KNO, Medan");
        System.out.println("Waktu Keberangkatan: 10:30 ---> Waktu Kedatangan: 11:45");
        System.out.println("Harga Tiket: Rp. 1.520.000,00\n");
    }

    public static void beliTiket() {
        System.out.println("Silakan isi data diri Anda terlebih dahulu.");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("NIK: ");
        }
        System.out.print("Nama Depan: ");
        System.out.print("Nama Belakang: ");
        System.out.println("Terima kasih telah mengisi data pelanggan.");
        System.out.println("Silakan pilih tiket penerbangan yang tersedia.");
        tampilkanDaftarPenerbangan();
        System.out.print("Pilih nomor penerbangan: ");
        System.out.println("Tiket berhasil dibeli! Cek pesanan tiket pada menu 'Tampilkan Pesanan Tiket'.\n");
    }

    public static void tampilkanPesananTiket() {
        System.out.println("======= Detail Tiket Penerbangan =======");
        System.out.println("Nama: EAD");
        System.out.println("Nomor Induk Kependudukan: 1234567890123456");
        System.out.println("Nama Lengkap: EAD");
        System.out.println("Nomor Penerbangan: GA001");
        System.out.println("Bandara Keberangkatan: CGK, Jakarta ---> Bandara Tujuan: DPS, Bali");
        System.out.println("Waktu Keberangkatan: 08:30 ---> Waktu Kedatangan: 08:15");
        System.out.println("Harga Tiket: Rp. 1.200.000,00\n");


    }
}
