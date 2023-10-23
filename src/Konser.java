public class Konser {
    // TODO: Create Private Attribute of Konser (Band Name, Date, Location, Ticket Price) then Create Setter and Getter
    String namaBand;   
    int date;
    String lokasi;
    int hargaTiket;

    public Konser(String namaBand, int date, String lokasi, int hargaTiket){
        this.namaBand = namaBand;
        this.date = date;
        this.lokasi = lokasi;
        this.hargaTiket = hargaTiket;
    }

    public String getNamaBand(){
        return namaBand;
    }

    public int getDate(){
        return date;
    }
    
    public String getLokasi(){
        return lokasi;
    }
    
    public int getHargaTiket(){
        return hargaTiket;
    }

}