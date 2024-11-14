public class Main {
    public static void main(String[] args) {
        // To do: Buatlah sebuah Objek baru dari class Komputer
        Komputer komputer = new Komputer(20, "null", 5000);

        // To do: Panggillah Method Informasi dari class Komputer
        komputer.Informasi();

        // To do: Buatlah sebuah Objek baru dari class KomputerVIP 
        KomputerVIP komputerVIP = new KomputerVIP(6, "Khronos", 10000, true);

        // To do: Panggillah Method Informasi dari class KomputerVIP
        komputerVIP.Informasi();

        // To do: Panggillah Method Login
        komputerVIP.Login("Asep");

        // To do: Panggillah Method Bermain 2x agar dapat melakukan polymorphism overloading
        komputerVIP.Bermain(2);
        komputerVIP.Bermain(2, 30);


        // To do: Buatlah sebuah Objek baru dari class KomputerPremium
        KomputerPremium komputerPremium = new KomputerPremium(6, "Khronos", 50000, false);

        // To do: Panggillah Method Informasi dari class KomputerPremium
        komputerPremium.Informasi();

        // To do: Panggillah Method Pesan
        komputerPremium.Pesan(6);

        // To do: Panggillah Method TambahLayanan 2x agar dapat melakukan polymorphism overloading
       komputerPremium.TambahLayanan("indomie");
       komputerPremium.TambahLayanan("bakso", "esteh");
    }
}
