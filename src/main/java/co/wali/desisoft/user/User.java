package co.wali.desisoft.user;

public abstract class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public abstract void displayRole(); // Abstract method

    // Common functionality for all users
    public void printDetails() {
        System.out.println("User: " + name);
    }
}


