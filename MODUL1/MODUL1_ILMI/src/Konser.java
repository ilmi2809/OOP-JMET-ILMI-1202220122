public class Konser {
    // TODO: Create Private Attribute of Konser (Band Name, Date, Location, Ticket Price) then Create Setter and Getter
    String namaBand;   
    String date;
    String lokasi;
    float hargaTiket;

    public Konser(String namaBand, String date, String lokasi, float hargaTiket){
        this.namaBand = namaBand;
        this.date = date;
        this.lokasi = lokasi;
        this.hargaTiket = hargaTiket;
    }

    public String getNamaBand(){
        return namaBand;
    }

    public String getDate(){
        return date;
    }
    
    public String getLokasi(){
        return lokasi;
    }
    
    public float getHargaTiket(){
        return hargaTiket;
    }

}