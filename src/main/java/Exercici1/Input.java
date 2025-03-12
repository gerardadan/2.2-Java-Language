package Exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    static Scanner scanner = new Scanner(System.in);
    static final String errorMessage = "Error: the value is not a ";
    
    public static byte readByte(String message) {
        while (true){
            try {
                printMessage(message);
                byte value = scanner.nextByte();
                scanner.nextLine();

                return value;
            } catch (InputMismatchException e) {
                printMessage(errorMessage + "byte");
                scanner.nextLine();
            }
        }
    }

    public static int readInt(String message) {
        while (true){
            try {
                printMessage(message);
                int value = scanner.nextInt();
                scanner.nextLine();

                return value;
            } catch (InputMismatchException e) {
                printMessage(errorMessage + "Int");
                scanner.nextLine();
            }
        }
    }

    public static float readFloat(String message) {
        while (true){
            try {
                printMessage(message);
                float value = scanner.nextFloat();
                scanner.nextLine();

                return value;
            } catch (InputMismatchException e) {
                printMessage(errorMessage + "Float");
                scanner.nextLine();
            }
        }
    }

    public static double readDouble(String message) {
        while (true){
            try {
                printMessage(message);
                double value = scanner.nextDouble();
                scanner.nextLine();

                return value;
            } catch (InputMismatchException e) {
                printMessage(errorMessage + "Double");
                scanner.nextLine();
            }
        }
    }

    public static char readChar(String message) {
        while (true){
            try {
                printMessage(message);
                String value = scanner.next();
                if(value.length() > 1)
                    throw new Exception("Value out of range");
                scanner.nextLine();

                return value.charAt(0);
            } catch (Exception e) {
                printMessage(errorMessage + "Char");
                scanner.nextLine();
            }
        }
    }

    public static String readString(String message) {
        while (true){
            try {
                printMessage(message);
                String value = scanner.next();
                if(value.isEmpty())
                    throw new Exception("Empty value");
                scanner.nextLine();

                return value;
            } catch (Exception e) {
                printMessage(errorMessage + "String");
                scanner.nextLine();
            }
        }
    }

    public static Boolean readBoolean(String message) {
        while (true){
            try {
                printMessage(message);
                Boolean value = scanner.nextBoolean();
                scanner.nextLine();

                return value;
            } catch (Exception e) {
                printMessage(errorMessage + "Boolean");
                scanner.nextLine();
            }
        }
    }

    public static Boolean readCustomBoolean(String message) {
        while (true){
            try {
                char charValue = readChar(message);
                if(charValue == 's'){
                    return true;
                } else if (charValue != 'n') {
                    throw new Exception("Please respond with 's' for True or 'n' for False");
                }
            } catch (Exception e) {
                printMessage(e.getMessage());
            }
        }
    }
    
    private static void printMessage(String message) {
        System.out.println(message);
    }

    public static void close() {
        if (scanner != null) {
            scanner.close();
            printMessage("Scanner closed.");
        }
    }

}
