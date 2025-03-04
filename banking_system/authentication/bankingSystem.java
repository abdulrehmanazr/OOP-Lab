package banking_system.authentication;

import banking_system.validation.pinValidator;
import banking_system.authentication.registeredUser;

public class bankingSystem {
    // Static inner class for login handling
    public static class loginHandler {
        public static boolean login() {
            java.io.Console console = System.console(); // Secure input using console
            if (console == null) {
                System.out.println("Console not available.");
                return false;
            }

            System.out.print("Enter Account Number: ");
            String accountNumber = console.readLine();

            System.out.print("Enter PIN: ");
            char[] pinChars = console.readPassword(); // Secure PIN input
            String pin = new String(pinChars);

            // Validate credentials
            registeredUser user = new registeredUser();
            pinValidator validator = user.new pinValidator();

            return validator.validate(accountNumber, pin);
        }
    }
}
