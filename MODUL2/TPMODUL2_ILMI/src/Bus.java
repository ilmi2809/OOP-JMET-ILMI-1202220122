public class Bus extends Kendaraan {
    public int jumlahKursi;

    public Bus(String nomorIdentifikasi, double kecepatanMaksimum, int kapasitasPenumpang, int jumlahKursi){
        super(nomorIdentifikasi, kecepatanMaksimum, kapasitasPenumpang);
        this.jumlahKursi = jumlahKursi;
    }

    @Override
    public String toString(){
        return super.toString() + "\nJumlah Kursi: "+ this.jumlahKursi +"\n\nWaktu Tempuh dengan mobil: "+ super.hitungWaktuTempuh(200);
    }
}