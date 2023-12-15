package hospitalityplus;

/**
 *
 * @author idref
 */
public class Pemesanan {
    private int idPemesanan;
    private String jenisKamar;
    private String tanggalCheckin;
    private String tanggalCheckout;
    private double totalPembayaran;

    public Pemesanan(int idPemesanan, String jenisKamar, String tanggalCheckin, String tanggalCheckout, double totalPembayaran) {
        this.idPemesanan = idPemesanan;
        this.jenisKamar = jenisKamar;
        this.tanggalCheckin = tanggalCheckin;
        this.tanggalCheckout = tanggalCheckout;
        this.totalPembayaran = totalPembayaran;
    }

    public int getIdPemesanan() {
        return idPemesanan;
    }

    public void setIdPemesanan(int idPemesanan) {
        this.idPemesanan = idPemesanan;
    }

    public String getJenisKamar() {
        return jenisKamar;
    }

    public void setJenisKamar(String jenisKamar) {
        this.jenisKamar = jenisKamar;
    }

    public String getTanggalCheckin() {
        return tanggalCheckin;
    }

    public void setTanggalCheckin(String tanggalCheckin) {
        this.tanggalCheckin = tanggalCheckin;
    }

    public String getTanggalCheckout() {
        return tanggalCheckout;
    }

    public void setTanggalCheckout(String tanggalCheckout) {
        this.tanggalCheckout = tanggalCheckout;
    }

    public double getTotalPembayaran() {
        return totalPembayaran;
    }

    public void setTotalPembayaran(double totalPembayaran) {
        this.totalPembayaran = totalPembayaran;
    }

    
    
    
}