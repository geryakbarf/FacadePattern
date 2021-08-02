/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peminjamanbarang;

/**
 *
 * @author gerya
 */
public class PenyewaanData {
    String id;
    String idPenyewa;
    String penyewa;
    String alamat;
    String kontak;
    String tglSewa;
    String tglkembali;
    String tglDikembalikan;
    int total;
    String status;
    String penanggungJawab;

    public String getIdPenyewa() {
        return idPenyewa;
    }

    public void setIdPenyewa(String idPenyewa) {
        this.idPenyewa = idPenyewa;
    }
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPenyewa() {
        return penyewa;
    }

    public void setPenyewa(String penyewa) {
        this.penyewa = penyewa;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKontak() {
        return kontak;
    }

    public void setKontak(String kontak) {
        this.kontak = kontak;
    }

    public String getTglSewa() {
        return tglSewa;
    }

    public void setTglSewa(String tglSewa) {
        this.tglSewa = tglSewa;
    }

    public String getTglkembali() {
        return tglkembali;
    }

    public void setTglkembali(String tglkembali) {
        this.tglkembali = tglkembali;
    }

    public String getTglDikembalikan() {
        return tglDikembalikan;
    }

    public void setTglDikembalikan(String tglDikembalikan) {
        this.tglDikembalikan = tglDikembalikan;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPenanggungJawab() {
        return penanggungJawab;
    }

    public void setPenanggungJawab(String penanggungJawab) {
        this.penanggungJawab = penanggungJawab;
    }
    
    public PenyewaanData(String id,String idPenyewa, String nama, String alamat, String kontak, String tglSewa, String tglKembali, 
            String tglDikembalikan, int total, String status, String admin){
        setId(id);
        setIdPenyewa(idPenyewa);
        setPenyewa(nama);
        setAlamat(alamat);
        setKontak(kontak);
        setTglSewa(tglSewa);
        setTglkembali(tglKembali);
        setTglDikembalikan(tglDikembalikan);
        setTotal(total);
        setStatus(status);
        setPenanggungJawab(admin);
        
    }
    
}
