/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalityplus;

public class kamar {
    private String nomorKamar;
    private String jenisKamar;
    private String ketersediaan;

    public kamar(String nomorKamar, String jenisKamar, String ketersediaan) {
        this.nomorKamar = nomorKamar;
        this.jenisKamar = jenisKamar;
        this.ketersediaan = ketersediaan;
    }
    
    public kamar(String nomorKamar, String jenisKamar) {
        this.nomorKamar = nomorKamar;
        this.jenisKamar = jenisKamar;
    }
    
    public kamar(String nomorKamar){
        this.nomorKamar = nomorKamar;
    }
    
    public void setNomorKamar(String nomorKamar) {
        this.nomorKamar = nomorKamar;
    }

    public void setDetailKamar(String jenisKamar) {
        this.jenisKamar = jenisKamar;
    }

    public void setKetersediaan(String ketersediaan) {
        this.ketersediaan = ketersediaan;
    }

    public String getNomorKamar() {
        return nomorKamar;
    }

    public String getJenisKamar() {
        return jenisKamar;
    }
//
    public String getKetersediaan() {
        return ketersediaan;
    }
    
    
}