public class MainApp {
    public static void main(String[] args){
        
        // TO DO: Create expedisi Object from Ekspedisi Class
        Ekspedisi ekspedisi1 = new Ekspedisi(10, "Jakarta", 1000);
        ekspedisi1.informasi();
        System.out.println();

        // TO DO: Create teluexpress Object from TelUExpress Class
        FRIExpress ekspedisi2 = new FRIExpress(30, "Bojongsoang", 50000, false);
        ekspedisi2.informasi();
        ekspedisi2.terima(2000);
        ekspedisi2.kirim("Lembang");
        ekspedisi2.kirim("Braga", "Rancaekek");
        System.out.println();

        // TO DO: Create friexpress Object from FRIExpress Class
        TelUExpress ekspedisi3 = new TelUExpress(100, "Bandung", 50000, true);
        ekspedisi3.informasi();
        ekspedisi3.ambil("Sukabirus");
        ekspedisi3.antar(1628389);
        ekspedisi3.antar(1922722, 7628262);
        System.out.println();

    }
}
