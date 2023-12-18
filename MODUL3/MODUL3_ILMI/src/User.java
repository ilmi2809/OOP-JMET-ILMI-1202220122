public class User {
   
   
   // TO DO: Create Private Attributes of User (nama, noHandphone)
   public static String nama;
   public static String noHandphone;

   // TO DO: Create Constructor of User
   public void setName(String nama) {
      this.nama = nama;
      }

   public void setNoHandPhone(String phoneNumber) {
      this.noHandphone = noHandphone;
      }
   // TO DO: Create register Method to show information about name and phone number
   public static void register(){
      System.out.println("Registrasi Berhasil");   
      System.out.println("Nama: " + nama);
      System.out.println("No Handphone: " + noHandphone);
    }
   // TO DO: Create method to return name and phone number
   public String getName(){
     return nama;
  }

   public String getnoHandPhone(){
     return noHandphone;
  }
}






  