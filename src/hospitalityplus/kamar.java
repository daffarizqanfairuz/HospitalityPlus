/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalityplus;

public class kamar {
    private String nomor_kamar;
    private String jenis_kamar;
    private String ketersediaan;

    public kamar(String nomor_kamar, String jenis_kamar, String ketersediaan) {
        this.nomor_kamar = nomor_kamar;
        this.jenis_kamar = jenis_kamar;
        this.ketersediaan = ketersediaan;
    }

    public void setNomorKamar(String nomor_kamar) {
        this.nomor_kamar = nomor_kamar;
    }

    public void setDetailKamar(String jenis_kamar) {
        this.jenis_kamar = jenis_kamar;
    }

    public void setKetersediaan(String ketersediaan) {
        this.ketersediaan = ketersediaan;
    }

    public String getNomorKamar() {
        return nomor_kamar;
    }

    public String getJenisKamar() {
        return jenis_kamar;
    }
//
    public String getKetersediaan() {
        return ketersediaan;
    }
    
    
}