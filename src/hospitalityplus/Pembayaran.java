/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalityplus;

public class Pembayaran {
    private int idPembayaran;
    private double jumlah;
    private String tanggalPembayaran;
    private String metodePembayaran;
    private String statusPembayaran;

    public Pembayaran(int idPembayaran, double jumlah, String tanggalPembayaran, String metodePembayaran, String statusPembayaran) {
        this.idPembayaran = idPembayaran;
        this.jumlah = jumlah;
        this.tanggalPembayaran = tanggalPembayaran;
        this.metodePembayaran = metodePembayaran;
        this.statusPembayaran = statusPembayaran;
    }

    public int getIdPembayaran() {
        return idPembayaran;
    }

    public void setIdPembayaran(int idPembayaran) {
        this.idPembayaran = idPembayaran;
    }

    public double getJumlah() {
        return jumlah;
    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }

    public String getTanggalPembayaran() {
        return tanggalPembayaran;
    }

    public void setTanggalPembayaran(String tanggalPembayaran) {
        this.tanggalPembayaran = tanggalPembayaran;
    }

    public String getMetodePembayaran() {
        return metodePembayaran;
    }

    public void setMetodePembayaran(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }

    public String getStatusPembayaran() {
        return statusPembayaran;
    }

    public void setStatusPembayaran(String statusPembayaran) {
        this.statusPembayaran = statusPembayaran;
    }


    
    
}
