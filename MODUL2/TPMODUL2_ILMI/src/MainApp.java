public class MainApp {
    public static void main(String[] args) throws Exception {
        Kendaraan kendaraan = new Kendaraan("123", 120.0, 5);
        
        Bus bus = new Bus("456", 80.0, 30, 50);
        
        Mobil mobil = new Mobil("789", 150.0, 4, 4);
        
        System.out.println("Kendaraan Information:\n" + kendaraan.toString() + "\n");
        System.out.println("Bus Information:\n" + bus.toString() + "\n");
        System.out.println("Mobil Information:\n" + mobil.toString());
    }
}
