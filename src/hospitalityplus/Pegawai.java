/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalityplus;


public class Pegawai {
    private int idPegawai;
    private String namaPegawai;
    private String jabatan;

    public Pegawai(int idPegawai, String namaPegawai, String jabatan) {
        this.idPegawai = idPegawai;
        this.namaPegawai = namaPegawai;
        this.jabatan = jabatan;
    }

    public void setIdPegawai(int idPegawai) {
        this.idPegawai = idPegawai;
    }

    public void setNama(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }

    public int getIdPegawai() {
        return idPegawai;
    }

    public String getNama() {
        return namaPegawai;
    }

    public String getNamaPegawai() {
        return namaPegawai;
    }

    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    
    
    
}
