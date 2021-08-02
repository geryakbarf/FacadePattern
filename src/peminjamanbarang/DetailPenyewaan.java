/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peminjamanbarang;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author gerya
 */
public class DetailPenyewaan implements BasisData{

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
            sql = "INSERT INTO detail_penyewaan VALUES ('" + list.get(0) + "','"
                    + list.get(1) + "','" + list.get(2) + "','"
                    + list.get(3) + "'*'"
                    + list.get(4) + "')";
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
