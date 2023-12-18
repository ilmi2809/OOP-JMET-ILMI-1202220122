public class Cashier extends Bioskop {
    boolean isBooked = false;

    // TO DO : Create a method to print ticket
    public void printTicket(User user) {
        for (int a = 0; a < super.seats.length; a++){
            for ( int b = 0; b < super.seats[a].length; b++){
                if (!(a == 0 && b == 2) || (a == 1 && b == 5) || (a == 3 && b == 7)){
                    System.out.println("Mencetak Tiket...");
                    System.out.println("======================");
                    System.out.println("Nama   : " + User.nama);
                    System.out.println("phone  : " + User.noHandphone);
                    System.out.println("Seat   : " + Bioskop.rows + Bioskop.seatPerRows);
                    System.out.println("======================");
                    System.out.println("Selamat Menonton");
                }
            }
        }
    }

}

