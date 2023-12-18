import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        // TO DO : Create a Scanner object to receive input from the user
        Scanner scanner = new Scanner(System.in);

        // TO DO : Create Bioskop and Cashier objects]
        Bioskop bioskop1 = new Bioskop();
        User user1 = new User();
        Cashier cashier1 = new Cashier();
        
        // TO DO : Take the name from the user, make sure it is not empty
        System.out.println("=====Silahkan Register=====");
        System.out.print("Masukan Nama          : ");
        String nama = scanner.nextLine();
        user1.setName(nama);
        
        // TO DO : Take the phone number from the user, make sure it is valid
        System.out.print("Masukan Nomor Telepon : ");
        String phoneNumber = scanner.nextLine();
        user1.setNoHandPhone(phoneNumber);
        User.register();

        // TO DO : Create a code for ticket order
        
        
        // TO DO : Create a exception if user enter not number

        // TO DO : Create a exception if user enter number is out of range

        // TO DO : Call the method to reserve seats in the cinema

        // TO DO : Close the Scanner object when the user is finished  
        scanner.close(); 
    }
}