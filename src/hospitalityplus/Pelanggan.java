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
public class Pelanggan {
    private int idPelanggan;
    private String nama_pelanggan;

    public Pelanggan(int idPelanggan, String nama_pelanggan) {
        this.idPelanggan = idPelanggan;
        this.nama_pelanggan = nama_pelanggan;
    }

    public int getIdPelanggan() {
        return idPelanggan;
    }

    public String getNama_pelanggan() {
        return nama_pelanggan;
    }

    public void setIdPelanggan(int idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public void setNama_pelanggan(String nama_pelanggan) {
        this.nama_pelanggan = nama_pelanggan;
    }
   
}