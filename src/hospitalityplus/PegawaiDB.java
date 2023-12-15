/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalityplus;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import db.DBHelper;

public class PegawaiDB {
    private final Connection CONN;
    
    public PegawaiDB(){
        this.CONN = DBHelper.getConnection();
    }
    
    //add Pegawai
    public void addPegawai(Pegawai pegawai){
        String insert = "INSERT INTO `pelanggan` VALUES ('" + pegawai.getIdPegawai() + "','" + pegawai.getNama() +"','" + "')";
        
        System.out.println(insert);
        
        try {
            if (CONN.createStatement().executeUpdate(insert) > 0) {
                System.out.println("Berhasil memasukkan pegawai");
            } else {
                System.out.println("Gagal memasukkan pegawai");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PelangganDB.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal memasukkan pegawai");
        }
    }
    
    //getPegawai
    public ArrayList<Pegawai> getPegawai() {
        String query = "SELECT * FROM `Pegawai`";
        ArrayList<Pegawai> listPegawai = new ArrayList<>();
        
        try {
            ResultSet rs = CONN.createStatement().executeQuery(query);
           
            while(rs.next()) {
                Pegawai temp = new Pegawai(rs.getInt("id_pegawai"), rs.getString("nama_pegawai"), rs.getString("jabatan"));
                listPegawai.add(temp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PegawaiDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listPegawai;
    }
    
    
    //update Pegawai
    public void updatePegawai(int id, Pegawai pegawai) {
        String update = "UPDATE `pegawai` SET `nama_pegawai` ='" + pegawai.getNama() + "' WHERE id_pegawai ='" + id + "'";
        System.out.println(update);
        
        try {
            if (CONN.createStatement().executeUpdate(update) > 0) {
                System.out.println("Berhasil mengubah pegawai");
            } else {
                System.out.println("Gagal mengubah pegawai");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PegawaiDB.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal mengubah pegawai");
        }
    }
    
    
    //delete Pegawai
    public void deletePegawai(int id) {
        String delete = "DELETE FROM `pegawai` WHERE idPegawai ='" + id + "'";
        System.out.println(delete);
        
        try {
            if (CONN.createStatement().executeUpdate(delete) > 0) {
                System.out.println("Berhasil menghapus nama pegawai");
            } else {
                System.out.println("Gagal menghapus nama pegawai");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PegawaiDB.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal menghapus nama pegawai ");
        }
    }
}