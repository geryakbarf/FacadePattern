/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peminjamanbarang;

import java.util.ArrayList;

/**
 *
 * @author gerya
 */
public class FacadeClass {
    private BasisData barang;
    private BasisData penyewa;
    private BasisData penyewaan;
    private BasisData detialPenyewaan;
    
    public FacadeClass(){
        barang = new Barang();
        penyewa = new Penyewa();
        penyewaan = new Penyewaan();
        detialPenyewaan = new DetailPenyewaan();
    }
    
    public void tambahBarang(ArrayList<String> list){
       barang.tambahData(list);
    }
    
    public ArrayList<Object> lihatBarang(){
        return barang.lihatData();
    }
    
    public void tambahPenyewa(ArrayList<String> list){
        penyewa.tambahData(list);
    }
    
    public void tambahPenyewaan(ArrayList<String> list){
        penyewaan.tambahData(list);
    }
    
    public ArrayList<Object> lihatPenyewaan(){
        return penyewaan.lihatData();
    }
    
    public void tambahDetailPenyewaan(ArrayList<String> list){
        detialPenyewaan.tambahData(list);
    }
}
