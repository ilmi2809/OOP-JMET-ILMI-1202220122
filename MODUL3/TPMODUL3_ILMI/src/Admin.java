public class Admin extends User {

    public Admin(String name, int id) {
        super(name, id);
    }

    @Override
    public String getUserDetail() {
        return super.getUserDetail();
    }

    public void manageSystem(String course){
        System.out.println("Pak Hudza is teaching " + course);
    }
    
}