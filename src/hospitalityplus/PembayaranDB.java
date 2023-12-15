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

public class PembayaranDB {
    private final Connection CONN;
    
    public PembayaranDB(){
        this.CONN = DBHelper.getConnection();
    }
    
    //add Pemesanan
    public void addPembayaran(Pembayaran pembayaran){
        String insert = "INSERT INTO `pemabayaran` VALUES ('" + pembayaran.getIdPembayaran() + "','" + pembayaran.getJumlah()+"','" + pembayaran.getTanggalPembayaran()+"','" + pembayaran.getMetodePembayaran()+"','" + pembayaran.getStatusPembayaran()+"')'";
        
        System.out.println(insert);
        
        try {
            if (CONN.createStatement().executeUpdate(insert) > 0) {
                System.out.println("Berhasil menambahkan pemesanan");
            } else {
                System.out.println("Gagal menambahkan pemesanan");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PemesananDB.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal menambahkan pemesanan");
        }
    }
    
     //get Pembayaran
    public ArrayList<Pembayaran> getPembayaran() {
        String query = "SELECT * FROM `Pembayaran`";
        ArrayList<Pembayaran> listPembayaran = new ArrayList<>();
        
        try {
            ResultSet rs = CONN.createStatement().executeQuery(query);
           
            while(rs.next()) {
                Pembayaran temp = new Pembayaran(rs.getInt("id_pembayaran"), rs.getDouble("jumlah"), rs.getString("tanggal_pembayaran"), rs.getString("metode_pembayaran"), rs.getString("status_pembayaran"));
                listPembayaran.add(temp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PemesananDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listPembayaran;
    }
    
    //update Pembayaran
    public void updatePembayaran(int id, Pembayaran pembayaran) {
        String update = "UPDATE `pembayaran` SET `statusPembayaran` ='" + pembayaran.getStatusPembayaran() +"'  WHERE idPembayaran ='" + id + "'";
        System.out.println(update);
        
        try {
            if (CONN.createStatement().executeUpdate(update) > 0) {
                System.out.println("Berhasil mengubah status pembayaran");
            } else {
                System.out.println("Gagal mengubah status pembayaran");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PembayaranDB.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal mengubah pembayaran");
        }
    }
    
     
    //delete Pembayaran
     public void deletePembayaran(int id) {
        String delete = "DELETE FROM `pembayaran` WHERE idPembayaran='" + id + "'";
        System.out.println(delete);
        
        try {
            if (CONN.createStatement().executeUpdate(delete) > 0) {
                System.out.println("Berhasil menghapus pembayaran");
            } else {
                System.out.println("Gagal menghapus pembayaran");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PembayaranDB.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal menghapus pembayaran");
        }
    }
}