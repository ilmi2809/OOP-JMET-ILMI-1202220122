public class Bioskop {
    
    // TO DO: Create Private Attributes of rows and assign rows to 5
    protected static int rows = 5;

    // TO DO: Create Private Attributes of seats per rows and assign seats per rows to 10
    protected static int seatPerRows = 10;

    // TO DO: Create 2 dimensional array to store seat reservation status
    int[][] seats = new int[rows][seatPerRows];

    // TO DO:  Add a constructor to initialize multiple chairs
    public Bioskop() {
       seats[0][2] = 1;
       seats[1][5] = 1;
       seats[3][7] = 1;
    }
    //  TO DO: Add a method to display the seat layout
    public void displaySeating() {
        int value = 0;
        for (int a = 0; a < rows; a++){
            for ( int b = 0; b < seatPerRows; b++){
                seats[a][b] = value;
            }
        }
    }
    //  TO DO: Add a method to reserve seats
    public void bookSeat(int row, int seat) {
        if (seats[rows][seatPerRows] == 0){
            seats[rows][seatPerRows] = 1;
            System.out.println("Kursi Berhasil Dipesan" + rows + seatPerRows);
        }else{
            System.out.println("Error " + rows + seatPerRows + "sudah dipesan");
        }
    }
}