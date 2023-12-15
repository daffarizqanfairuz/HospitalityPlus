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

public class kamarDB {
    
    private final Connection CONN;
    
    public kamarDB(){
        this.CONN = DBHelper.getConnection();
    }
    
    //add kamar
    public void addKamar(kamar Kamar){
        String insert = "INSERT INTO `kamar` VALUES (" + Kamar.getNomorKamar() + ",'" +  Kamar.getJenisKamar() + "','" + Kamar.getKetersediaan() + "')";
        
        System.out.println(insert);
        
        try {
            if (CONN.createStatement().executeUpdate(insert) > 0) {
                System.out.println("Berhasil memasukkan data kamar");
            } else {
                System.out.println("Gagal memasukkan data kamar");
            }
        } catch (SQLException ex) {
            Logger.getLogger(kamarDB.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal memasukkan data kamar");
        }
    }
    
     //get Pemesanan Kamar
    public ArrayList<kamar> getKamar() {
        String query = "SELECT * FROM `kamar`";
        ArrayList<kamar> kmr = new ArrayList();
        
        try {
            ResultSet rs = CONN.createStatement().executeQuery(query);
           
            while(rs.next()) {
                kamar temp = new kamar(rs.getString("nomor_kamar"), rs.getString("jenis_kamar"), rs.getString("ketersediaan"));
                kmr.add(temp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PemesananDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return kmr;
    }
    
    
    //update Kamar
    public void updateKamar(int id, kamar Kamar) {
        String update = "UPDATE `kamar` SET `ketersediaan` = '"+ Kamar.getKetersediaan() +"' WHERE kamar.nomor_kamar = '" + id + "'";
        System.out.println(update);
        
        try {
            if (CONN.createStatement().executeUpdate(update) > 0) {
                System.out.println("Berhasil mengubah ketersediaan kamar");
            } else {
                System.out.println("Gagal mengubah ketersediaan kamar");
            }
        } catch (SQLException ex) {
            Logger.getLogger(kamarDB.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal mengubah ketersediaan kamar");
        }
    }
    
    //delete Pemesanan Kamar
    public void deleteKamar(int id) {
        String delete = "DELETE FROM `kamar` WHERE idKamar ='" + id + "'";
        System.out.println(delete);
        
        try {
            if (CONN.createStatement().executeUpdate(delete) > 0) {
                System.out.println("Berhasil menghapus pemesanan kamar");
            } else {
                System.out.println("Gagal menghapus pemesanan kamar");
            }
        } catch (SQLException ex) {
            Logger.getLogger(kamarDB.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal menghapus pemesanan ");
        }
    }
}