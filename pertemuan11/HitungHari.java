/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan11;

/**
 *
 * @author iqbal
 */
public class HitungHari {
    private int tahun;
    private String bulan;
    
    public HitungHari(int tahun, String bulan) {
        this.tahun = tahun;
        this.bulan = bulan;
    }
    
    public String hitung() {
        int jumlahHari = 0;
        
        switch(bulan) {
            case "Januari":
            case "Maret":
            case "Mei":
            case "Juli":
            case "Agustus":
            case "Oktober":
            case "Desember":
                jumlahHari = 31;
                break;
            case "April":
            case "Juni":
            case "September":
            case "November":
                jumlahHari = 30;
                break;
            case "Februari":
                // Cek tahun kabisat
                if ((tahun % 4 == 0 && tahun % 100 != 0) || tahun % 400 == 0) {
                    jumlahHari = 29;
                } else {
                    jumlahHari = 28;
                }
                break;
        }
        
        return String.format("Jumlah hari pada bulan %s tahun %d adalah %d hari", bulan, tahun, jumlahHari);
    }
}