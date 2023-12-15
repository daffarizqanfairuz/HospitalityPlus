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

public class PelangganDB {
    private final Connection CONN;
    
    public PelangganDB(){
        this.CONN = DBHelper.getConnection();
    }
    
    
    //addPelanggan
    public void addPelanggan(Pelanggan pelanggan){
        String insert = "INSERT INTO `pelanggan` VALUES ('" + pelanggan.getIdPelanggan() + "','" + pelanggan.getNama_pelanggan() +"','";
        
        System.out.println(insert);
        
        try {
            if (CONN.createStatement().executeUpdate(insert) > 0) {
                System.out.println("Berhasil memasukkan pelanggan");
            } else {
                System.out.println("Gagal memasukkan pelanggan");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PelangganDB.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal memasukkan pelanggan");
        }
    }
    
    //getPelanggan
    public ArrayList<Pelanggan> getPelanggan() {
        String query = "SELECT * FROM `pelanggan`";
        ArrayList<Pelanggan> listPelanggan = new ArrayList<>();
        
        try {
            ResultSet rs = CONN.createStatement().executeQuery(query);
           
            while(rs.next()) {
                Pelanggan temp = new Pelanggan(rs.getInt("idPelanggan"), rs.getString("nama_pelanggan"));
                listPelanggan.add(temp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PelangganDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listPelanggan;
    }
    
    //update Pelanggan
    public void updatePelanggan(int id, Pelanggan pelanggan) {
        String update = "UPDATE `pelanggan` SET `idPelanggan`='" + pelanggan.getNama_pelanggan()+ "',`email_pelanggan`='";
        System.out.println(update);
        
        try {
            if (CONN.createStatement().executeUpdate(update) > 0) {
                System.out.println("Berhasil mengubah pelanggan");
            } else {
                System.out.println("Gagal mengubah pelanggan");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PelangganDB.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal mengubah pelanggan");
        }
    }
    
    //delete Pelanggan
    public void deletePelanggan(int id) {
        String delete = "DELETE FROM `pelanggan` WHERE id_pelanggan='" + id + "'";
        System.out.println(delete);
        
        try {
            if (CONN.createStatement().executeUpdate(delete) > 0) {
                System.out.println("Berhasil menghapus pelanggan");
            } else {
                System.out.println("Gagal menghapus pelanggan");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PelangganDB.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal menghapus pelanggan");
        }
    }
}