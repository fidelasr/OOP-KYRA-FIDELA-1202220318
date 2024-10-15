// Don't delete any comments below!!!
// Todo: Import Scanner
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Todo : Create ManajemenInventaris Object and Scanner
        ManajemenInventaris manajemen = new ManajemenInventaris();
        Scanner scanner = new Scanner(System.in);
        int pilihan = 0
        // Todo : Create Loop list menu
        while (pilihan != 4) {
            System.out.println("====Menu====")

            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    manajemen.tambahMakananKering();
                    break;
                case 2:
                    manajemen.tambahMakananBasah();
                    break;
                case 3: 
                    TampilkanData();
                    break;
                case 4:
                    System.out.println("Keluar Dari Program")
            }
        }
        
    }
    Scanner.close();
}
