class Komputer {
    protected int jumlahKomputer;
    protected String namaWarnet;
    protected float hargaPerJam;
    
    // To do: Buatlah constructor pada class Komputer
    public Komputer(int jumlahKomputer, String namaWarnet, float hargaPerJam){
        this.jumlahKomputer = jumlahKomputer;
        this.namaWarnet = namaWarnet;
        this.hargaPerJam = hargaPerJam;
    }
    // To do: Buatlah Method Informasi dengan isi yang sesuai dengan ketentuan 
    public void Informasi() {
        System.out.println("=============================\n");
        System.out.println("INFORMASI KOMPUTER: ");
        System.out.println("Jumlah Komputer: " + jumlahKomputer);
        System.out.println("Nama Warnet: " + namaWarnet);
        System.out.println("Harga Per Jam: " + hargaPerJam);

    }
}