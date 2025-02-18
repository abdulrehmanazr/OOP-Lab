import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a byte value: ");
        byte byteValue = input.nextByte();
        
        System.out.print("Enter a short value: ");
        short shortValue = input.nextShort();
        
        System.out.print("Enter an int value: ");
        int intValue = input.nextInt();
        
        System.out.print("Enter a long value: ");
        long longValue = input.nextLong();
        
        System.out.print("Enter a float value: ");
        float floatValue = input.nextFloat();
        
        System.out.print("Enter a double value: ");
        double doubleValue = input.nextDouble();
        
        System.out.print("Enter a char value: ");
        char charValue = input.next().charAt(0);
        
        System.out.print("Enter a boolean value (true/false): ");
        boolean booleanValue = input.nextBoolean();
        
        input.nextLine(); 
        System.out.print("Enter a String value: ");
        String stringValue = input.nextLine();
        
        System.out.println("\nEntered Values:");
        System.out.println("Byte: " + byteValue);
        System.out.println("Short: " + shortValue);
        System.out.println("Int: " + intValue);
        System.out.println("Long: " + longValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Char: " + charValue);
        System.out.println("Boolean: " + booleanValue);
        System.out.println("String: " + stringValue);
        
        input.close();
    }
}
