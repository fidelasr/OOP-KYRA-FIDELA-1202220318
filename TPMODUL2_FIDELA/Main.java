import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Hewan> hewanList = new ArrayList<>();
        boolean exit = false;

        while (!exit) {
            System.out.println("======EAD LABORATORY PET SHOP======");
            System.out.println("1. Tambah Hewan");
            System.out.println("2. Lihat Daftar Hewan");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.println("Tambah Hewan Baru:");
                    System.out.println("1. Kucing");
                    System.out.println("2. Burung");
                    System.out.print("Pilih jenis hewan: ");
                    int jenisHewan = scanner.nextInt();
                    scanner.nextLine(); 

                    System.out.print("Masukkan nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan umur: ");
                    int umur = scanner.nextInt();
                    scanner.nextLine(); 

                    if (jenisHewan == 1) {
                        System.out.print("Masukkan ras: ");
                        String ras = scanner.nextLine();
                        hewanList.add(new Kucing(nama, umur, ras));
                    } else if (jenisHewan == 2) {
                        System.out.print("Masukkan warna bulu: ");
                        String warnaBulu = scanner.nextLine();
                        hewanList.add(new Burung(nama, umur, warnaBulu));
                    } else {
                        System.out.println("Pilihan tidak valid!");
                    }
                    break;

                case 2:
                    System.out.println("Daftar Hewan:");
                    if (hewanList.isEmpty()) {
                        System.out.println("Tidak ada hewan dalam daftar.");
                    } else {
                        for (Hewan hewan : hewanList) {
                            hewan.infoHewan();
                            hewan.suara();
                            System.out.println();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih telah menggunakan EAD Laboratory Pet Shop!");
                    exit = true;
                    break;

                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }
        }
        scanner.close();
    }
}
