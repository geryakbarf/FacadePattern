/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peminjamanbarang;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author gerya
 */
public class PenyewaanTableModel extends AbstractTableModel {

    private ArrayList<Object> data;
    private String[] namaField = {"ID Penyewaan","ID Penyewa", "Nama Penyewa", "Alamat","Nomor Kontak","Tanggal Sewa","Tanggal Pengembalian"
    ,"Tanggal Dikembalikan","Total Biaya Sewa","Status","Penanggung Jawab"};

    public void setData(ArrayList<Object> dt) {
        this.data = dt;
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return namaField.length;
    }

    @Override
    public String getColumnName(int column) {
        return namaField[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        PenyewaanData b = (PenyewaanData) data.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return b.getId();
            case 1:
                return b.getIdPenyewa();
            case 2:
                return b.getPenyewa();
            case 3:
                return b.getAlamat();
            case 4:
                return b.getKontak();
            case 5:
                return b.getTglSewa();
            case 6:
                return b.getTglkembali();
            case 7:
                return b.getTglDikembalikan();
            case 8:
                return b.getTotal();
            case 9:
                return b.getStatus();
                case 10:
                return b.getPenanggungJawab();
            default:
                return null;
        }
    }

}
