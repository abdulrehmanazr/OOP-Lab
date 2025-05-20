package model;

public class Student extends User {
    public Student(String username, String password) {
        super(username, password);
    }

    @Override
    public String getRole() {
        return "STUDENT";
    }
}
