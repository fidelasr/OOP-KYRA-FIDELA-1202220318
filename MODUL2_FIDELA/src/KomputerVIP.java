class KomputerVIP extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    protected boolean vipCard;
    
    // To do: Buatlah constructor pada class KomputerVIP
    public KomputerVIP(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean vipCard) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.vipCard = vipCard;
    }
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    @Override
    public void Informasi() {
        super.Informasi();
        if (vipCard) {
            System.out.println("Status: Member VIP");
            System.out.println("Benefit Member VIP");
            System.out.println("- Diskon 10% untuk bermain di atas 3 jam");
            System.out.println("- Gratis minuman setiap 4 jam bermain");
            System.out.println("- Prioritas booking komputer gaming");
        } else {
            System.out.println("Status: Non VIP");
            System.out.println("Benefit Non VIP:");
            System.out.println("- Tidak ada, kalaw mau benefit jadi VIP dulu");
        }
    }

    // To do: Buatlah method Login sesuai dengan ketentuan
    public void Login(String username){
        System.out.println("Login dengan username: " + username);
    }
    // To do: Buatlah method Bermain sesuai dengan ketentuan
    public void Bermain(int jam){
        System.out.println("Bermain selama: " + jam);
    }
    // To do: Buatlah method Bermain memakai Polymorphism Overloading sesuai dengan ketentuan
    public void Bermain(int jam, int menitTambahan){
        System.out.println("Menambah Billing selama" + jam + "jam" + menitTambahan + "menit");
    }
}