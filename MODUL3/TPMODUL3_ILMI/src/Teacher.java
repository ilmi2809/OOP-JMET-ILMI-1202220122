public class Teacher extends User {

    public Teacher(String name, int id) {
        super(name, id);
    }

    @Override
    public String getUserDetail() {
        return null;
        
    }

    public void teachClass(String course) {
        System.out.println("\nPak Yoga is teaching " + course);
    }
    
}