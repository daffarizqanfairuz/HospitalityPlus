/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalityplus;

/**
 *
 * @author idref
 */
public class layanan_tambahan {
    
    private String idLayanan;
    private String namaLayanan;
    private String deskripsi;
    private double harga;

    public layanan_tambahan(String idLayanan, String namaLayanan, String deskripsi, double harga) {
        this.idLayanan = idLayanan;
        this.namaLayanan = namaLayanan;
        this.deskripsi = deskripsi;
        this.harga = harga;
    }

    public String getIdLayanan() {
        return idLayanan;
    }

    public void setIdLayanan(String idLayanan) {
        this.idLayanan = idLayanan;
    }

    public String getNamaLayanan() {
        return namaLayanan;
    }

    public void setNamaLayanan(String namaLayanan) {
        this.namaLayanan = namaLayanan;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    
    
    
}
