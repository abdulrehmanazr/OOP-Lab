import java.util.Scanner;

class StudentInfo {
    private String username = "admin";  
   private String password = "12345";  
    public boolean checkLogin(String user, String pass) {
        return user.equals(username) && pass.equals(password);
    }
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentInfo student = new StudentInfo();  

        System.out.print("Enter Username: ");
        String inputUsername = scanner.nextLine();

        System.out.print("Enter Password: ");
        String inputPassword = scanner.nextLine();

          if (student.checkLogin(inputUsername, inputPassword)) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Login Failed! Incorrect Username or Password.");
        }

        scanner.close();     }


}


    