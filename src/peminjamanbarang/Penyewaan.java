/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peminjamanbarang;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import static peminjamanbarang.BasisData.driver;
import static peminjamanbarang.BasisData.pass;
import static peminjamanbarang.BasisData.url;
import static peminjamanbarang.BasisData.user;

/**
 *
 * @author gerya
 */
public class Penyewaan implements BasisData{

    @Override
    public void tambahData(ArrayList<String> list) {
     Connection konek = null;
        Statement stmt = null;
        String nip = "PEG01";
        try {
            Class.forName(driver);
            konek = DriverManager.getConnection(url, user, pass);
            stmt = konek.createStatement();
            String sql;
            sql = "INSERT INTO penyewaan VALUES ('" + list.get(0) + "','"
                    + list.get(1) + "','" + list.get(2) + "','" + list.get(3) + "'"
                    + ",'-',0,'Belum Dikembalikan','" + nip + "')";
            stmt.executeUpdate(sql);
        } catch (Exception a) {
            System.out.println("Error : " + a.getMessage());
        } finally {
            try {
                stmt.close();
            } catch (Exception e) {
            }
            try {
                konek.close();
            } catch (Exception e) {
            }
        } 
    }

    @Override
    public ArrayList<Object> lihatData() {
     ArrayList<Object> list = new ArrayList<Object>();
        Connection konek = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            konek = DriverManager.getConnection(url, user, pass);
            stmt = konek.createStatement();
            String sql;
            sql = "SELECT penyewaan.no_penyewaan,penyewa.id_penyewa, penyewa.nama, penyewa.alamat, penyewa.no_tlp, penyewaan.tgl_sewa, "
                    + "penyewaan.tgl_pengembalian, penyewaan.tgl_dikembalikan, penyewaan.total_biaya_sewa, penyewaan.status, "
                    + "admin.nama FROM penyewa JOIN penyewaan ON penyewa.id_penyewa=penyewaan.id_penyewa "
                    + "JOIN admin ON penyewaan.penanggung_jawab=admin.nip ";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                list.add(new PenyewaanData(rs.getString("no_penyewaan"),rs.getString("id_penyewa"),rs.getString("nama"), rs.getString("alamat"),
                rs.getString("no_tlp"),rs.getString("tgl_sewa"),rs.getString("tgl_pengembalian"),rs.getString("tgl_dikembalikan"),
                rs.getInt("total_biaya_sewa"),rs.getString("status"),rs.getString("nama")));
            }//endwhile
            rs.close();
        }//endtry
        catch (Exception a) {
            System.out.println("Error : " + a.getMessage());
        }//endcatch
        finally {
            try {
                stmt.close();
            } catch (Exception e) {
            }
            try {
                konek.close();
            } catch (Exception e) {
            }
        }
        return list;     }
    
}
