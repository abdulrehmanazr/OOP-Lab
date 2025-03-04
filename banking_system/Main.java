package banking_system;

import banking_system.authentication.bankingSystem;

public class Main {
    public static void main(String[] args) {
        if (bankingSystem.loginHandler.login()) {
            System.out.println("Access Granted!");
        } else {
            System.out.println("Access Denied. Please try again.");
        }
    }
}


