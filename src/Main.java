import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // TODO: Create Database Object


        // TODO: Create Konser Object and Set the Attributes


        // TODO: Insert Konser Object to Database


        // TODO: Display Greeting Message and Prompt User to Register
        System.out.println("Selamat Datang di Konser EAD");
        System.out.println("Silahkan Register Terlebih Dahulu");
        System.out.println("=================================");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama: ");
        String nama = scanner.next();
        System.out.print("No Handphone: ");
        int noHp = scanner.nextInt();
        System.out.println("=================================");
        System.out.println("Register Berhasil");
        System.out.println("Nama: " + nama);
        System.out.println("Nama: " + noHp);
        System.out.println("=================================");

        // TODO: Create a User Object and Set the Attributes


        // TODO: Display Main Menu and Prompt User to Choose Menu
        System.out.println("1. Lihat Konser");
        System.out.println("2. Beli Tiket");
        System.out.println("3. Keluar");
        System.out.println("=================================");
        System.out.print("Silahkan Pilih Menu: ");
        int angka = scanner.nextInt();
        

        scanner.close();
    }
}
