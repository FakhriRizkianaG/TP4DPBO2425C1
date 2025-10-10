public class Product {
    private String id;
    private String nama;
    private double signalPower;
    private String kategori;
    private double frekuensi;

    public Product(String id, String nama, double signalPower, String kategori, double frekuensi) {
        this.id = id;
        this.nama = nama;
        this.signalPower = signalPower;
        this.kategori = kategori;
        this.frekuensi = frekuensi;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSignalPower(double signalPower) {
        this.signalPower = signalPower;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public void setFrekuensi(double frekuensi) {
        this.frekuensi = frekuensi;
    }

    public String getId() {
        return this.id;
    }

    public String getNama() {
        return this.nama;
    }

    public double getSignalPower() { return this.signalPower; }

    public String getKategori()  { return this.kategori; }

    public double getFrekuensi() { return this.frekuensi; }
}