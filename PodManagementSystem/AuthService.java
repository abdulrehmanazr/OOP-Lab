import java.util.*;

public class AuthService {
    private ArrayList<User> users = new ArrayList<>();
    private User currentUser;

    public boolean signUp(String username, String password, String role) {
        for (User u : users) {
            if (u.getUsername().equals(username))
                return false;
        }

        if (role.equalsIgnoreCase("ADMIN")) {
            users.add(new Admin(username, password));
        } else {
            users.add(new Student(username, password));
        }
        return true;
    }

    public boolean login(String username, String password) {
        for (int i = 0; i < users.size(); i++) {
            User u = users.get(i);
            if (u.getUsername().equals(username) && u.checkPassword(password)) {
                currentUser = u;
                return true;
            }
        }
        return false;
    }

    public void logout() {
        currentUser = null;
    }

    public User getCurrentUser() {
        return currentUser;
    }
}
