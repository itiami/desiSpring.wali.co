package co.wali.desisoft.user;

public class AdminUser extends User {
    public AdminUser(String name) {
        super(name);
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Admin");
    }
}