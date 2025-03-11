package Exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Input.readByte("Set byte");
        readChar("Set letter");

        Input.close();
        System.out.println("Fin");
    }

    public static int readInt(String message) {
        try {
            return Input.readInt(message);
        } catch (InputMismatchException ime) {
            System.out.println("Error Int");
            Input.scanner.nextLine();
            return readInt(message);
        }
    }

    public static double readDouble(String message) {
        try {
            return Input.readDouble(message);
        } catch (InputMismatchException ime) {
            System.out.println("Error double");
            Input.scanner.nextLine();
            return readDouble(message);
        }
    }

    public static float readFloat(String message) {
        try {
            return Input.readFloat(message);
        } catch (InputMismatchException ime) {
            System.out.println("Error Float");
            Input.scanner.nextLine();
            return readFloat(message);
        }
    }

    public static char readChar(String message) {
        try {
            return Input.readChar(message);
        } catch (Exception e) {
            System.out.println("Error char");
            Input.scanner.nextLine();
            return readChar(message);
        }
    }

    public static String readString(String message) {
        try {
            return Input.readString(message);
        } catch (Exception e) {
            System.out.println("Error String");
            Input.scanner.nextLine();
            return readString(message);
        }
    }

    public static boolean readBoolean(String message) {
        try {
            return Input.readBoolean(message);
        } catch (Exception e) {
            System.out.println("Error boolean");
            Input.scanner.nextLine();
            return readBoolean(message);
        }
    }

}