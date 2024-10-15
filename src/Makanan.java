// Don't delete any comments below!!!
public class Makanan {
    // Todo : Create private attribute of Makanan (nama, jumlah, and harga)
    private String nama;
    private int jumlah;
    private double harga; 
    // Todo : Create Constructor of Makanan
    public Makanan {
        nama = "Kebab";
        jumlah = 5;
        harga = 10.000;
    }
    public Makanan(String nama, int jumlah, double harga) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
    }
    public void display() {
        System.out.println("Nama: " + nama + "Jumlah: " + jumlah + "Harga: " + harga);
    }
    public static void main(String[] args) {
        Makanan makanan1 = new Makanan();
        Makanan makanan2 = new Makanan("Cimol", 2, 5.000);
        makanan1.display();
        makanan2.display();
    }
    // Todo : Create Getter and Setter
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public int getJumlah(){
        return jumlah;
    }
    public void setJumlah(int jumlah){
        this.jumlah = jumlah; 
    }
    public double getHarga(){
        return harga;
    }
    public void setHarga(double harga){
        this.harga = harga;
    }

}
