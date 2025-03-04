package banking_system.authentication;

import banking_system.validation.pinValidator;

public class registeredUser {
    private final String account_number = "718191;
    private final String pin_no = "0000";

    // Non-static inner class for PIN validation
    public class pinValidator {
        public boolean validate(String accountNumber, String pin) {
            if (pin.length() == 4 && pin.matches("\\d+")) { // Check if PIN is 4 digits
                if (account_number.equals(accountNumber) && pin_no.equals(pin)) {
                    System.out.println("Login Successful! ✅");
                    return true;
                } else {
                    System.out.println("Login Failed!");
                    return false;
                }
            } else {
                System.out.println("Invalid PIN Format! PIN must be exactly 4 digits.");
                return false;
            }
        }
    }
}
