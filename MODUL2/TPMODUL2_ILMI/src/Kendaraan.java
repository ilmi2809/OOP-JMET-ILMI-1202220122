public class Kendaraan {
    private String nomorIdentifikasi;
    private double kecepatanMaksimum;
    private int kapasitasPenumpang;

    public Kendaraan(String nomorIdentifikasi, double kecepatanMaksimum, int kapasitasPenumpang){
        this.nomorIdentifikasi = nomorIdentifikasi;
        this.kecepatanMaksimum = kecepatanMaksimum;
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    public String toString(){
        return "Nomor Identifikasi: "+this.nomorIdentifikasi+"\nKecepatan Maksimum: "+ this.kecepatanMaksimum +" km/jam\nKapasitas Penumpang: "+ this.kapasitasPenumpang +" orang";
    }

    public double hitungWaktuTempuh(double jarak){
        return jarak/this.kecepatanMaksimum;
    }
}